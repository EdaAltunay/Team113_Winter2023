package day04_datacasting_WrapperClasse;

import java.util.Locale;

public class Wrapper_Classes {
    public static void main(String[] args) {
        /*  WRAPPER CLASSES lar hazır methodlara sahip,primitive data turlerinin degerlerini tasıyan claslardır.
           Integer
           Byte
           Boolean
           Character
         */
        Integer sayiW=30; // hazir metodu vardır. WRAPPER CLASSES dir.
        int sayiP=40;    // hazir metodu yoktur. primitive dir.
        sayiP=sayiW;   // primitive ile wrapper classes lar birnirlerinin yerine atanabilirler.
        System.out.println("sayiP nin yeni degeri: "+ sayiW);
        System.out.println(sayiW+7);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.max(20,40));
        /////////////////////////

        String yazi= "mustafa altunay";
        System.out.println(yazi.toUpperCase(Locale.ROOT));
        ///////////////////////
        char harf='m';     /// hazir metodu yoktur
        Character harf2='e';  ///// hazir metodu vardır.
        System.out.println(Character.isAlphabetic(harf2));
        System.out.println(Character.isDigit(harf));
        System.out.println(Character.isAlphabetic('2'));


        /////////////////////////////
        //" SAYISAL DEGER İCEREN SİTRİNG VARİABLARIYLA TOPLAMA YAPABİLMEK İCİN"


        System.out.println(" SAYISAL DEGER İCEREN SİTRİNG VARİABLERIYLA TOPLAMA YAPABİLMEK  İCİN");

        String sayi1="1984";
        String sayi2="2017";

        System.out.println(sayi1+sayi2);
        System.out.println(Integer.valueOf(sayi1) + Integer.valueOf(sayi2));
        System.out.println(Integer.parseInt(sayi1)+ Integer.parseInt(sayi2));
        System.out.println("String data turune sahip sayi1 variable ile 1991 sayisini toplama: "+
                Integer.valueOf(sayi1 +1991));



    }

}
