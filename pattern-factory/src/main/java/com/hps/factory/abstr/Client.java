package com.hps.factory.abstr;

import com.hps.factory.common.ComputerComponent;

/**
 * @author hepengshuai
 * @date 2019/3/10 9:00
 */
public class Client {

    public static void main(String[] args) {
        ComputerComponentFactory factory = new HpComputerComponentFactory();
        ComputerComponent keyboard = factory.createKeyboard();
        ComputerComponent mouse = factory.createMouse();
        System.out.println(keyboard.getName());
        System.out.println(mouse.getName() + "\n");

        factory = new DellComputerComponentFactory();
        keyboard = factory.createKeyboard();
        mouse = factory.createMouse();
        System.out.println(keyboard.getName());
        System.out.println(mouse.getName() + "\n");
    }
}
