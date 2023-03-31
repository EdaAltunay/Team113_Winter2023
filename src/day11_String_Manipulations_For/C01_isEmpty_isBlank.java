package day11_String_Manipulations_For;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {

        String str = "Java candir";
        System.out.println(str.isEmpty()); // false  // empty: bos
        System.out.println(str.isBlank()); // false   // blank: bosluk

        str = "   ";
        System.out.println(str.isEmpty()); // false
        System.out.println(str.length()); // 3
        System.out.println(str.isBlank()); // true

        str="";
        System.out.println(str.isEmpty()); // true
        System.out.println(str.length()); // 0
        System.out.println(str.isBlank()); // true

    }
}
