package fc.security.oauth2.resource1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @PreAuthorize("hasAnyAuthority('select')")
    @GetMapping("/select")
    public String select () {
        return "select";
    }
    @GetMapping("/select2")
    public String select2 (){
        return "select2";
    }
}
