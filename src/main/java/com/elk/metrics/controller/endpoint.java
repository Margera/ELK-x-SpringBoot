package com.elk.metrics.controller;

import java.util.Random;

import org.slf4j.MDC;
import org.springframework.util.StringUtils;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.slf4j.MDC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class endpoint {

    // private static final Logger logger = LoggerFactory.getLogger(endpoint.class);
    
    @GetMapping("/")
    public String index(){
        MDC.put("logs.id_cliente", new Random().toString());

        MDC.put("logs.id_algo", "sdfasa");

        log.trace("TRACE"); // Log do Lombox, que vem pela anotação @Log4j2
        log.debug("debug"); // Log da instancia do logger
        log.info("info");
        log.warn("warn");
        log.error("error");
        return "Loggin Spring Boot";
    }  
}
