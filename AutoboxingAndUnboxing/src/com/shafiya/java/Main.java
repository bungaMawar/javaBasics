package com.shafiya.java;

import java.util.ArrayList;

class IntClass{ //wrapper
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] stringArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Fiya");

        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(24));

        Integer integer =  new Integer(38);
        Double doubleValue = new Double(34);

        ArrayList<Integer> integers = new ArrayList<>();
        for(int x = 0; x <= 10; x++){
            integers.add(Integer.valueOf(x)); //autoboxing
        }

        for(int x = 0; x <= 10; x++){
            System.out.println(x + " --> " + integers.get(x).intValue()); //unboxing
        }

        //long way
        Integer integerValue = 49; //Integer.valueOf(49);
        int intValue = integerValue; //intValue.intValue();

        ArrayList<Double> doubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            doubleValues.add(Double.valueOf(dbl));
        }

        for(int x = 0; x < doubleValues.size(); x++){
            double value = doubleValues.get(x).doubleValue();
            System.out.println(x + " --> " + value);
        }
    }
}