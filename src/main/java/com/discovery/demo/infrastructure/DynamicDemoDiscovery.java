package com.discovery.demo.infrastructure;

import com.discovery.demo.core.Demo;
import com.discovery.demo.core.DemoDiscovery;
import com.discovery.demo.core.DemoException;
import com.discovery.demo.core.DemoWrapper;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

@Component
public class DynamicDemoDiscovery implements DemoDiscovery {
    Map<String, Demo> demos = new LinkedHashMap<>();

    public DynamicDemoDiscovery(Set<Demo> values){
        values.forEach(demo -> demos.put(demo.getAlias(), demo));
    }

    public Demo getDemo(String alias) {
        DemoWrapper demo = Optional.of(demos.get(alias))
                .map(DemoWrapper::new)
                .orElseThrow(() -> new DemoException("No demo found for alias " + alias));

        return demo;
    }
}
