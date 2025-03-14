package com.juaracoding;

public class ATM {
    private double saldo;

    // Konstruktor yang menerima satu parameter untuk menginisialisasi saldo awal
    public ATM(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Metode untuk mengembalikan saldo saat ini
    public double lihatSaldo() {
        return saldo;
    }

    // Metode untuk menambah saldo dengan jumlah yang valid
    public void setorUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }

    // Metode untuk mengurangi saldo dengan jumlah yang valid
    public void tarikUang(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
        } else if (jumlah > saldo) {
            throw new IllegalArgumentException("Saldo tidak mencukupi");
        } else {
            throw new IllegalArgumentException("Jumlah harus lebih besar dari 0");
        }
    }
}