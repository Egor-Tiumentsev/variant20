package var;

import java.util.Scanner;

public class project4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму кредита: ");
        double sumkredit = scanner.nextDouble();

        double procent = 0.20;
        double obshayasumplatezhey = 0;
        double mesyachplatezh;
        double obshiyprocent = 0;

        for (int month = 1; month <= 12; month++) {
            System.out.print("Введите платеж за месяц " + month + ": ");
            mesyachplatezh = scanner.nextDouble();

            obshayasumplatezhey += mesyachplatezh;

            double interestForMonth = (sumkredit - obshayasumplatezhey + mesyachplatezh) * (procent / 12);
            obshiyprocent += interestForMonth;

            sumkredit -= (mesyachplatezh - interestForMonth);
        }

        System.out.printf("\nСумма, оставшаяся к выплате: %.2f руб.\n", sumkredit);
        System.out.printf("Общая сумма переплаты: %.2f руб.\n", obshiyprocent);
        System.out.printf("Общая сумма выплат: %.2f руб.\n", obshayasumplatezhey + obshiyprocent);
    }
}