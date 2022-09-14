//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class Homework3Part2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {

            list.add(rnd.nextInt(50));

        }

        System.out.println(list);

        int max = list.get(0);
        int min = list.get(0);
        double middle = 0;

        for (int i = 0; i < list.size(); i++){

            if (list.get(i) > max)
                max = list.get(i);

            else if (list.get(i) < min)
                min = list.get(i);

            middle += list.get(i);

        }

        middle /= list.size();

        System.out.println("max = " + max + "\nmin = " + min + "\nmiddle = " + middle);
    }
}
