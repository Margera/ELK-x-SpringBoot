package com.elk.metrics.controller;

import java.util.Random;

// import java.util.Random;

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
        Random rand = new Random();

        // nextInt as provided by Random is exclusive of the top value so you need to add 1 

        int randomNum = rand.nextInt((5 - 0) + 1) + 0;

        MDC.put("logs.id_cliente", Integer.toString(randomNum+15));

        MDC.put("logs.id_algo", "sdfasa");
        MDC.put("qtd_cavalos",  Integer.toString(randomNum+1));
        MDC.put("qtd_poneis", Integer.toString(randomNum));

        MDC.put("tipo_documento", "CTe");
        MDC.put("UF_documento", "PR");

        log.trace("TRACE"); // Log do Lombox, que vem pela anotação @Log4j2
        log.debug("debug"); // Log da instancia do logger
        log.info("info");
        log.warn("warn");
        log.error("error");
        return "Loggin Spring Boot";
    }  
}
