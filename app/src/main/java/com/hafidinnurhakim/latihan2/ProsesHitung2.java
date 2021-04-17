package com.hafidinnurhakim.latihan2;

public class ProsesHitung2 extends ProsesHitung{
    private double Bil1;
    private double Bil2;

    public ProsesHitung2() {
    }

    public ProsesHitung2(double bil1, double bil2) {
        Bil1 = bil1;
        Bil2 = bil2;
    }

    public double getBil1() {
        return Bil1;
    }

    public void setBil1(double bil1) {
        Bil1 = bil1;
    }

    public double getBil2() {
        return Bil2;
    }

    public void setBil2(double bil2) {
        Bil2 = bil2;
    }


    @Override
    double getTambah() {
        return Bil1+Bil2;
    }

    @Override
    double getKurang() {
        return Bil1-Bil2;
    }

    @Override
    double getKali() {
        return Bil1*Bil2;
    }

    @Override
    double getBagi() {
        return Bil1/Bil2;
    }
}
