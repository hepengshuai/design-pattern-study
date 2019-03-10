package com.hps.factory.abstr;

import com.hps.factory.common.ComputerComponent;
import com.hps.factory.common.HpKeyboard;
import com.hps.factory.common.HpMouse;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:58
 */
public class HpComputerComponentFactory implements ComputerComponentFactory {
    @Override
    public ComputerComponent createKeyboard() {
        return new HpKeyboard();
    }

    @Override
    public ComputerComponent createMouse() {
        return new HpMouse();
    }
}
