public class Main {
    public static void main(String[] args) {
        int accountSum = 100; //сколько денег на счету клиента
        int addSum = 1100; //на сколько клиент пополнил счет;
        int bonus = (addSum > 1000) ? addSum / 100 : 0; //вычисляем размер бонуса
        System.out.println("На счету клиента " + (accountSum + addSum + bonus)); //выводим сумму на счете
        System.out.println("Количество бонусных рублей " + bonus); //выводим бонус
    }
}