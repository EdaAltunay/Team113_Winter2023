package day04_datacasting_WrapperClasse;

public class C03_DataCasting {
    public static void main(String[] args) {
        int a=20;
        int b=6;
        System.out.println(a/b);

        double c=6;
        System.out.println(a/c);

        float d=6f;
        System.out.println(a/d);
        System.out.println(a/(double)b);
        System.out.println((double)a/b);
        System.out.println((double)a/(double)b);
        int e=1467;

        System.out.println(e=e/10);
        System.out.println(e);
        e=e/10;
        System.out.println(e);
        e=e/10;
        System.out.println(e);
        e=e/10;
        System.out.println(e);
    }
}
