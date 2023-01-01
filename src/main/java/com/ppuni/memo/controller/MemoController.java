package com.ppuni.memo.controller;

import com.ppuni.memo.DTO.HomeDTO;
import com.ppuni.memo.service.MemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Slf4j
@Controller
@RequestMapping(value ="/memo",method = RequestMethod.GET)
public class MemoController {

    @Autowired MemoService memoService;
    @RequestMapping(value = ("/first.test"), method = RequestMethod.GET)
    public String first(HomeDTO homeDTO, Model model) throws Exception {
        List<HomeDTO> getList = memoService.getList(homeDTO);
        model.addAttribute("list", getList);
        return "/memo/first";
    }
    @RequestMapping(value = ("/first.test"), method = RequestMethod.POST)
    public String first1() {
        return "/memo/first";
    }



}
