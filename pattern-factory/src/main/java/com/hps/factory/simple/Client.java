package com.hps.factory.simple;

import com.hps.factory.common.ComputerComponent;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:41
 */
public class Client {

    public static void main(String[] args) {
        KeyBoardFactory factory = new KeyBoardFactory();
        ComputerComponent hpKeyboard = factory.createKeyBoard("hp");
        ComputerComponent dellkeyboard = factory.createKeyBoard("dell");
        System.out.println(hpKeyboard.getName());
        System.out.println(dellkeyboard.getName());
    }
}
