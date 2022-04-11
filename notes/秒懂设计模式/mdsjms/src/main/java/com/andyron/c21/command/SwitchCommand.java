package com.andyron.c21.command;

import com.andyron.c21.Bulb;

public class SwitchCommand implements Command {

    private Bulb bulb;

    public SwitchCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        bulb.on();
    }

    @Override
    public void unexe() {
        bulb.off();
    }
}
