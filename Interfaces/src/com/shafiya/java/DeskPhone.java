package com.shafiya.java;

public class DeskPhone implements ITelephone{
    private int myNumber;
    private boolean isRinging = false;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Desk phone has no power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Dialing " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering desk phone");
            isRinging = false;
        } else{
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ring ring");
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
