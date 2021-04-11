package fc.security.oauth2.uaa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BCryptPasswordEncoderController {
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * http://127.0.0.1:53020/uaa/getEncryPassword?pwd=resource1
     * @param pwd
     * @return
     */
    @GetMapping("/getEncryPassword")
    public String getEncryPassword(String pwd){
        return passwordEncoder.encode(pwd);
    }
}
