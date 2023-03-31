package day06_bagimsizIfComleleri;

import java.util.Scanner;

public class C06_İf_Else_Statements {
    public static void main(String[] args) {
        /// soru3:
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (yas>=65){
            System.out.println("Emekli olabilirsiniz.");
        }
        else {
            System.out.println("Emekli olabilmeniz icin"+(65-yas)+"yıl calısmalısınız");
        }
    }
}
