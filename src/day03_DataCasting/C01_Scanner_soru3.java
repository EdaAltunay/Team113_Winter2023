package day03_DataCasting;

import java.util.Scanner;

public class C01_Scanner_soru3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Lutfen soyisminizi yaziniz");
        String soyisim= scan.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Isminiz : " + isim+
                "\nSoyisminiz : " + soyisim+
                "\nYasiniz : " + yas+
                "\nKaydiniz basariyla tamamlanmistir");



    }
}
