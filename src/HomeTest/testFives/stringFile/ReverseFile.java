// Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
//строки из первого, но в обратном порядке (первая строка должна быть последней).

package HomeTest.testFives.stringFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseFile {
    public static void main(String[] args) {
        // Укажите путь к файлу INPUT
        String inputFilePath = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\stringFile\\FirstTextRevers";
        // Укажите путь к файлу OUTPUT
        String outputFilePath = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\stringFile\\SecondText";

        // Считываем строки из файла INPUT
        List<String> lines = readLinesFromFile(inputFilePath);

        // Разворачиваем список строк
        Collections.reverse(lines);

        // Записываем строки в обратном порядке в файл OUTPUT
        writeLinesToFile(outputFilePath, lines);
    }

    // Метод для чтения строк из файла
    private static List<String> readLinesFromFile(String filePath) {
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        return lines;

    }

    // Метод для записи строк в файл
    private static void writeLinesToFile(String filePath, List<String> lines) {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (String line : lines) {
                writer.write(line + "\n");
            }
            System.out.println("Готово!");
        } catch (IOException e) {
            System.out.println("Ошибка записи файла: " + e.getMessage());
        }
    }
}
