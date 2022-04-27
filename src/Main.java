public class Main {
    public static void main(String[] args) {

        int amountInit = 100; // начальная сумма на счете
        int amountDeposit = 1584;  // сумма пополнения
        int bonus;
        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else {
            bonus = 0;
        }         // размер бонуса
        System.out.println("Итоговая сумма на счете равна " + (amountInit + amountDeposit + bonus));
        System.out.println("Сумма бонусов равна " + bonus);
        // вывод на экран
    }
}
