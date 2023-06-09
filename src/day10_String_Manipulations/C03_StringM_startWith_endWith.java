package day10_String_Manipulations;

public class C03_StringM_startWith_endWith {
    public static void main(String[] args) {
        String str = "Java harika";
        System.out.println(str.startsWith("java")); // false
        System.out.println(str.startsWith("Ja")); // true
        System.out.println(str.startsWith(str)); // true
        System.out.println(str.startsWith("")); // true
        System.out.println("=============");
        System.out.println(str.endsWith("a")); // true
        System.out.println(str.endsWith("ka")); // true
        System.out.println(str.endsWith("Java harika")); // true
        System.out.println(str.endsWith(""));//true
        System.out.println(str.endsWith(str.substring(str.length() - 1))); // true


    }
}
