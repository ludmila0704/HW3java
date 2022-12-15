package HW3;

import javax.sql.ConnectionEventListener;
import java.util.*;

public class tasks {
       static int n = 20;
    public static void main(String[] args) {
        System.out.println("Задача 1. Удаление четных элементов массива");
        deleteEvenElements();
        System.out.println("Задача 2");
        getMinMaxAverageElements();
    }


    private static void deleteEvenElements() {
        /* 1.Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)*/
        ArrayList<Integer> newList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newList.add(random.nextInt(-10, 10));
        }

        System.out.println(newList);
        newList.removeIf(x -> x % 2 == 0);
        System.out.println(newList);
    }

    private static void getMinMaxAverageElements() {
        /*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.*/
        ArrayList<Integer> newList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            newList.add(random.nextInt(-10, 10));
        }
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += newList.get(i);
        }
        double avg = sum / newList.size();
        System.out.println(newList);

        System.out.printf("Максимальный элемент списка: %s\n", Collections.max(newList));
        System.out.printf("Минимальный элемент списка: %s\n", Collections.min(newList));
        System.out.printf("Среднее арифметическое списка: %.2f\n", avg);
        //System.out.printf("Среднее арифметическое списка: %s", newList.stream().mapToDouble(x -> x).average().getAsDouble());
    }


}
