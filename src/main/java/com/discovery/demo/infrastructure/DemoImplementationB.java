package com.discovery.demo.infrastructure;

import com.discovery.demo.core.Demo;
import org.springframework.stereotype.Component;

@Component
public class DemoImplementationB implements Demo {

    private final String alias = "B";

    public String getAlias() {
        return alias;
    }

    public String execute() {
        return "You got the B implementation";
    }
}
