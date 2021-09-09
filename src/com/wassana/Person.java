package com.wassana;

import java.util.Locale;

public class Person {
    private String fristName, lastName , nickName , gender;

    public Person(){
    }
    public Person(String fristName,String nickName ){
        this(fristName , "",nickName , "");
    }

@Override
public String toString() {
    return "Person{" +
            "fisrtName=' " + fristName + '\'' +
            ", lastName = '" + lastName + '\'' +
            ", nickName = '" + nickName + '\'' +
            ", gender = '" + gender + '\'' +
            '}';
}


    public Person(String fristName, String lastName, String nickName, String gender) {
        //this.fristName = fristName.trim().substring(0,1).toUpperCase() +
               // fristName.trim().substring(1).toLowerCase();
        setFristName(fristName);
        this.lastName = lastName;
        this.nickName = nickName;
        this.gender = gender;
    }

   // public Person(String fristName , String nickName){
   //     this.fristName = fristName;
   //     this.nickName = nickName;
   // }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName.trim().substring(0,1).toUpperCase()+
                fristName.trim().substring(1).toLowerCase();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
