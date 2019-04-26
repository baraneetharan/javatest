package com.kgisl.javatest;

import java.util.Scanner;

/**
 * ElectricityBill
 */
public class ElectricityBill {

    public static void main(String[] args) {
        int custid, conu;
        double chg, surchg=0 , gramt, netamt;
        String connm;

        System.out.println("Input Customer ID :");
        custid = new Scanner(System.in).nextInt();
        System.out.println("Input the name of the customer :");
        connm = new Scanner(System.in).next();
        System.out.println("Input the unit consumed by the customer : ");
        conu = new Scanner(System.in).nextInt();
        if (conu < 200)
            chg = 1.20f;
        else if (conu >= 200 && conu < 400)
            chg = 1.50f;
        else if (conu >= 400 && conu < 600)
            chg = 1.80f;
        else
            chg = 2.00f;
        gramt = conu * chg;
        if (gramt > 300)
            surchg = (gramt * 15) / 100.0;
        netamt = gramt + surchg;
        if (netamt < 100)
            netamt = 100;
        System.out.println("\nElectricity Bill\n");
        System.out.println("Customer IDNO                           " + custid);
        System.out.println("Customer Name                           " + connm);
        System.out.println("unit Consumed                           " + conu);
        System.out.println("Amount Charges @Rs. "+ chg+"  per unit       "  + gramt);
        System.out.println("Surchage Amount                         " + surchg);
        System.out.println("Net Amount Paid By the Customer         " + netamt);
    }
}