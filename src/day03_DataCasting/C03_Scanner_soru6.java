package day03_DataCasting;

import java.util.Scanner;

public class C03_Scanner_soru6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap = scan.nextDouble();

        System.out.println("Cemberin cevresi : " + 2 * 3.14 * yaricap);
        System.out.println("Dairenin alani :" + 3.14 * yaricap * yaricap);

            }
        }