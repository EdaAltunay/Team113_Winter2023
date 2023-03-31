package day19_aarayLists;

import day17_arrays.C06_ArrayElemanEklemeMethodu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayLists {
    public static void main(String[] args) {
        /*
        ArrayLists uzunlugu esnek bir listedir.
        Array alt yapisini kullanir ancak ekleme ve silme gibi islemlerde daha avantajlidir.

        ArrayLists'in tek dezavantaji var
        o da elementleri tek tek eklememiz gerekir.
         */
        int [] arr={3,4};
        arr=C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,5);
        System.out.println(Arrays.toString(arr));
        arr=C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,15);
        System.out.println(Arrays.toString(arr));

        List<String> harfler=new ArrayList<>();
        System.out.println(harfler);    // []
        harfler.add("s");
        harfler.add("l");
        harfler.add("a");
        System.out.println(harfler);    //[s, l, a]


    }
}
