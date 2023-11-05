public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int initialAccount = 800; //начальный счёт
        int depositAmount = 100; // сумма пополнения

        int bonusRubles;
        if (depositAmount > 1000) {
            bonusRubles = depositAmount / 100;
        } else {
            bonusRubles = 0;
        }

        int balance = initialAccount + depositAmount + bonusRubles;

        System.out.println("Ваш счёт пополнен на " + depositAmount + " рублей " + " на балансе: " + balance + ", зачислено бонусных рублей " + bonus_rubles);


    }
}