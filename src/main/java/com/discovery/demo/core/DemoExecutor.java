package com.discovery.demo.core;

import org.springframework.stereotype.Component;

@Component
public class DemoExecutor {
    DemoDiscovery discovery;

    public DemoExecutor(DemoDiscovery discovery) {
        this.discovery = discovery;
    }

    public String execute(String alias) {
        Demo demo = discovery.getDemo(alias);
        return demo.execute();
    }
}
