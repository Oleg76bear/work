package HomeTest.testFives.boxes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BoxSerialization {
    private static final String FILE_NAME = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\boxes\\texts\\BoxSerialization";

    public static void main(String[] args) {


        Box[] boxes = new Box[]{
                new Box(1, 2, 3),
                new Box(2, 3, 4),
                new Box(3, 4, 5),
                new Box(4, 5, 6),
                new Box(5, 6, 7)
        };
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Box box : boxes) {
                oos.writeObject(box);
            }
            System.out.println("Объекты Box были сериализованы и сохранены в файл BoxSerialization");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

