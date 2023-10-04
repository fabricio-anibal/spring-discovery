package com.discovery.demo.infrastructure.api;

import com.discovery.demo.core.Demo;
import com.discovery.demo.core.DemoException;
import com.discovery.demo.core.DemoExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final DemoExecutor demo;

    public DemoController(DemoExecutor demo) {
        this.demo = demo;
    }

    @GetMapping( "/{alias}" )
    public String get(@PathVariable String alias){
        return demo.execute(alias);
    }
}
