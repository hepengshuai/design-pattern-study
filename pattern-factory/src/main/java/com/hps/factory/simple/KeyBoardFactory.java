package com.hps.factory.simple;

import com.hps.factory.common.ComputerComponent;
import com.hps.factory.common.DellKeyboard;
import com.hps.factory.common.HpKeyboard;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:38
 */
public class KeyBoardFactory {

    public ComputerComponent createKeyBoard(String brand) {
        if ("hp".equalsIgnoreCase(brand)) {
            return new HpKeyboard();
        }
        if ("dell".equalsIgnoreCase(brand)) {
            return new DellKeyboard();
        }
        return null;
    }
}
