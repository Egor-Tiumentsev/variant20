package var;

import java.util.Scanner;

public class project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Введите количество дней, в течение которых вы будете копить: ");
        int days = scanner.nextInt();

        double economia = 0.0;

        for (int i = 1; i <= days; i++) {
            System.out.printf("День %d. Введите сумму, которую вы отложили сегодня: ", i);
            double saveday = scanner.nextDouble();
            economia += saveday;
            System.out.printf("На данный момент у вас уже %.2f руб.\n", economia);
        }

        System.out.printf("\nОбщая сумма накоплений за %d дней составляет %.2f руб.\n", days, economia);
    }
}