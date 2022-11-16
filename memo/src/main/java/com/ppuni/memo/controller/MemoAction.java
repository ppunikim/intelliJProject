package com.ppuni.memo.controller;

import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Slf4j
@RequestMapping(value = "/memo")
@Controller
public class MemoAction {

    @RequestMapping(value = {"/first.sgn"}, method = RequestMethod.GET)
    public String home() {

        return null;
    }
}
