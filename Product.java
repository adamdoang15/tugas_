package com.tugas_PBO;
 class Product implements Cloneable {
   private String asal;
   private int kode;
   private String kota;

  public Product(String asal, int kode, String kota) {
   this.asal = asal;
   this.kode = kode;
   this.kota = kota;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
   return super.clone();
  }

  public String getAsal() {
   return asal;
  }

  public void setAsal(String asal) {
   this.asal = asal;
  }

  public int getKode() {
   return kode;
  }

  public void setKode(int kode) {
   this.kode = kode;
  }

  public String getKota() {
   return kota;
  }

  public void setKota(String kota) {
   this.kota = kota;
  }

  @Override
  public String toString() {
   return "Product{" +
           "asal='" + asal + '\'' +
           ", kode=" + kode +
           ", kota='" + kota + '\'' +
           '}';
  }
 }
