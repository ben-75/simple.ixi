package org.iota.ict.ixi;

import org.iota.ict.Ict;
import org.iota.ict.utils.properties.Properties;

public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        Ict ict = new Ict(properties.toFinal());
        new Thread(new HelloIxiWorld(ict)).start();
    }
}
