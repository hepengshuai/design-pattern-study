package com.hps.factory.abstr;

import com.hps.factory.common.ComputerComponent;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:57
 */
public interface ComputerComponentFactory {

    ComputerComponent createKeyboard();

    ComputerComponent createMouse();
}
