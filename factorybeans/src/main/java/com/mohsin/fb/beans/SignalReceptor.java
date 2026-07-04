package com.mohsin.fb.beans;

import com.mohsin.fb.domain.Signal;
import java.util.Properties;

public class SignalReceptor {

    private Properties configuration;
    private String deviceId;
    private String deviceName;

    private SignalReceptor() {
        // private constructor (FactoryBean pattern)
    }

    public static SignalReceptor newInstance(
            Properties configuration,
            String deviceId,
            String deviceName) {

        SignalReceptor instance = new SignalReceptor();
        instance.configuration = configuration;
        instance.deviceId = deviceId;
        instance.deviceName = deviceName;

        System.out.println("SignalReceptor initialized for device: "
                + deviceId + " - " + deviceName);
        return instance;
    }

    public void receiveSignal(Signal signal) {
        if ("MOTION".equalsIgnoreCase(signal.getType())) {
            System.out.println("Processing MOTION signal using configuration:");
            configuration.forEach((k, v) ->
                    System.out.println(k + " : " + v));
            handleMotionSignal(signal);
        }
    }

    private void handleMotionSignal(Signal signal) {
        System.out.println("Alarming for motion signal: " + signal.getId());
    }
}
