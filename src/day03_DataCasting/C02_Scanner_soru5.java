package day03_DataCasting;

import java.util.Scanner;

public class C02_Scanner_soru5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi, soyisminizi ve yasinizi giriniz" +
                "\nHer bilgiden sonra ENTER'a basiniz");

        char isimIlkHarf= scan.nextLine().charAt(0);
        String soyisim= scan.nextLine();
        double yas = scan.nextDouble();

        System.out.println("Girilen bilgiler : "+ isimIlkHarf +" "+soyisim+", "+ yas);
    }
}
