package cn.com.mcopy.util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.eclipse.jetty.util.resource.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ucenter on 2016/11/17.
 */

public class FileUtil {

    private static Logger logger = LoggerFactory.getLogger(FileUtil.class);

    /**
     * 批量上传文件
     *
     * @param files
     */
    public static String[] uploadFiles(String[] files) throws IOException {
        logger.info("上传图片保存");
        if (files != null && files.length > 0) {
            String[] newFiles = new String[files.length];
            for (int i=0;i<files.length;i++) {
                File tf = new File(files[i]);
                String fileName = tf.getName();
                byte[] bytes = FileUtils.readFileToByteArray(tf);

                try(Resource resource = Resource.newClassPathResource("public/uploadFiles");){
                    File resourceFile = resource.getFile();
                    File picFile = new File(resourceFile.getPath()+"/"+fileName);
                    if(picFile.exists()) picFile.delete();
                    try(FileOutputStream output = new FileOutputStream(picFile);){
                        IOUtils.write(bytes,output);
                        newFiles[i] = "/uploadFiles/"+picFile.getName();
                    }

                }
            }
            return newFiles;
        }
        return null;
    }
}
