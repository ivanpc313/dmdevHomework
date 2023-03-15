package com.glybovskij.encapsulation;

public class Atm {
    private int quantity10;
    private int quantity20;
    private int quantity50;

    public Atm(int quantity10, int quantity20, int quantity50) {
        this.quantity10 = quantity10;
        this.quantity20 = quantity20;
        this.quantity50 = quantity50;
    }

    public boolean getCash(int sumMoney) {
        if (sumMoney > (getQuantity50() * 50) + (getQuantity20() * 20) + (getQuantity10() * 10)) {
            return false;
        }

        int quantity50;
        quantity50 = sumMoney / 50;
        if (quantity50 == 0) {
            System.out.println("Купюра номиналом 50 - " + quantity50);
        } else if (getQuantity50() - quantity50 <= 0) {
            quantity50 = getQuantity50();
            sumMoney = sumMoney - (50 * quantity50);
            setQuantity50(getQuantity50() - quantity50);
            System.out.println("Купюра номиналом 50 - " + quantity50);
        } else if (getQuantity50() - quantity50 > 0) {
            System.out.println("Купюра номиналом 50 - " + quantity50);
            sumMoney = sumMoney - (quantity50 * 50);
            setQuantity50(getQuantity50() - quantity50);
        }

        int quantity20;
        quantity20 = sumMoney / 20;
        if (quantity50 == 0 && getQuantity20() != 0 && getQuantity20() > quantity20) {
            quantity20 = sumMoney / 20;
            sumMoney = sumMoney - (20 * quantity20);
            setQuantity20(getQuantity20() - quantity20);
            System.out.println("Купюра номиналом 20 - " + quantity20);
        } else if (getQuantity20() - quantity20 <= 0) {
            quantity20 = getQuantity20();
            sumMoney = sumMoney - (20 * quantity20);
            setQuantity20(getQuantity20() - quantity20);
            System.out.println("Купюра номиналом 20 - " + quantity20);
        } else if (getQuantity20() - quantity20 > 0) {
            System.out.println("Купюра номиналом 20 - " + quantity20);
            sumMoney = sumMoney - (quantity20 * 20);
            setQuantity20(getQuantity20() - quantity20);
        }

        int quantity10;
        quantity10 = sumMoney / 10;
        if (quantity10 == 0 && quantity20 == 0) {
            System.out.println("Купюра номиналом 10 - " + quantity10);
        } else if (getQuantity10() - quantity10 <= 0) {
            quantity10 = getQuantity10();
            setQuantity10(getQuantity10() - quantity10);
            System.out.println("Купюра номиналом 10 - " + quantity10);
        } else if (getQuantity10() - quantity10 > 0) {
            setQuantity10(getQuantity10() - quantity10);
            System.out.println("Купюра номиналом 10 - " + quantity10);
        }
        return true;
    }

    public void addition10(int quantity) {
        setQuantity10(getQuantity10() + quantity);
    }

    public void addition20(int quantity) {
        setQuantity20(getQuantity20() + quantity);
    }

    public void addition50(int quantity) {
        setQuantity50(getQuantity50() + quantity);
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

    public void setQuantity10(int quantity10) {
        this.quantity10 = quantity10;
    }

    public void setQuantity20(int quantity20) {
        this.quantity20 = quantity20;
    }

    public void setQuantity50(int quantity50) {
        this.quantity50 = quantity50;
    }
}
