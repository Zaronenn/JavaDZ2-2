public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int initial_account = 100; //начальный счёт
        int deposit_amount = 100; // сумма пополнения

        int bonus_rubles;
        if (deposit_amount > 1000){
            bonus_rubles = deposit_amount / 100;
        }
        else
            bonus_rubles = 0;


        int balance = initial_account + deposit_amount + bonus_rubles;

        System.out.println("Ваш счёт пополнен на " + deposit_amount + " рублей " + " на балансе: " + balance +", зачислено бонусных рублей " + bonus_rubles);



    }
}