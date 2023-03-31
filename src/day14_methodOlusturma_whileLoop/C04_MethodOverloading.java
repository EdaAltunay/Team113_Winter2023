package day14_methodOlusturma_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        /*
        java overloading kuralları:
        1- isim ve parametreleri ayni olan birden fazla method olusturulamaz.
        2- data turleri farklı olan parametrelerin yerlerini degistirirsek java yeni bir method olarak kabul eder.

       Overloading methodlarda Java hangi method un calıstırılacagına su sekilde kara verir:
       1- cagrılan isimde method var mı?
       2- method call' de kullanılan arguments ile methodlardaki parametrelerin %100 uyumlu oldugu var mı?
       3- argument ile parametre aynı olmasa bile verilen argumantleri kabul edecek parametre var mı?
       4- casting ile birden fazla method u kullanabiliyorsa  daha az casting ile calısacak method u kullanır.
         */

        topla(3, 5);   //8
        topla(3.0,2.2);      //5.2
///   topla("ali","veli");     CTE  bu argumanları kabul edebilecek parametre yok.

        topla('a', 'b');   /// iki int 195... char variable lar ascıı tablosuna gore int gıbı davranabılırler.
        topla(3f, 4f);  //  7.0.... 2. de calısır.Cunku double kapsar float ı
        topla(3f, 4);//            .... 2. ve 4. alır.ama hangısını alacak. kendisini en az yoracak olanı alır.
        // 2. si iki kez data casting yapar. 4. si bir tane data casting yapacak. o halde 4. yi alır.

    }


    public static void topla(int a, int b) {
        System.out.println("iki tamsayinin toplamı : " + (a + b));


    }

    public static void topla(double a, double b) {                      // signature:topla double double
        System.out.println("iki double sayinin toplami : " + (a + b));

    }

    public static void topla(int sayi1, double sayi2) {
        System.out.println("bir tamsayi ile ondalikli sayinin toplamı : " + (sayi1 + sayi2));
    }


    public static void topla(double sayi1, int sayi2) {
        System.out.println("bir tamsayi ile ondalikli sayinin toplamı : " + (sayi1 + sayi2));
    }

}
