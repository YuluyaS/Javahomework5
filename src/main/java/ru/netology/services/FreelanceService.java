package ru.netology.services;

public class FreelanceService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {

            if (money >= threshold) {
                count++;
                int tmpMoney = money - expenses - (money - expenses) / 3;

                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + tmpMoney);
                money = (money - expenses) / 3;
            } else {
                System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money += (income - expenses);
            }
        }
        return count;
    }
}