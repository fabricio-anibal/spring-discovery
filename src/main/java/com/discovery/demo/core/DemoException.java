package com.discovery.demo.core;

public class DemoException extends RuntimeException {
    public DemoException(String message) {
        super(message);
    }

    public DemoException(String message, Object o) {
        super(String.format(message, o));
    }
}
