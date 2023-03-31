package day06_bagimsizIfComleleri;

import java.util.Scanner;

public class C03_İfStatements_soru4 {
    public static void main(String[] args) {
         /*
    soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
    ucgen eskenar ise “Eskenar ucgen” yazdirin.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("ucgenin 3 kenar uzunlugunu giriniz.");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();
        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("eskenar ücgendir.");
        }

        }

    }


