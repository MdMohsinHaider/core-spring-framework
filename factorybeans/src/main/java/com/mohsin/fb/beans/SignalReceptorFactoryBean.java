package com.mohsin.fb.beans;

import com.mohsin.fb.domain.Signal;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.util.Properties;

@Component
public class SignalReceptorFactoryBean implements FactoryBean<SignalReceptor> {

    private String configureLocation;
    private String deviceId;
    private String deviceName;

    public SignalReceptorFactoryBean(
            @Value("${signalReceptor.configureLocation}") String configureLocation,
            @Value("${signalReceptor.deviceId}") String deviceId,
            @Value("${signalReceptor.deviceName}") String deviceName) {
        this.configureLocation = configureLocation;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }


    @Override
    public SignalReceptor getObject() throws Exception {
        Properties configuration = new Properties();
//        configuration.load(new FileInputStream(configureLocation));
        configuration.load(
                getClass()
                        .getClassLoader()
                        .getResourceAsStream(configureLocation)
        );

        SignalReceptor signalReceptor = SignalReceptor.newInstance(configuration, deviceId, deviceName);
        return signalReceptor;

    }

    @Override
    public Class<?> getObjectType() {
        return SignalReceptor.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}



















