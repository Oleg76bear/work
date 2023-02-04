//������ 8:
//���������� ������� �� ������ � ����������� ����� �����
//(XXXX-XXXX-XXXX-XXXX) ���� �� ��� ����.

package HomeTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work2_W8 {

    public static void main(String[] args) {
        String card = "���������� ����� ��������� � ����, ��� �� ����� ������ ������� � ������ �  �������� �������� ���� ����. ����� ��� �������� � �� ��� ��������� ��� ��������� ���� ������ �������. �� ������ ������� �� ������� ����� �����: 0678-7890-3456-9076.";
        String[] numberArray = card.split("[\\s,.:��!?]+");
        Pattern pattern1 = Pattern.compile("\\d{4}([-]|)\\d{4}([-]|)\\d{4}([-]|)\\d{4}");
        for (String number : numberArray) {
            Matcher matcher = pattern1.matcher(number);
            if (matcher.find()) {
                System.out.println(number);
            }
        }
    }
}

