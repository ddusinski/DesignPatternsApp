package com.dusinski.designpattern.facade;

class CoolerController {
    private static int maxTemperature;

    protected CoolerController(int maxTemp) {
        maxTemperature = maxTemp;
    }

    protected String turnOnCooler() {
        return "Cooler controller turned on with max temperature set on " + maxTemperature +". ";
    }

    protected String turnOffCooler() {
        return "Cooler controller is switched off. ";
    }
}
