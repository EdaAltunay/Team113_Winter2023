package day14_methodOlusturma_whileLoop;

public class C05_ForLoop_WhileLoop {
    public static void main(String[] args) {
        /*
        Baslangic ve bitis degeri belli olan veya "kac defa tekrar edecegi biline loop " larda forloop ideal olarak kullanılabılır.
        Ancak tekrar sayisi belli olmayan baslangıc veya bıtısı baska bır variable a baglı durumlarda forloop yerine WHİLELOOP
        tercih edilir.
         */


        //    SORU: 50 ve 100 arasındaki (sinirlar dahil) sayılari toplayin.


        int toplam = 0;
        for (int i = 50; i <= 100; i++) {
            toplam += i;

        }
        System.out.println("Toplam: " + toplam);


        // aynı soruyu WhileLoop ile yapalım:
        // forLoop da 3 seyi takip ederiz.
        // 1-Baslangıc degeri
        // 2-bitis degeri
        // 3-artıs veya azalıs sekli


        toplam =0;
        int sayi=50;
        while (sayi<=100){
            toplam += sayi;
            sayi++;
        }
        System.out.println("while ile toplam : " + toplam);




    }
}
