package day07_GenelTekrar_İfElseStatements;

import java.util.Scanner;

public class C02_İfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz.");
        double not=scan.nextDouble();

        if (not>100 || not<0){
            System.out.println("Notunuzu Yanlıs girdiniz.Lutfen tekrar giriniz");
        } else if (not>=85) {
            System.out.println("Notunuz AA");
        } else if (not>=65) {
            System.out.println("Notunuz BB");
        } else if (not>=50) {
            System.out.println("Notunuz CC");
        }
        else {System.out.println("Notunuz DD");
        }
    }
       }
