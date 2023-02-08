
//������ 5:
//���������� ��������� ����������� ���� � ������ � ������� �����
//"�" ����������� 3 � ����� ���.

package HomeTest.Two;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work2_W5 {
    public static void main(String[] args) {

        String text = "������������ ����� � ���������� �����ccc����� ��������, ���� �� ������ ����, ����� ������������ � ������ ���������� �� ����, ������ ������, ��������, ����� ���� � ����� ������. ��� ����� �������� ��� ���������������� ��������� ���������, ������ � �������, ����������� � ���������� ����������� ������������� ������ ��������� Plus-one.ru ��������� ��������.";
        String[] wordArray = text.split("[\\s,.:��!?]+");
        Pattern pattern = Pattern.compile("/�{3,}/g"); // ��� �� ��� � ���������
        for (String word : wordArray) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
                int count = 0;
                while (matcher.find())
                    count++;
                if (count > 1) {
                    System.out.println(count); // �� ��?
                }
            }
        }
    }
}