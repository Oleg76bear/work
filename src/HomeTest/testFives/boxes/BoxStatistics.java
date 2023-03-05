package HomeTest.testFives.boxes;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class BoxStatistics {

    private static final String FILE_NAME = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\boxes\\texts\\BoxSerialization";
    private static final String FILE_NAME_OTPUT = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\boxes\\texts\\BoxSort";

    public static void main(String[] args) {
        Box[] boxes = new Box[5];

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            for (int i = 0; i < boxes.length; i++) {
                boxes[i] = (Box) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        Arrays.sort(boxes, Comparator.comparing(Box::getVolume));

        int maxVolume = boxes[boxes.length - 1].getVolume();
        System.out.println("Отсортированные коробки по объему:");
        for (Box box : boxes) {
            System.out.println(box);
        }

        try (PrintWriter writer = new PrintWriter(new FileOutputStream(FILE_NAME_OTPUT))) {
            writer.println("Самый большой объем: " + maxVolume);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


