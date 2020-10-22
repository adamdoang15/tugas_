package com.tugas_PBO;

public class ShallowAndDeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException{
        Product product = new Product("cisaat",54657,"sukabumi");
        Categories cat1 = new Categories("odading","makan","bagus");
        Categories cat2 =(Categories) cat1.clone();

        System.out.println("cat1 " + cat1);
        System.out.println("cat2 " + cat2);

    }
}
