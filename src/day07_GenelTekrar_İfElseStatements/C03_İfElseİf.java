package day07_GenelTekrar_İfElseStatements;

import java.util.Scanner;

public class C03_İfElseİf {
    public static void main(String[] args) {
        // kullanıcıdan pozıtıf bir tamsayı alın
        // sayı 3 ıle bolunebılıyorsa "3' un katı"
        // sayı 5 ıle bolunebılıyorsa "5' in katı"
        // sayı hem 3 hem de 5 ıle bolunebılıyorsa "3 ve 5 in katı"
        // ıkısıne de bolunemıyorsa "ne 3 un ne de 5 in katı" yazdırın.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen pozıtıf bır tamsayı gırınız.");
         int sayi=scan.nextInt();

         if (sayi%3==0 && sayi%5==0){
             System.out.println("hem 3'un hem 5'in katı");
         } else if(sayi%3==0){
             System.out.println("3 'un katı");

         }else if (sayi%5==0){
            System.out.println("5 'in katı");
         }
         else System.out.println("ne 3 un ne de 5 in katı");
}}
