package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

   static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone phone1 = createCellPhoneFromInput();
        displayCellPhone(phone1);

        CellPhone phone2 = createCellPhoneFromInput();
        displayCellPhone(phone2);

        phone1.dial(phone2.getPhoneNumber());
        phone2.dial(phone1.getPhoneNumber());
    }

    private static CellPhone createCellPhoneFromInput() {

        CellPhone phone = new CellPhone();

        System.out.println("What is the serial number?");
        phone.setSerialNumber(input.nextInt());
        input.nextLine();

        System.out.println("What model is the phone?");
        phone.setModel(input.nextLine());

        System.out.println("Who is the carrier?");
        phone.setCarrier(input.nextLine());

        System.out.println("What is the phone number?");
        phone.setPhoneNumber(input.nextLine());

        System.out.println("Who is the owner of the phone?");
        phone.setOwner(input.nextLine());

        return phone;
    }

    private static void displayCellPhone(CellPhone phone) {
        System.out.println();
        System.out.println("The serial number is: " + phone.getSerialNumber());
        System.out.println("The model is: " + phone.getModel());
        System.out.println("The carrier is: " + phone.getCarrier());
        System.out.println("The phone number is: " + phone.getPhoneNumber());
        System.out.println("The owner of the phone is: " + phone.getOwner());
    }
}
