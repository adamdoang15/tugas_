package com.tugas_PBO;

class Categories implements Cloneable {
    private String product;
    private String janis;
    private String kualitas;

    public Categories(String product, String janis, String kualitas) {
        this.product = product;
        this.janis = janis;
        this.kualitas = kualitas;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getJanis() {
        return janis;
    }

    public void setJanis(String janis) {
        this.janis = janis;
    }

    public String getKualitas() {
        return kualitas;
    }

    public void setKualitas(String kualitas) {
        this.kualitas = kualitas;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "product='" + product + '\'' +
                ", janis='" + janis + '\'' +
                ", kualitas='" + kualitas + '\'' +
                '}';
    }
}
