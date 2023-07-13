import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) throws Exception {
        System.out.print("Введите длину списка N: ");
        try (Scanner iScanner = new Scanner(System.in)) {
            int n = iScanner.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            Random ran = new Random();
            for (int i = 0; i < n; i++) {
                int x = ran.nextInt(n);
                array.add(x);
            }
            System.out.println("Произвольный список целых чисел: \n " + array);

            for (int i = array.size() - 1; i >= 0; i--) {
                int even = array.get(i) % 2;
                if (even == 0) {
                    System.out.println("Четное число:" + array.get(i));
                    array.remove(i);
                }
            }
            Collections.sort(array);
            System.out.println("Список с удаленными четными числами: \n " + array);

            int min = array.get(0);
            int max = array.get(0);
            float sum = 0;
            for (int i = 0; i < array.size(); i++) {
                int num = array.get(i);
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
                sum += num;
            }
            float average = sum / array.size();

            System.out.println("Минимальное значение: " + min);

            System.out.println("Максимальное значение: " + max);

            System.out.println("Среднее арифметическое значение: " + average);
        }
    }

}