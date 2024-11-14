package var;

import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш рост в сантиметрах (от 150 до 200): ");
        int height = scanner.nextInt();

        while (height < 160 || height > 200) {
            System.out.println("Рост должен быть в диапазоне от 150 до 180 см.");
            System.out.print("Пожалуйста, введите правильный рост: ");
            height = scanner.nextInt();
        }

        System.out.print("Введите ваш вес в килограммах: ");
        int weight = scanner.nextInt();

        double heightMetr = height / 100.0;

        double indeksmasstela = weight / (heightMetr * heightMetr);

        String category;

        if (weight < 60) {
            category = "Дефицит массы тела.";
        } else if (weight >= 60 && weight <= 80) {
            category = "Нормальный вес.";
        } else if (weight > 80 && weight <= 99) {
            category = "Избыточная масса тела (предожирение).";
        } else {
            category = "Ожирение.";
        }

        System.out.printf("Индекс массы тела (ИМТ): " + indeksmasstela);
        System.out.println(" Категория: " + category);
    }
}