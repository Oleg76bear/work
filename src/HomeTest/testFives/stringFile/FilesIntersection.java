// Имеется два файла (INPUT_1 и INPUT_2). В третий (OUTPUT) необходимо
//записать только те строки, которые есть и в первом, и во втором.

package HomeTest.testFives.stringFile;
import java.io.*;
import java.util.*;

public class FilesIntersection {
    public static void main(String[] args) {
        // Укажите путь к файлу INPUT1
        String INPUT_1 = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\stringFile\\FirstText";
        // Укажите путь к файлу INPUT2
        String INPUT_2 = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\stringFile\\SecondText";

        // Укажите путь к файлу OUTPUT
        String outputFilePath = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\stringFile\\UnitToParts";


        try {
            // Открываем файлы для чтения
            BufferedReader reader1 = new BufferedReader(new FileReader(INPUT_1));
            BufferedReader reader2 = new BufferedReader(new FileReader(INPUT_2));

            // Открываем файл для записи
            PrintWriter writer = new PrintWriter(outputFilePath);

            // Создаем множества для строк из файлов
            Set<String> set1 = new HashSet<>();
            Set<String> set2 = new HashSet<>();

            // Считываем строки из первого файла и добавляем их в set1
            String line;
            while ((line = reader1.readLine()) != null) {
                set1.add(line);
            }

            // Считываем строки из второго файла и добавляем их в set2
            while ((line = reader2.readLine()) != null) {
                set2.add(line);
            }

            // Пересекаем множества и записываем результат в файл
            for (String s : set1) {
                if (set2.contains(s)) {
                    writer.println(s);
                }
            }

            // Закрываем файлы
            reader1.close();
            reader2.close();
            writer.close();

            System.out.println("Готово!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
