package com.tickethub.controller;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final Environment environment;

    public HelloController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    /**
     * Debug endpoint to see Environment values
     * Visit: http://localhost:8080/api/env
     */
    @GetMapping("/env")
    public Map<String, Object> showEnvironmentValues() {
        Map<String, Object> envValues = new HashMap<>();
        
        // Get specific properties you're interested in
        envValues.put("DB_URL", environment.getProperty("DB_URL"));
        envValues.put("spring.datasource.url", environment.getProperty("spring.datasource.url"));
        envValues.put("DB_USERNAME", environment.getProperty("DB_USERNAME"));
        envValues.put("spring.datasource.username", environment.getProperty("spring.datasource.username"));
        envValues.put("DB_PASSWORD", environment.getProperty("DB_PASSWORD", "***HIDDEN***"));
        envValues.put("JWT_SECRET", environment.getProperty("JWT_SECRET", "***HIDDEN***"));
        envValues.put("jwt.secret", environment.getProperty("jwt.secret", "***HIDDEN***"));
        envValues.put("jwt.expiration", environment.getProperty("jwt.expiration"));
        
        // Show how the resolution works
        Map<String, String> resolution = new HashMap<>();
        resolution.put("DB_USERNAME env var exists", 
            environment.getProperty("DB_USERNAME") != null ? "YES" : "NO");
        resolution.put("Resolved spring.datasource.username", 
            environment.getProperty("spring.datasource.username"));
        resolution.put("Used default value", 
            environment.getProperty("DB_USERNAME") == null ? "YES (postgres)" : "NO (from env var)");
        
        envValues.put("resolution_info", resolution);
        
        return envValues;
    }
}
