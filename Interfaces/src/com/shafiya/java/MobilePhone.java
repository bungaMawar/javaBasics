package com.shafiya.java;

public class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging = false;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Phone is powering up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("Dialing " + phoneNumber + " on desk phone");
        } else {
            System.out.println("Phone is off.");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering mobile phone");
            isRinging = false;
        } else{
            System.out.println("Phone is not ringing or invalid number");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody playing");
        } else{
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
