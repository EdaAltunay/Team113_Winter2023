package day03_DataCasting;

import java.util.Scanner;

public class C04_Scanner_soru7_swap {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Sayi1'i giriniz(Tamsayi)");
        int sayi1= scan.nextInt();

        System.out.println("Sayi2'i giriniz(Tamsayi)");
        int sayi2 = scan.nextInt();
        int temp=0;

        temp=sayi2;
        sayi2=sayi1;
        sayi1=temp;

        /* temp=sayi1;
        sayi1=sayi2;
        sayi2=temp; */

        System.out.println("Sayi1'in yeni degeri : " + sayi1);
        System.out.println("Sayi2'in yeni degeri : " + sayi2);

    }
}
