package fc.security.oauth2.uaa.service;

import com.alibaba.fastjson.JSON;
import fc.security.oauth2.uaa.model.UserInfo;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @version 1.0
 **/
@Service
public class MyUserDetailsService implements UserDetailsService {

    //根据 账号查询用户信息
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //将来连接数据库根据账号查询用户信息
        UserInfo user = getUserByUsername(username);
        if(user == null){
            //如果用户查不到，返回null，由provider来抛出异常
            return null;
        }
        //根据用户的id查询用户的权限
        List<String> permissions = new ArrayList<>();
        permissions.add("add");
        permissions.add("select");
        //将permissions转成数组
        String[] permissionArray = new String[permissions.size()];
        permissions.toArray(permissionArray);
        UserDetails userDetails = User.withUsername(user.getUsername())
                .password(user.getPassword()).authorities(permissionArray).build();
        return userDetails;
    }
    private UserInfo getUserByUsername(String username)
    {
        UserInfo user =null;
        if("user1".equals(username)){
            user= new UserInfo();
            user.setUsername("user1");
            user.setPassword(new BCryptPasswordEncoder().encode("user1"));
        }
        return user;
    }
}
