package shcool;

public class Task {

// ������� 2.8
//�������� �����, ������� ����������� ���������� � �������� 6, � ��
//��� ������� �� �����: � ������ ������ - ��� ��������, �� ������ -
//������� ����� ��������, � ������� - ��� ����� ��������.

   public static void main(String[] args) {


        int x = 6;
        int sum  = x * x;
        int cub = x * x * x;
        System.out.println(x);
        System.out.println(sum);
        System.out.println(cub);
    }
}


    // ������� 2.9
// �������� �����, ������� ����������� ���������� � �������� 9, � ��
//��� ������� �� �����: � ������ ������ - ��� �������� � ����������
//�������� (��������, ��������� � ����� 9�), � �� ������ - �������
//����� �������� (���� � ���������� ��������).

  /*  public static void main(String[] args) {
        int x = 9;
        int sqr = x * x;
        System.out.println("X exuals : " + x);
        System.out.println("Sqr exuals : " + sqr);
    }
}

   */
// ������� 2.10
//�������� �����, ������� ����������� ���� ���������� ��������, �
//����� ������� �� �����: � ������ ������ �������� ����� ����������
//(� ����������� ���������), �� ������ - ������������ ���� ����
//������ (� ���������� ��������), � ������� - ����� ���� �������
//��� (� ���������� ��������).

 /*   public static void main(String[] args) {
        int one = 23;
        int two = 12;
        int multiply = one * two;
        int sum = one + two;
        System.out.println("�������� One : " + one + " �������� Two : " + two);
        System.out.println("�������� multiply : " + multiply);
        System.out.println("�������� sum : " + sum);
    }
}

  */

// ������� 2.11
//�������� �����, ������� ������� �� ����� � ����� ������ ���� ��� �
//�������, � ������ - �������, ��� ��� - � ����� �� ���������� ().
//��������:
//���� ������
//7-841-266666

  /*  public static void main(String[] args) {
        String name = "Ivan";
        String surName = "Ivanov";
        String number = "7-767-467733";

        for (int i = 0; i < 18; i++) {
            System.out.print("*");
           }
        System.out.println();

        System.out.println("* " + name + "\t\t\t" + " *" + "\n" +  "* " + surName + "\t\t" +  " *" + "\n" + "* " + number + "   *");

        for (int i = 0; i < 18; i++) {
            System.out.print("*");
        }
    }
}


   */
// ������� 2.12
//�������� �����, ������� ������� �� ����� ��������� �����, ������
//������ �� ������-���� �������.hourglass

 /*   public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("������� ������ ������");
            n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i <= j & i <= (n + 1) - j | (i >= j & i >= (n + 1) - j)) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                    if (j % n == 0) {
                        System.out.println();
                   }
                }
            }
        }
    }


  */
    // ������� 2.14
//�������� �����, ������� ��������� � ���������� ����� ����� � ���
//����� �� ����� �����, ������� ������ ���������� � ���������� �� 10.
 /* public static void main(String[] args) {

     Scanner pc = new Scanner(System.in);
     int n;
     System.out.print("������� ����� ����� :");
         n = pc.nextInt();
     System.out.println("�������� ����� ����� : " + (n + 10));

 }
 }
   */
    // ������� 2.15
//�������� �����, ������� ��������� � ���������� ����� ����� � ���
//����� �� ����� ����� �����, ������� ������ ���������� � ����������
//� 10 ���.

    /*   public static void main(String[] args) {
           Scanner pc = new Scanner(System.in);
           int n;
           System.out.print("������� ����� : ");
           n = pc.nextInt();
           System.out.println("���� ����� ����������� � " + n + " ��� ����� : " + (n * 10));

       }
   }
     */
// ������� 2.16
//�������� �����, ������� ��������� � ���������� ����� ����� � ���
//����� �� ����� ��� ����� ����� (������ � ��������� ������): �����,
//������ ���������� � ���������� �� 6, � �����, ������ ���������� �
//���������� �� 12.
  /*  public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int n;
        System.out.print("������� ����� ����� : ");
        n = pc.nextInt();
        System.out.println("����� ������ ���������� �� 6 : " + (n + 6));
        System.out.println("����� ������ ��������� �� 12 : " + (n - 12));
    }
}
   */
