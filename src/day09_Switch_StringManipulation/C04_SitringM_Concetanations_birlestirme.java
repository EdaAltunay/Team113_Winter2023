package day09_Switch_StringManipulation;

public class C04_SitringM_Concetanations_birlestirme {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Candir";
        String str3 = " ";
        // yukaridaki variablee'lari kullanarak "Java Candir" yazdirin
        System.out.println(str1.concat(str3).concat(str2)); // Java Candir     (str1+str2+str3)

    }
}
