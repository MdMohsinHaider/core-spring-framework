package com.mohsin.fb.beans;

import com.mohsin.fb.domain.Signal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartCamera {
    private SignalReceptor signalReceptor;

    @Autowired
    public SmartCamera(SignalReceptor signalReceptor) {
        this.signalReceptor = signalReceptor;
    }

    public void detectMotion() {
        Signal signal = new Signal("Motion", "830-30");
        signalReceptor.receiveSignal(signal);
    }
}
