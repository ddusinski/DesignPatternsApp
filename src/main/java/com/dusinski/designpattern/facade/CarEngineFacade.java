package com.dusinski.designpattern.facade;

public class CarEngineFacade {
    private static final int MAX_COOLING_TEMPERATURE = 90;
    private final CoolerController coolerController = new CoolerController(MAX_COOLING_TEMPERATURE);
    private final EngineSwitcher engineSwitcher = new EngineSwitcher();
    private final FuelInjector fuelInjector = new FuelInjector();

    public String startEngine() {
        return coolerController.turnOnCooler() +
                fuelInjector.switchOnFuelInjector() +
                engineSwitcher.turnOnSwitcher();
    }

    public String stopEngine() {
        return coolerController.turnOffCooler() +
                fuelInjector.turnOffFuelInjector() +
                engineSwitcher.turnOffSwitcher();
    }

}
