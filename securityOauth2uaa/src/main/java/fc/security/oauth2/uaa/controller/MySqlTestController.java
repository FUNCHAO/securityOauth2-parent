package fc.security.oauth2.uaa.controller;

import com.alibaba.fastjson.JSON;
import fc.security.oauth2.uaa.dao.OauthClientDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class MySqlTestController {
    @Autowired
    private OauthClientDetailsDao oauthClientDetailsDao;

    /**
     * http://127.0.0.1:53020/uaa/getOauthClientDetails
     * @return
     */
    @GetMapping("/getOauthClientDetails")
    public Object getOauthClientDetails(){
        List<Map<String, Object>> clientDetails = oauthClientDetailsDao.getClientDetails();
        Object clientDetailsJson = JSON.toJSON(clientDetails);
        return clientDetailsJson;
    }
}
