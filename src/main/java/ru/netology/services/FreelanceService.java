package ru.netology.services;

public class FreelanceService {

    public int calculate(int arg_income, int arg_expenses, int arg_threshold) {
        int count = 0;
        int money = 0;
        int income = arg_income;
        int expenses = arg_expenses;
        int threshold = arg_threshold;
        for (int month = 1; month <= 12; month++) {
            //System.out.println("Месяц "+month+". Денег "+money+". threshold "+threshold);
            if (money >= threshold) {
                //System.out.println("Месяц "+month+". Денег "+money+". Буду отдыхать. Потратил "+expenses+", затем ещё ");
                count++;
                int tmp_money = money - expenses- (money - expenses)/3;
                System.out.println("Месяц "+month+". Денег "+money+". Буду отдыхать. Потратил -"+expenses+", затем ещё -"+ tmp_money);
                money = (money - expenses)/3;
            } else {
                System.out.println("Месяц "+month+". Денег "+money+". Придётся работать. Заработал +"+income+", потратил -"+expenses);
                money += (income - expenses);
            }
        }
        return count;
    }
}