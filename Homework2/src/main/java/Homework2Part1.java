//1. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Homework2Part1 {

        public static void main(String[] args) throws IOException {

        String dirName = "D:\\GB\\Java\\Homework2";
        ArrayList<String> filesName = new ArrayList<>();
        Files.list(new File(dirName).toPath()).forEach(x -> filesName.add(x.toString()));
//        System.out.println(String.join("\n", filesName));

        for(String fileName: filesName){
                String str = "";
                if (fileName.contains(".")){
                        str = (fileName.substring(fileName.lastIndexOf(".") + 1));
                }
                System.out.println("Расширение фафла: " + str);
        }
    }
}
