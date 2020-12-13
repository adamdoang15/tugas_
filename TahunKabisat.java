package com.tugas_PBO;

import java.util.Scanner;
public class TahunKabisat {
       public static void main (String [] args) {
           Scanner input = new Scanner(System.in);
                   System.out.print("Masukkan tahun yang akan dicek: ");
                    int tahun = input.nextInt();
                    boolean tahunKabisat = (tahun % 4 == 0 || tahun % 400 == 0) && (tahun % 100 != 0);
                    String cekTahun;
                    if (tahunKabisat == true)
                                  cekTahun = "\nIya";
                    else
                              cekTahun = "Bukan";

                    System.out.print(tahun + " adalah tahun kabisat? " + cekTahun);
               }
  }
