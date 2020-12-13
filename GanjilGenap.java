package com.tugas_PBO;
import java.util.Scanner;

public class GanjilGenap
{
    public static void main(String args[]) {
        int inputinteger;
        System.out.print("Masukkan sebuah integer: ");

        Scanner input = new Scanner(System.in);
        inputinteger = input.nextInt();

        if ( inputinteger % 2 == 0 )
            System.out.println(inputinteger + " adalah bilangan genap");
        else
            System.out.println(inputinteger + " adalah bilangan ganjil");
    }
}
