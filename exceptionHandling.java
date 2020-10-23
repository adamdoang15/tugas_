package com.tugas_PBO;

import java.util.Scanner;

public class ExceptionMain {

    public static void main(String[] args) {

        int[] array = {0,1,2,3,4};

        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();

        System.out.println("Handling out of bound");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException except){
            System.err.println(except);
        }

        System.out.println("Menambahkan Finally");

        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } finally {
            System.out.println("finally");
        }

        System.out.println("\nakhir dari program");
    }
}
