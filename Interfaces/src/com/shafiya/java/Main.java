package com.shafiya.java;
public class Main {
    public static void main(String[] args) {
        ITelephone fiyasPhone;
        fiyasPhone = new DeskPhone(3942);

        fiyasPhone.powerOn();
        fiyasPhone.callPhone(3942);
        fiyasPhone.answer();
    }
}