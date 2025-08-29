package com.example.calculadora;

public class Clasecita {
    private int datito1;
    private int datito2;

    public void setDatito1(int datito1) {
        this.datito1 = datito1;
    }

    public void setDatito2(int datito2) {
        this.datito2 = datito2;
    }

    public int sumita(){
        return datito1 + datito2;
    }
    public int restita(){
        return datito1 - datito2;
    }
    public int multiplicacioncita(){
        return datito1 * datito2;
    }
    public int divisioncita(){
        return datito1 / datito2;
    }

}
