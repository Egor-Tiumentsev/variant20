import java.util.Scanner;

public class project3 {
    public static void main(String[] args) {
        String[] movies = new String[30];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Введите названия фильмов для просмотра (введите 'выход' для выхода):");

        while (count < 30) {
            System.out.print("Фильм " + (count + 1) + ": ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("выход")) {
                if (count < 2) {
                    System.out.println("Недостаточно фильмов для выхода. Введите хотя бы 2 фильма.");
                    continue;
                } else {
                    break;
                }
            }

            movies[count] = input;
            count++;
        }

        System.out.println("Список фильмов для просмотра:");
        for (int i = 0; i < count; i++) {
            System.out.println(movies[i]);
        }
    }
}