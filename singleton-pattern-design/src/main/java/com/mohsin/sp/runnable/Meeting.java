package com.mohsin.sp.runnable;

import com.mohsin.sp.pattern.DateHelper;

public class Meeting implements Runnable{

    /**
     * Runs this operation.
     */
    @Override
    public void run() {
        DateHelper dateHelper = DateHelper.getInstance();
        System.out.println("dateHelper = " + dateHelper.hashCode());
    }
}
