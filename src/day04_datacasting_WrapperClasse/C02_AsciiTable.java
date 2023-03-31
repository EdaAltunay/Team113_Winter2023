package day04_datacasting_WrapperClasse;

import java.util.Scanner;

public class C02_AsciiTable {
    public static void main(String[] args) {
// soru3 data casting
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char girilenHarf=scan.next().charAt(0);
        System.out.println("Girilen harf: "+ girilenHarf+
                "\nGirilen harften sonraki 3 harf: " + (char)(girilenHarf+1)+","+
                (char)(girilenHarf+2)+","+(char)(girilenHarf+3));




    }
}
