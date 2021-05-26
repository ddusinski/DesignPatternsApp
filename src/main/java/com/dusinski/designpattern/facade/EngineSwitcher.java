package com.dusinski.designpattern.facade;

class EngineSwitcher {
    public String turnOnSwitcher() {
        return "Engine switcher is turning on. ";
    }

    protected String turnOffSwitcher() {
        return "Engine switcher is turned off. ";
    }
}
