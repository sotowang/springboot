package com.soto.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * 修改HelloController，把本来的@RestController 改为@Controller。
 * 这时返回"hello"就不再是字符串，
 * 而是根据application.properties 中的视图重定向，到/WEB-INF/jsp目录下去寻找hello.jsp文件
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
