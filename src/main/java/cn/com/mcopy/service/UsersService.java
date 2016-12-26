package cn.com.mcopy.service;

import cn.com.mcopy.db.dao.mcopy.UsersMapper;
import cn.com.mcopy.db.model.mcopy.Users;
import cn.com.mcopy.db.model.mcopy.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ucenter on 2016/11/8.
 */
@Component("usersService")
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    public void add(Users users){
        usersMapper.insert(users);
    }

    public void delete(int user_id) {
        usersMapper.deleteByPrimaryKey(user_id);
    }

    public void update(Users users){
        usersMapper.updateByPrimaryKey(users);
    }

    public List<Users> queryList(Users users) {
        UsersExample example =new UsersExample();
        UsersExample.Criteria criteria = example.createCriteria();
        criteria.andUSERLEVELBetween("1","2");
        if(users!=null){
            if(users.getLOGINNAME()!=null){
                criteria.andLOGINNAMELike(users.getLOGINNAME());
            }
            if(users.getUSERNAME()!=null){
                criteria.andUSERNAMELike(users.getUSERNAME());
            }
        }
        example.setOrderByClause("user_id desc");

        return usersMapper.selectByExample(example);
    }

    public Users checkLogin(String username,String password){
        UsersExample example =new UsersExample();
        example.createCriteria().andLOGINNAMEEqualTo(username).andPASSWORDEqualTo(password).andUSERLEVELEqualTo("2");
        List<Users> users = usersMapper.selectByExample(example);
        if(users!=null && !users.isEmpty())
            return users.get(0);
        return null;
    }
}
