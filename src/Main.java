public class Main {
    public static void main(String[] args) {

        int summaNaz = 100; // начальная сумма на счете
        int summaPop = 1584;  // сумма пополнения
        int bonus;
        if (summaPop > 1000) {
            bonus = summaPop / 100;
        } else {
            bonus = 0;
        }         // размер бонуса
        System.out.println("Итоговая сумма на счете равна " + (summaNaz + summaPop + bonus));
        System.out.println("Сумма бонусов равна " + bonus);
        // вывод на экран
    }
}
