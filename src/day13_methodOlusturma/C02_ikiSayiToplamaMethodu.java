package day13_methodOlusturma;

import java.util.Scanner;

public class C02_ikiSayiToplamaMethodu {
    public static void main(String[] args) {
        // kullanıcıdan iki sayı alıp, toplamlarını yazdıran method u olusturun.

        //method claas ın ıcnde maın method un dısında olusturulur.
        // void: sadece yazdıracaklarda.... //
        // digerlerınde yani sayı dondurdugumuzde return kullanıyoruz.

        ikiSayıTopla();
        ikiSayıTopla();


    }

    public static void ikiSayıTopla() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Toplamak uzere 2 sayı gırınız");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        System.out.println("iki sayının toplamı:" + (sayi1 + sayi2));

    }
}
