package day06_bagimsizIfComleleri;

public class C01_ifStatements {
    public static void main(String[] args) {
        /*
        bu sart cumleleri birbirinden bagımsız sart cumleleridir.
         */
        int a = 12;
        int b = 55;

        if (a > b) {
            System.out.println("a b' den buyuk");
        }
        if (a % 2 == 0) {
            System.out.println("a cift sayidir.");
        }
        if (a > 100) {
            System.out.println("b 100 den buyuk");
        }
        /////////////
        boolean sonuc = a * 7 > b;
        if (sonuc) {
            System.out.println("istenen deger saglandı");

        }


    }}
