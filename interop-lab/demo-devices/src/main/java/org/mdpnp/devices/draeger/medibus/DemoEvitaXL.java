package org.mdpnp.devices.draeger.medibus;

import org.mdpnp.devices.EventLoop;
import org.mdpnp.devices.serial.SerialProvider;
import org.mdpnp.devices.serial.SerialSocket;
import org.mdpnp.devices.serial.SerialSocket.DataBits;
import org.mdpnp.devices.serial.SerialSocket.Parity;
import org.mdpnp.devices.serial.SerialSocket.StopBits;

public class DemoEvitaXL extends AbstractDraegerVent {

    public DemoEvitaXL(int domainId, EventLoop eventLoop) {
        super(domainId, eventLoop);
    }

    @Override
    public SerialProvider getSerialProvider() {
        SerialProvider serialProvider =  super.getSerialProvider();
        serialProvider.setDefaultSerialSettings(19200, DataBits.Eight, Parity.None, StopBits.One);
        return serialProvider;
    }

    @Override
    protected String iconResourceName() {
        return "evitaxl.png";
    }
}
