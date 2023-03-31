package day02_DataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner_İlk_Gorev {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        System.out.println("Girilen sayinin karesi = "+ sayi*sayi);
    }
}
