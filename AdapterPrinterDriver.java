package com.designPattern;

public class AdapterPrinterDriver implements Driver{

    AppleDriverPrinter appleDriverPrinter;

    public AdapterPrinterDriver(AppleDriverPrinter appleDriverPrinter) {
        this.appleDriverPrinter = appleDriverPrinter;
    }

    @Override
    public void printer() {
        appleDriverPrinter.iosDriver();

    }
}
