package day14_methodOlusturma_whileLoop;

public class C02_isAsal {
    public static void main(String[] args) {
        //SORU:  Verilen 1'den buyuk tamsayı icin
        //     sayi asal ise true
        //     sayi asal degil ise false dönen bir method olusture


        System.out.println(isAsal(20)); // false
        System.out.println(isAsal(43)); // true
        boolean sonuc = isAsal(57); // sonuc variable'ina false degeri atar

    }


    public static boolean isAsal(int sayi) {


        int flag = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                flag++;
                break;        /// sayi herhangibir sayıya bolunduyse flag ı bir artırıyorum ve kod u bıtırıyorum.
            }

        }

        if (sayi == 2) {
           return true;
        } else if (flag == 0) {
            return true;

        } else {
           return false;
        }

    }
}
