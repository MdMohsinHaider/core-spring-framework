package com.mohsin.beans;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class ConnectionManager {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    public ConnectionManager(
            @Value("${db.driverClassName}") String driverClassName,
            @Value("${db.url}")String url,
            @Value("${db.userName}")String userName,
            @Value("${db.password}")String password ) {

        this.driverClassName = driverClassName;
        this.url = url;
        this.userName = userName;
        this.password = password;
    }
}
