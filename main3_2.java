//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()

import java.util.*;

import static java.util.Collections.*;

public class main3_2 {

    public static void main(String[] args) {
        List listNumber = randomNumber(5, 0, 10);
        System.out.println("Исходныйсписок: " + listNumber);
        System.out.println("Максимальное число: " + max(listNumber));
        System.out.println("Минимальное число: " + min(listNumber));
        System.out.println("Среднее арефметическое: " + count(listNumber));
    }

    static List randomNumber(int count, int min, int max) {
        List listAdd = new ArrayList<Integer>(count);
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            listAdd.add(random.nextInt(min, max));
        }
        return listAdd;
    }

    static double count(List list) {
        int summ = 0;
        double result = 0;
        for (int i = 0; i < list.size(); i++) {
            summ = summ + (int) list.get(i);
            result = (double) summ / list.size();
        }
        return result;
    }
}
