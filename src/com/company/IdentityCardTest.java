package com.company;

public class IdentityCardTest {
    public static void main(String[] args) {
        // ctrl + alt + L
        IdentityCard passport = new IdentityCard();
        passport.number = "SeriaPassport-Number";
        passport.photo = "Face";
        passport.lastname = "Vyacheslav";
        passport.firstname = "Sibov";
        passport.middlename = "Ivanovich";
        passport.signature = "signature";



        System.out.println(passport.number);
        System.out.println(passport.photo);
        System.out.println(passport.firstname);
        System.out.println(passport.lastname);
        System.out.println(passport.middlename);
        System.out.println(passport.signature);
    }
}
