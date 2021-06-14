package com.designPattern;

public class DriverMain {
    public static void main(String[] args) {
        SamsungDriver samsungDriver = new SamsungDriver();
        samsungDriver.printer();

        /*AppleDriverPrinter appleDriver = new AppleDriverPrinter();
        appleDriver.iosDriver();*/

        Driver AdapterPrinterDriver = new AdapterPrinterDriver(new AppleDriverPrinter());
        AdapterPrinterDriver.printer();


    }
}
