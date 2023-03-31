package day06_bagimsizIfComleleri;

import java.util.Scanner;

public class C05_İf_Else_Statements {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse "Sinifi Gectin",
        //         50’den kucukse "Maalesef kaldin" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz.");
        double not=scan.nextDouble();
        if (not>=50 && not<=100){
            System.out.println("sinifi gectin");
        }
        else {
            System.out.println("malesef kaldin");
        }

        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin

            System.out.println("pozitif bir tamsyi giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0){
            System.out.println("cift sayidir.");}
        else{
            System.out.println("tek sayidir.");
        }

        // Kullanicidan pozitif bir tamsayi alin
        // 5 ile bolunup bolunmedigini yazdirin

        System.out.println("pozitif bir tamsyi giriniz");
        int sayi1=scan.nextInt();
        if (sayi1%5==0){
            System.out.println("5 ile bolunebiliyor");}
        else{
            System.out.println("5 ile bolunemiyor");
        }
    }
}
