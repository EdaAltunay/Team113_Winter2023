package day09_Switch_StringManipulation;

public class C06_SitringM_Length {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";
        // bu cumledeki karakter sayisini yazdirin
        System.out.println(str.length()); // 30
        // bu cumledeki son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));
        // sondan 3.karakteri yazdirin
        System.out.println(str.charAt(str.length() - 3)); // y
    }
}
