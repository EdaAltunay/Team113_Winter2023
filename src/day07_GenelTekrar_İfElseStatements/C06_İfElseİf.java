package day07_GenelTekrar_İfElseStatements;

import java.util.Scanner;

public class C06_İfElseİf {
    public static void main(String[] args) {
        //kullanıcının kilo ve boyunu isteyip vucut kitle indeksini hesaplayınız.
        // (kilo*1000/(boy*boy))
        //vki>30.. obez
        //25<vki<30... kilolu
        //25<vki<20.. normal
        // vki<20... zayıf     Yazdırın.
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble();
        System.out.println("lutfen kilonuzu kg olarak giriniz");
        double kilo=scan.nextDouble();

        System.out.println("boyunuz: "+boy+"\nkilonuz: "+kilo);
        double vki=(kilo*10000/(boy*boy));
        System.out.println("vucut kitle indeksi :"+vki);

        if (kilo<=0 || boy<=0 || boy>300 || kilo>500)
            System.out.println("yanlıs giris yaptınız,tekrar deneyiniz.");
        else if(vki>30) System.out.println("obez");
        else if (25<vki && vki<30) System.out.println("kilolu");
        else if (20<vki && vki<25) System.out.println("normal");
        else  if (vki<20) System.out.println("zayıf");





    }}




