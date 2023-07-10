//package org.example;

//Пусть дан произвольный список целых чисел, удалите из него четные числа.

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

public class main3_1 {

    public static void main(String[] args) {
        List listNumber = randomNumber(10, 1, 20);
        System.out.println(listNumber);
        removeNumber(listNumber);
        System.out.println(listNumber);
    }

    static List randomNumber(int count, int min, int max) {
        List listAdd = new ArrayList(count);
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            listAdd.add(random.nextInt(min, max));
        }
        return listAdd;
    }

    static void removeNumber(List list) {
        for (int i = list.size(); i > 0; i--) {
            int even = (int) list.get(i) % 2;
            if (even == 0) {
                list.remove(i);
            }
        }
    }
}
