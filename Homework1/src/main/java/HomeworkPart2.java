/*
2. Напишите функцию, для поиска наиболее длинного общего префикса,
среди массива строк. Если общего префикса нет, то возвращать пустую строку.
Пример [] - ответ "aa"
 */

import javax.swing.*;

public class HomeworkPart2 {
    public static void main(String[] args) {
        String[] str = new String[] {"aabb", "aabbb", "aaabb"};
        String prefix = str[0];
        for(String word: str){
            while(!word.startsWith(prefix) && prefix.length() > 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        System.out.println("Word set prefix: " + prefix);
    }
}
