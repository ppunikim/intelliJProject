package com.ppuni.memo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import reactor.util.annotation.Nullable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public interface HandlerExceptionResolver {

    @Nullable
    ModelAndView resolveException (
            HttpServletRequest request, HttpServletResponse response, @Nullable Object hanndler, Exception ex);

}
