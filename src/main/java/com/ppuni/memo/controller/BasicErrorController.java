//package com.ppuni.memo.controller;
//
//import org.hibernate.InvalidMappingException;
//import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
//import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
//import org.springframework.boot.web.error.ErrorAttributeOptions;
//import org.springframework.boot.web.servlet.error.ErrorAttributes;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//@RequestMapping("${server.error.path:${error.path:/error}}") // 1)
//public class BasicErrorController extends AbstractErrorController {
//
//    private InvalidMappingException errorProperties;
//
//    public BasicErrorController(ErrorAttributes errorAttributes, List<ErrorViewResolver> errorViewResolvers) {
//        super(errorAttributes, errorViewResolvers);
//    }
//
////    @Override
//    public String getErrorPath() {
//        return this.errorProperties.getPath();
//    }
//
//    @RequestMapping(produces = MediaType.TEXT_HTML_VALUE) // 2)
//    public ModelAndView errorHtml(HttpServletRequest request, HttpServletResponse response) {
//
//        HttpStatus status = getStatus(request);
//        Map<String, Object> model =
//                getErrorAttributes(request, isIncludeStackTrace(request, MediaType.TEXT_HTML));
//
//        response.setStatus(status.value());
//        ModelAndView modelAndView = resolveErrorView(request, response, status, model);
//        return (modelAndView != null) ? modelAndView : new ModelAndView("error", model);
//    }
//
//    private ErrorAttributeOptions isIncludeStackTrace(HttpServletRequest request, MediaType textHtml) {
//        return null;
//    }
//
//    @RequestMapping // 3)
//    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
//
//        // 4)
//        Map<String, Object> body =
//                getErrorAttributes(request, isIncludeStackTrace(request, MediaType.ALL));
//        HttpStatus status = getStatus(request);
//        return new ResponseEntity<>(body, status);
//    }
//}