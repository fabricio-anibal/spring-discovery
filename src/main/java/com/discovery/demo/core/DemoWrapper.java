package com.discovery.demo.core;

import com.discovery.demo.core.Demo;

public class DemoWrapper implements Demo {
    Demo demo;

    public DemoWrapper(Demo demo) {
        this.demo = demo;
    }

    public String getAlias() {
        return demo.getAlias();
    }

    public String execute() {
        return demo.execute();
    }
}
