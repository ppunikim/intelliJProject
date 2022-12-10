package com.ppuni.memo.controller;

import com.ppuni.memo.DAO.CommonDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
public class HomeController {

    // 왜 first.jsp 와 index.jsp 의 경로가 다를까? 어떤 차이점일까?
    @RequestMapping(value = ("/index.test"), method = RequestMethod.GET)
    public String index() {
        return "/memo/index"; }

//    @RequestMapping(value = ("/home.one"))
//    public String home() {
//        return "index";
//    }
}
