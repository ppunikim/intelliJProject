package com.ppuni.memo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@Controller
@RequestMapping(value ="/memo",method = RequestMethod.GET)
public class MemoController {

    @RequestMapping(value = ("/first.test"), method = RequestMethod.GET)
    public String first() {
        return "/memo/first";
    }
    @RequestMapping(value = ("/first.test"), method = RequestMethod.POST)
    public String first1() {
        return "/memo/first";
    }

}
