package day06_bagimsizIfComleleri;

import java.util.Scanner;

public class C07_İf_Else_Statements {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan bir karakter girmesini isteyin,
        girilen karakterin buyuk harf olup olmadigini yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);
        //krk===> A ile Z arasında mı?
        if ('A' <= krk && krk <= 90) {
            System.out.println("girilen karakter buyuk harftir.");
        } else {
            System.out.println("girilen karakter buyuk harf degildir.");
        }
    }
}