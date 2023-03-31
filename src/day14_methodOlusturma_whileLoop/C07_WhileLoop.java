package day14_methodOlusturma_whileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {
        /*  SORU : kullanıcıdan bir sifre isteyin asagıdaki sartları saglayana kadar herseferinde hataları soyleyip yeni sifre isteyip
                   sartları saglayan sifre oldugunda  " 5. denemenizde basarılı sifre olusturuldu" seklinde acıklama yazın.
                   sartlar:
                   -ilk harf kucuk harf olmalı
                   -son harf buyuk olmalı
                   -bosluk icermemeli
                   -8 karakter veya daha uzun olmalı


         */
        Scanner scan = new Scanner(System.in);

        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;

        while (flag != 4) {
            flag = 0;
            System.out.print("Lutfen sifrenizi giriniz:");
            sifre = scan.nextLine();

            //-ilk harf kucuk harf olmalı
            if (sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z') {
                flag++;

            } else {
                System.out.println("ilk karakter kucuk olmalı");
            }
            // son harf buyuk olmalı
            if (sifre.charAt(sifre.length() - 1) >= 'A' && sifre.charAt(sifre.length() - 1) <= 'Z') {
                flag++;

            } else {
                System.out.println("son karakter buyuk olmalı");
            }
            // bosluk icermemeli
            if (sifre.contains(" ")) {
                System.out.println("sifre bosluk icermemeli");
            } else {
                flag++;
            }
            // 8 karakter veya daha uzun olmalı
            if (sifre.length() >= 8) {
                flag++;
            } else {
                System.out.println("en az 8 karakterli olmalı ");
            }
            denemeSayisi++;

        }
        if (flag == 4) {
            System.out.println(denemeSayisi + ".  denemenizde basarılı sifre olusturuldu");
        }


    }
}
