package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone phone = new CellPhone();

        Scanner input = new Scanner(System.in);
        System.out.println("What is the serial number?");
        phone.setSerialNumber(input.nextInt());

        System.out.println("What model is the phone?");
        phone.setModel(input.nextLine());

        System.out.println("Who is the carrier?");
        phone.setCarrier(input.nextLine());

        System.out.println("What is the phone number?");
        phone.setPhoneNumber(input.nextLine());

        System.out.println("Who is the owner of the phone?");
        phone.setOwner(input.nextLine());
    }
}
