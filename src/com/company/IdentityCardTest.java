package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {
        // ctrl + alt + L
        IdentityCard passport = new IdentityCard();

        passport.number = "SeriaPassport+Number : BH398623";
        passport.photo = "Face : (^_^) ";
        passport.lastname = "Name : Vyacheslav";
        passport.firstname = "First Name : Sibov";
        passport.middlename = "Middle Name : Ivanovich";
        passport.signature = "signature : **_**";


        System.out.println(passport.number);
        System.out.println(passport.photo);
        System.out.println(passport.firstname);
        System.out.println(passport.lastname);
        System.out.println(passport.middlename);
        System.out.println(passport.signature);
    }
}
