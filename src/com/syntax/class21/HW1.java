package com.syntax.class21;
public class HW1 {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("John", "0534565478", "street 8");
        userInfo.userDetails();
    }
}
class UserClass {
    String name;
    String mobileNumber;
    public UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends UserClass {
    String userAddress;
    UserInfo(String name, String mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }
    void userDetails() {
        System.out.println(name + " " + mobileNumber + " " + userAddress);
    }
}
