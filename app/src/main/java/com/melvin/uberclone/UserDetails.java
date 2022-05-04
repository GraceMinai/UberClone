package com.melvin.uberclone;

public class UserDetails {
    private String myFirstName;
    private String mySecondName;
    private String myUserName;
    private String myEmailAddress;
    private String myPhoneNumber;

    public UserDetails() {
        //Empty constructor
    }



    public UserDetails(String myFirstName, String mySecondName, String myUserName, String myEmailAddress, String myPhoneNumber) {
        this.myFirstName = myFirstName;
        this.mySecondName = mySecondName;
        this.myUserName = myUserName;
        this.myEmailAddress = myEmailAddress;
        this.myPhoneNumber = myPhoneNumber;
    }

    public String getMyFirstName() {
        return myFirstName;
    }

    public void setMyFirstName(String myFirstName) {
        this.myFirstName = myFirstName;
    }

    public String getMySecondName() {
        return mySecondName;
    }

    public void setMySecondName(String mySecondName) {
        this.mySecondName = mySecondName;
    }

    public String getMyUserName() {
        return myUserName;
    }

    public void setMyUserName(String myUserName) {
        this.myUserName = myUserName;
    }

    public String getMyEmailAddress() {
        return myEmailAddress;
    }

    public void setMyEmailAddress(String myEmailAddress) {
        this.myEmailAddress = myEmailAddress;
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public void setMyPhoneNumber(String myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }
}
