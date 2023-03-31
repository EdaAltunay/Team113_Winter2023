package day06_bagimsizIfComleleri;

import java.util.Scanner;

public class C02_İfStatements_soru1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();
        if (sayi%5==0){
            System.out.println("sayi 5' in tamkatidir");
        }
        /// soru-3
        if (sayi%3==0){
            System.out.println("uc ile bolunebilen bir sayi ");
        }
    }
}
