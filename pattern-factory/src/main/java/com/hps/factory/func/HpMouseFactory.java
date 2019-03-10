package com.hps.factory.func;

import com.hps.factory.common.ComputerComponent;
import com.hps.factory.common.HpMouse;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:50
 */
public class HpMouseFactory implements MouseFactory {

    @Override
    public ComputerComponent createMouse() {
        return new HpMouse();
    }
}
