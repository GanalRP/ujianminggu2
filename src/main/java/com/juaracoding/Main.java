package com.juaracoding;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(1000.0);

        System.out.println("Initial balance: " + atm.lihatSaldo());

        atm.setorUang(500.0);
        System.out.println("Balance after deposit: " + atm.lihatSaldo());

        atm.tarikUang(200.0);
        System.out.println("Balance after withdrawal: " + atm.lihatSaldo());

        try {
            atm.setorUang(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception on deposit: " + e.getMessage());
        }

        try {
            atm.tarikUang(2000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception on withdrawal: " + e.getMessage());
        }

        try {
            atm.tarikUang(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception on withdrawal: " + e.getMessage());
        }
    }
}