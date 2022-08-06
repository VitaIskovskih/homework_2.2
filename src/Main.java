public class Main {
    public static void main(String[] args) {
        int balanceInitial = 100;//Начальная сумма у клиента
        int bonusAmount = 1000;//Бонусная сумма для пополнения
        int refill = 1100;//Сумма пополнения клиентом
        int bonus = 0;//Бонусы начисленные клиенту

        if (refill >= bonusAmount) {
            bonus = refill / 100;//Бонусы начисленные клиенту
        }

        int balanceFinal = balanceInitial + refill + bonus;//Итоговая сумма баланса после пополнения

        System.out.println("Итоговая сумма:");
        System.out.println(balanceFinal + "рублей");
    }

}
