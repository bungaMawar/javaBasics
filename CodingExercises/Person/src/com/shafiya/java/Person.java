package com.shafiya.java;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if(age <= 12 || age >= 20){
            return false;
        }
        return true;
    }
    public String getFullName(){
        String fullName = "";
        if(firstName.isEmpty() && lastName.isEmpty()){
            fullName = "";
        }
        else if(lastName.isEmpty()){
            fullName = firstName;
        }
        else if(firstName.isEmpty()){
            fullName = lastName;
        }
        else{
            fullName = firstName + " " + lastName;
        }
        return fullName;
    }
}
