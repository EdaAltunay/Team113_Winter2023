package day07_GenelTekrar_İfElseStatements;

import java.util.Scanner;

public class C05_İfElseİf {
    public static void main(String[] args) {
        // soru1: yas cinsiyet emeklilik
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz.");
        double yas=scan.nextDouble();
        System.out.println("lutfen cinsiyetinizi giriniz..."+
                "\n Kadın icin: K , Erkek icin: E giriniz");
        char cinsiyet=scan.next().charAt(0);
        if ((cinsiyet=='K' && yas>=60)||(cinsiyet=='E'&& yas>=65) ){
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet=='K') {
            System.out.println("Emekli olabilmek icin: "+(60-yas)+ "yıl daha calısmalısınız.");
        }
        else if (cinsiyet=='E') {
            System.out.println("Emekli olabilmek icin: "+(65-yas)+ "yıl daha calısmalısınız.");


        }
    }}

