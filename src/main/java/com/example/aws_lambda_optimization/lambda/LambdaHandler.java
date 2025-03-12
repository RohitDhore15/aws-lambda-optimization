package com.example.aws_lambda_optimization.lambda;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        return "Hello from AWS Lambda! You sent: " + input;
    }

    // Add a main method for local testing
    public static void main(String[] args) {
        LambdaHandler handler = new LambdaHandler();
        String result = handler.handleRequest("AWS Lambda Test", null);
        System.out.println(result);
    }
}