// ������� 2.17
//�������� �����, ������� ��������� � ���������� ����� ����� � ��
//��� ������� �� ����� ��� �������.
 /*   public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int n;
        System.out.print("������� ����� : ");
        n = pc.nextInt();
        System.out.println("������� ������ ����� ����� : " + n * n);
    }
}
  */
// ������� 2.18
//�������� �����, ������� ��������� � ���������� ����� ����� � ��
//��� ������� �� ����� ��� ������� � ��� �� ���, � ����� ���� ���� &.
  /*  public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int n;
        int x = 2;
        int y = 3;
        System.out.print("������� ����� ����� : ");
        n = pc.nextInt();
        System.out.printf("%.0f & %.0f", Math.pow(n,x), Math.pow(n,y));
    }
}
   */

// ������� 2.19
//�������� �����, ������� ��������� � ���������� ����� ����� � ���
//����� �� ����� ��������� ��� �������� (��� - � ����� ������, ���
//�������� ��������): �����, ������ ���������� � ���������� �� 1,
//�����, ��������� � ����������, � �����, ������ ���������� � ������
//���� �� 1.
/* public static void main(String[] args) {

    Scanner op = new Scanner(System.in);
        int i;
        int p;
        int r;
    System.out.print("������� ����� ����� : ");
        i = op.nextInt();
        p = i - 1;
        r = i + 1;
    System.out.print(p + " " + i + " " + r);
    }
}
 */
// ������� 2.20
//�������� �����, ������� ��������� � ���������� ����� ����� � ���
//����� �� ����� ��������� �������� (������ � ��������� ������): ���
//�� ��������� ����� � �����, ��������������� ���������� �����.

  /*  public static void main(String[] args) {
        System.out.print("������� ����� ����� : ");
        Scanner op = new Scanner(System.in);
        int n;
        n = op.nextInt();
        System.out.println(n);
        System.out.println("-" + n);
    }
}
   */
// ������� 2.21
//�������� �����, ������� ��������� � ���������� ����� ����� � ���
//����� �� ����� ��������� �������� (������ � ��������� ������): ���
//����� �����, ��������� �� ���������, ��������� � ����������.

  /*  public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
            int n;
        System.out.print("������� ����� ����� : ");
             n = op.nextInt();
             int i;
             int j;
             j = n + 3;
        for (i = n + 1; i <= j; i++) {
          if(i == j+1){
            break;
           }
            System.out.println(i);
        }
    }
}
   */
    // ������� 2.22
//�������� �����, ������� ��������� � ���������� ��� ����� ����� �
//������� �� ����� ��������� �������� (������ � ��������� ������):
//����� ��������� �����, �� ������������, ������� ����� ������ �
//������, ������� ����� ������ � ������.
 /*  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
          int a;
          int b;
      System.out.print("������� ��� ����� ����� : ");
          a = in.nextInt();
          b = in.nextInt();
      System.out.println(a + b);
      System.out.println(a * b);
      System.out.println(a - b);
      System.out.println(b - a);
  }
}
  */
    // ������� 2.23
//�������� �����, ������� ��������� � ���������� ��� ����� ����� �
//������� �� ����� ��������� �������� (������ � ��������� ������):
//������� ������� ����� (��������) � ����� ��������� ��������� �����.

 /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        double c;
        System.out.print("������� ��� ����� ����� : ");
        a = in.nextInt();
        b = in.nextInt();
        c = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.printf("%.0f\n", Math.pow(a, 2));
        System.out.printf("%.0f\n", Math.pow(b, 2));
        System.out.printf("%.0f", c);
    }
}
  */
    // ������� 2.24
    // �������� �����, ������� ��������� � ���������� ��� ����� �����,
//������ �� ������� ������������ ����� ������ ����� �� ������ �����
//��������� � ������� �� ����� ��������� �������� (������ � �������
//��� ������): ������� �������������� � ��� ��������.

    /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, area, perimtr;
        System.out.print("�������� ��� ����� ����� � ��. : ");
        a = in.nextInt();
        b = in.nextInt();
        area = a * b;
        perimtr = (a + b) * 2;
        System.out.println("������� �������������� : " + area + " ��.");
        System.out.println("��������� �������������� : " + perimtr + " ��.");
    }
}
     */
    // ������� 2.25
