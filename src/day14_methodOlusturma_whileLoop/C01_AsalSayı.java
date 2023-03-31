package day14_methodOlusturma_whileLoop;

public class C01_AsalSayı {
    public static void main(String[] args) {


        // verilen pozitif tamsayının
        // asal sayı olup olmadıgını   yazdıran   VOİD, method olusturun.


        asalMiYazdir(5);

        asalMiYazdir(1);

    }

    public static void asalMiYazdir(int sayi) {
        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;       //  sayi herhangibir sayıya bolunduyse flag ı bir artırıyorum ve kod u bıtırıyorum.
            }

        }

        if (sayi == 2) {
            System.out.println("Girilen 2 sayisi ASAL bir sayidir.");
        } else if (flag == 0) {
            System.out.println("girilen " + sayi + " ASAL bir sayıdır.");

        } else {
            System.out.println("girilen " + sayi + " ASAL bir sayı degildir.");

        }

    }


}

