package cn.com.mcopy.vo;

import java.util.List;

/**
 * Created by ucenter on 2016/12/22.
 */
public class DataVO<E> {

    private boolean success;
    private int totalRows;
    private int curPage;
    private List<E> data;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public List<E> getData() {
        return data;
    }

    public void setData(List<E> data) {
        this.data = data;
    }
}
