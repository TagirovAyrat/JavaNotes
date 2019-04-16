package ru.lambdabasic;

public class MyIntNum{
    private int v;

    public MyIntNum(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    boolean isFactor(int n){
        return (v % n) == 0;
    }
}
