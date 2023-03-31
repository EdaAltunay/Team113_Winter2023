package day14_methodOlusturma_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {
       /*
       Bir class'da aynı isme sahip farkli islem yapan methodlar olabilir.
       Java bu method'lardan hangisinin calısacagina parametrelere gore karar verir.

       Bir class da ismi ayni,parametreleri farkli methodlar olmasına Method OVERLOADİNG denir.
        */

        String str="Bu is olacak";

        str.replace("Bu is","Java guzel");
        str.replace('u','u');


    }
}
