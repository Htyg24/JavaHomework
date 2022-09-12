//1. Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Homework3Part1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {

            list.add(rnd.nextInt(20));

        }

        System.out.println(list);

        for (int i = list.size() - 1; i >= 0.; i--){

            if (list.get(i) % 2 == 0)

                System.out.println(list.remove(i));

        }

        System.out.println(list);

    }

}
