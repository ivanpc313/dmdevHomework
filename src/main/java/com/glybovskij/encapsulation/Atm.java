package com.glybovskij.encapsulation;

public class Atm {
    private final int quantity10;
    private final int quantity20;
    private final int quantity50;

    public Atm(int quantity10, int quantity20, int quantity50) {
        this.quantity10 = quantity10;
        this.quantity20 = quantity20;
        this.quantity50 = quantity50;
    }

    public boolean getCash(int sumMoney) {
        int quantity10;
        int quantity20;
        int quantity50;

        quantity50 = sumMoney / 50;
        quantity20 = (sumMoney % 50) / 20;
        quantity10 = ((sumMoney % 50) % 20) / 10;
        if (sumMoney % 50 == 5) {
            return false;
        } else if (quantity50 > getQuantity50()) {
            return false;
        } else if (quantity20 > getQuantity20()) {
            return false;
        } else if (quantity10 > getQuantity10()) {
            return false;
        } else {
            System.out.println("Купюра номиналом 50 - " + quantity50 + " шт " + "купюра номиналом 20 - " +
                    quantity20 + " шт " + "купюра номиналом 10 - " + quantity10 + " шт");
            return true;
        }

    }

    public int getQuantity10() {
        return quantity10;
    }

    public int getQuantity20() {
        return quantity20;
    }

    public int getQuantity50() {
        return quantity50;
    }
}
