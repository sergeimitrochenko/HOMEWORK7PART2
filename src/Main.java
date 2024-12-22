public class Main {
    public static void main(String[] args) {
        String[] names = {"0", "1", "2"};
        System.out.println(names[0]);
        System.out.println("Conichiva SEMPAIIIIII !");

        System.out.println("Задача № 1");
        int[] salary = {200_000, 15_000, 35_000, 145_000, 85_000};
        int sum = 0;
        for (int j : salary) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();

        System.out.println("Задача № 2");
        int Min = salary[0];
        int Max = salary[1];
        for (int j : salary) {
            if (j > Max) {
                Max = j;
            }
            if (j < Min) {
                Min = j;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + Min + " рублей. Максимальная сумма трат за неделю составила " + Max + " рублей");
        System.out.println();

        System.out.println("Задача № 3");
        int sumWeek = sum / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + sumWeek + " рублей");

        System.out.println();
    }
}

