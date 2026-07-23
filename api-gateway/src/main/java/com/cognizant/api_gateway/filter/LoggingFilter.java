package com.cognizant.api_gateway.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.HandlerFilterFunction;
import org.springframework.web.servlet.function.HandlerFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

@Component
public class LoggingFilter implements HandlerFilterFunction<ServerResponse, ServerResponse> {

    @Override
    public ServerResponse filter(ServerRequest request,
                                 HandlerFunction<ServerResponse> next) throws Exception {

        System.out.println("====================================");
        System.out.println("Incoming Request");
        System.out.println("Method : " + request.method());
        System.out.println("Path   : " + request.path());
        System.out.println("====================================");

        return next.handle(request);
    }
}