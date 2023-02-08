//������ 7:
//���������� ������ ���� �� � ������ ����� ������� ����������
//� ������������� �� ����� "�".

package HomeTest.Two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work2_W7 {

    public static void main(String[] args) {
        String text = "���������� ����� ��������� � ����, ��� �� ����� ������ ������� � ������ � �������� �������� ���� ����. ����� ��� �������� � �� ��� ��������� ��� ��������� ���� ������ �������. �� ������ ������� �� ��� �� ����� ������, ������� ������ �� ��������� ���.";
        String[] wordArray = text.split("[\\s,.:��!?]+");
        Pattern pattern = Pattern.compile("^[�].*[�]$");
        for (String word : wordArray) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                System.out.println(word);
            }
        }
    }
}
