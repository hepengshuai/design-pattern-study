package com.hps.factory.func;

import com.hps.factory.common.ComputerComponent;
import com.hps.factory.common.DellMouse;

/**
 * @author hepengshuai
 * @date 2019/3/10 8:51
 */
public class DellMouseFactory implements MouseFactory {

    @Override
    public ComputerComponent createMouse() {
        return new DellMouse();
    }
}
