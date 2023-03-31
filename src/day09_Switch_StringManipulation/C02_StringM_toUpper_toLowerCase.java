package day09_Switch_StringManipulation;

import java.util.Locale;

public class C02_StringM_toUpper_toLowerCase {
    public static void main(String[] args) {



        String str= "Java Candir";
        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase()); // JAVA CANDIR atama yapmadık.
        System.out.println(str); // Java Candir
        // String manipulation yaptiktan sonra, asil variable'a atama yapilmazsa
        // asil variable degismez
        str = str.toUpperCase();
        System.out.println(str); // JAVA CANDIR atama yaptık.
        System.out.println(str.toLowerCase()); // java candir.  atama yaptıgım sitring i kucuk harf yazdırdık.
        // str'i turkce karakterleri gozonunde bulundurarak kucuk harfe cevirin
        str = str.toLowerCase(Locale.GERMAN);
        System.out.println(str); // java candir





    }
}
