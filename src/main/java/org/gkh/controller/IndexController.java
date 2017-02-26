package org.gkh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Map;

/**
 * @author aleksandrpliskin on 26.02.17.
 */
@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String getIndexPage() {
        return "index.html";
    }

    @GetMapping(value = "/name")
    @ResponseBody
    public Map<String, String> getHelloMessage() {
        return Collections.singletonMap("name", "GKH");
    }

}
