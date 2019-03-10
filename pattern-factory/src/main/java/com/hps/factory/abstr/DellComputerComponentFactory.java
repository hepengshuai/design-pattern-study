package com.hps.factory.abstr;

import com.hps.factory.common.ComputerComponent;
import com.hps.factory.common.DellKeyboard;
import com.hps.factory.common.DellMouse;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:58
 */
public class DellComputerComponentFactory implements ComputerComponentFactory {
    @Override
    public ComputerComponent createKeyboard() {
        return new DellKeyboard();
    }

    @Override
    public ComputerComponent createMouse() {
        return new DellMouse();
    }
}
