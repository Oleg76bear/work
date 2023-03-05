package HomeTest.testFives.boxes;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Comparator;

public class DeserializeBoxes {
    private static final String FILE_NAME = "C:\\Users\\Олег\\IdeaProjects\\work\\src\\HomeTest\\testFives\\boxes\\texts\\BoxSerialization";

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

        for (Box box : boxes) {
            System.out.println(box);
        }
    }
}

