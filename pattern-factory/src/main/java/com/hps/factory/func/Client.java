package com.hps.factory.func;

import com.hps.factory.common.ComputerComponent;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:52
 */
public class Client {

    public static void main(String[] args) {
        MouseFactory factory = new HpMouseFactory();
        ComputerComponent mouse = factory.createMouse();
        System.out.println(mouse.getName());
        factory = new DellMouseFactory();
        mouse = factory.createMouse();
        System.out.println(mouse.getName());
    }
}
