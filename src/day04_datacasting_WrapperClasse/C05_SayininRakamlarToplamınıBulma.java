package day04_datacasting_WrapperClasse;

import java.util.Scanner;

public class C05_SayininRakamlarToplamınıBulma {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc basamakli pozitif bir tam sayi giriniz.");

        int girilenSayi= scan.nextInt();
        int rakam= girilenSayi % 10;
        int rakamlarToplami= rakam;

        girilenSayi = girilenSayi / 10;
        rakam = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;

        girilenSayi = girilenSayi / 10;
        rakam = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + rakam;


        System.out.println("girilen sayinin rakamlar toplami = "+rakamlarToplami);



    }
}
