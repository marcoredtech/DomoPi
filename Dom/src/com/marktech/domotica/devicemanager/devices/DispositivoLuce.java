package com.marktech.domotica.devicemanager.devices;

import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

/**
 * RECEIVER
 */
public class   DispositivoLuce extends Generaldevice {

    private GpioPinDigitalOutput myPin;
    private String nomeDevice = "luceA";

    public DispositivoLuce() {}

    public String LuceAccesa(){
        //this.statoLuce = true;
        return "Luce accesa";
    }

    public String LuceSpenta(){
        //this.statoLuce = false;
        return "Luce spenta";
    }

    private void LoadToDb(){
        this.myPin = GpioFactory.getInstance().provisionDigitalOutputPin(RaspiPin.GPIO_01,nomeDevice, PinState.LOW);
    }
}
