package com.glybovskij.cycle;

/**
 * Задание 3
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.
 * <p>
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 * <p>
 * Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */
public class Task3 {

    public static void main(String[] args) {
        double salary = 600;
        int period = 38;

        printMoneyInAccounts(salary, period);
    }

    public static void printMoneyInAccounts(double salary, int period) {
        double account1 = 0;
        double account2 = 0;
        int spending = 300;
        double contribution = 0.1;
        for (int i = 1; i < period; i++) {
            if (i % 6 == 0) {
                salary = (salary + 400);
            }
            account2 += salary * contribution;
            account2 += account2 * 0.02;
            account1 += salary - spending - (salary * contribution);
        }
        System.out.println(account1);
        System.out.println(account2);
    }
}
