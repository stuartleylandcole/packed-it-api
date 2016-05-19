package com.packedit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins = "http://localhost:8050")
public class SecuredPingController {

    @RequestMapping(value = "/secured/ping")
    @ResponseBody
    public String securedPing() {
        return "All good. You only get this message if you're authenticated";
    }
}
