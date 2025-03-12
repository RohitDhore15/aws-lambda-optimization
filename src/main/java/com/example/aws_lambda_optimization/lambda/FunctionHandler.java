package com.example.aws_lambda_optimization.lambda;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class FunctionHandler {

    @Bean
    public Function<String, String> handleRequest() {
        return input -> "Hello from AWS Lambda! You sent: " + input;
    }
}