//�������� �����, ������� ��������� � ���������� ��� ����� �����,
//������ �� ������� ������������ ����� ������ ����� �� ������ ���������������� �
// ������� �� ����� ��������� �������� (������ - � ��  �
//������� ������): �����, ������� ������ �� ������, ����� ������� �
//����� ��������.
 /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, area, volum, areaA, areaC;
        System.out.print("������� ��� ����� ����� : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        area = 2 * (a * b + b * c + a * c);
        volum = a * b * c;
        areaA = a * b;
        areaC = c * b;
        System.out.println("������� : " + area);
        System.out.println("���� : " + volum);
        System.out.println("������� ����� � : " + areaA);
        System.out.println("������� ����� C : " + areaC);
    }
}
  */
    // ������� 2.26
//�������� �����, ������� ��������� � ���������� ��� ����� �����,
//������ �� ������� ������������ ����� ��� ��������, � ������ - ���
//������ (�������) ���. ����� ������ ������� �� ����� ������� (� ��
//��� �����).
  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ���� ��� �������� : ");
        int youBafDay;
        youBafDay = in.nextInt();
        System.out.print("������� ����� ������ ��� : ");
        int today;
        today = in.nextInt();
            if ((today - youBafDay) == 1) {
                System.out.println("��� : " + (today - youBafDay) + " ���");
            }
                if ((today - youBafDay) <= 4 & (today - youBafDay) >= 2) {
                    System.out.println("��� : " + (today - youBafDay) + " ����");
                     }
                    if ((today - youBafDay) > 4) {
                        System.out.println("��� : " + (today - youBafDay) + " ���");
                    }

                }
            }
               */
    // ������� 2.27
//�������� �����, ������� ��������� � ���������� ����� �����, ����
//���������� ����� ����� ���� � �������, � ��������� �� ����� �����
//����� ���� � �����������.

    /*  public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          float n;
          System.out.print("������� ��� ���, ����� ����� � ������� : ");
          n = in.nextInt();
          float f = (n / 1000);
          System.out.println("��� ��� � ����������� : " + f);
      }
  }
     */
// ������� 2.28
//�������� �����, ������� ��������� � ���������� ����� �����, ����
//���������� ����� ���������� � ��������, �������� �� ����� - � ��
//���������. ����� ����� ������� ������� �� ����� ��� �� ���������� �
//������ � ����������. ��������, ��� 1���������=185.2 ����
 /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("������� ����� : ");
        double f;
        f = in.nextInt();
        double metr = (f / 185.2);
        double kilometr = (metr / 1000);
        System.out.printf("%.2f\n",metr);
        System.out.printf("%.2f", kilometr);
    }
}
  */
    //
//������� 2.29
//�������� �����, ������� ��������� � ���������� ����� �����, ����
//���������� ����� ���������� ������� � �����, � ������� �� ����� ���� ���
// ���������� �������, �� � ��������

  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� ����� : ");
        int h, m, n;
        n = in.nextInt();
        h = n;
        m = h * 60;
        System.out.print(m);
    }
}
   */
    // ������� 2.31
//������������ ������� ���� �������������� ��� �������� ���������
//��� ����� ���� �� ������� �������� ����.
//�������� �����, ������� ��������� � ���������� ��� �����, ������
//�� ������� - ����� ����, � ������ - ��� ��������.
//����� ������ ���������� � ������� �� ����� �������� ������������
//������� ����.

    /*  public static void main(String[] args) {
          ���� ����Scanner in = new Scanner(System.in);
          System.out.print("���� ���� : ");
          int weight;
          weight = in.nextInt();
          System.out.print("������� �������� ���� : ");
          int speed;
          speed = in.nextInt();
          double energy;
          energy = weight * speed * speed / 2;
          System.out.printf("������������ ������� ���� ����� : %.0f", energy);
      }
  }

     */
    // ������� 2.32
//�������� �����, ������� ��������� � ���������� ����� � ������� ��
//����� �������� ��� ��������.

 /*   public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int number;
        System.out.print("������� ����� ����� : ");
        number = op.nextInt();
        int reversNumber = 0;
        while (number != 0) {
            reversNumber = reversNumber * 10 + number % 10;
            number /= 10;
        }
        System.out.println(reversNumber);
    }
}

  */