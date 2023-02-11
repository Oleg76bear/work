package shcool;

public class Task {

// Задание 2.8
//Напишите класс, который присваивает переменной х значение 6, а за­
//тем выводит на экран: в первой строке - это значение, во второй -
//квадрат этого значения, в третьей - куб этого значения.

   public static void main(String[] args) {


        int x = 6;
        int sum  = x * x;
        int cub = x * x * x;
        System.out.println(x);
        System.out.println(sum);
        System.out.println(cub);
    }
}


    // Задание 2.9
// Напишите класс, который присваивает переменной х значение 9, а за­
//тем выводит на экран: в первой строке - это значение с поясняющей
//надписью (например, «значение х равно 9»), а во второй - квадрат
//этого значения (тоже с поясняющей надписью).

  /*  public static void main(String[] args) {
        int x = 9;
        int sqr = x * x;
        System.out.println("X exuals : " + x);
        System.out.println("Sqr exuals : " + sqr);
    }
}

   */
// Задание 2.10
//Напишите класс, который присваивает двум переменным значения, а
//затем выводит на экран: в первой строке значения обеих переменных
//(с поясняющими надписями), во второй - произведение этих пере­
//менных (с поясняющей надписью), в третьей - сумму этих перемен­
//ных (с поясняющей надписью).

 /*   public static void main(String[] args) {
        int one = 23;
        int two = 12;
        int multiply = one * two;
        int sum = one + two;
        System.out.println("Значение One : " + one + " Значение Two : " + two);
        System.out.println("Значение multiply : " + multiply);
        System.out.println("Значение sum : " + sum);
    }
}

  */

// Задание 2.11
//Напишите класс, который выводит на экран в одной строке ваше имя и
//фамилию, в друтой - телефон, все это - в рамке из «звездочек» ().
//Например:
//Иван Иванов
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
// Задание 2.12
//Напишите класс, который выводит на экран «песочные часы», состав­
//ленные из какого-либо символа.hourglass

 /*   public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n;
            System.out.println("Введите ширину фигуры");
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
    // Задание 2.14
//Напишите класс, который принимает с клавиатуры целое число и вы­
//водит на экран число, которое больше введенного с клавиатуры на 10.
 /* public static void main(String[] args) {

     Scanner pc = new Scanner(System.in);
     int n;
     System.out.print("Введите целое число :");
         n = pc.nextInt();
     System.out.println("Заданное число равно : " + (n + 10));

 }
 }
   */
    // Задание 2.15
//Напишите класс, который принимает с клавиатуры целое число и вы­
//водит на экран новое число, которое больше введенного с клавиатуры
//в 10 раз.

    /*   public static void main(String[] args) {
           Scanner pc = new Scanner(System.in);
           int n;
           System.out.print("Введите число : ");
           n = pc.nextInt();
           System.out.println("Ваше число увеличенное в " + n + " раз равно : " + (n * 10));

       }
   }
     */
// Задание 2.16
//Напишите класс, который принимает с клавиатуры целое число и вы­
//водит на экран два новых числа (каждое в отдельное строке): число,
//больше введенного с клавиатуры на 6, и число, меньше введенного с
//клавиатуры на 12.
  /*  public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int n;
        System.out.print("Введите целое число : ");
        n = pc.nextInt();
        System.out.println("Число больше введенного на 6 : " + (n + 6));
        System.out.println("Число меньше введеного на 12 : " + (n - 12));
    }
}
   */
// Задание 2.17
//Напишите класс, который принимает с клавиатуры целое число и за­
//тем выводит на экран его квадрат.
 /*   public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int n;
        System.out.print("Введите число : ");
        n = pc.nextInt();
        System.out.println("Квадрат вашего числа равен : " + n * n);
    }
}
  */
// Задание 2.18
//Напишите класс, который принимает с клавиатуры целое число и за­
//тем выводит на экран его квадрат и его же куб, а между ними знак &.
  /*  public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);
        int n;
        int x = 2;
        int y = 3;
        System.out.print("Введите целое число : ");
        n = pc.nextInt();
        System.out.printf("%.0f & %.0f", Math.pow(n,x), Math.pow(n,y));
    }
}
   */

// Задание 2.19
//Напишите класс, который принимает с клавиатуры целое число и вы­
//водит на экран следующие три значения (все - в одной строке, раз­
//деленные пробелом): число, меньше введенного с клавиатуры на 1,
//число, введенное с клавиатуры, и число, больше введенного с клавиа­
//туры на 1.
/* public static void main(String[] args) {

    Scanner op = new Scanner(System.in);
        int i;
        int p;
        int r;
    System.out.print("Введите целое число : ");
        i = op.nextInt();
        p = i - 1;
        r = i + 1;
    System.out.print(p + " " + i + " " + r);
    }
}
 */
// Задание 2.20
//Напишите класс, который принимает с клавиатуры целое число и вы­
//водит на экран следующие значения (каждое в отдельной строке): сно­
//ва введенное число и число, противоположное введенному числу.

  /*  public static void main(String[] args) {
        System.out.print("Введите целое число : ");
        Scanner op = new Scanner(System.in);
        int n;
        n = op.nextInt();
        System.out.println(n);
        System.out.println("-" + n);
    }
}
   */
// Задание 2.21
//Напишите класс, который принимает с клавиатуры целое число и вы­
//водит на экран следующие значения (каждое в отдельной строке): три
//целых числа, следующих за значением, введенным с клавиатуры.

  /*  public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
            int n;
        System.out.print("Введите целое число : ");
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
    // Задание 2.22
//Напишите класс, который принимает с клавиатуры два целых числа и
//выводит на экран следующие значения (каждое в отдельной строке):
//сумму введенных чисел, их произведение, разницу между первым и
//вторым, разницу между вторым и первым.
 /*  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
          int a;
          int b;
      System.out.print("Введите два целых числа : ");
          a = in.nextInt();
          b = in.nextInt();
      System.out.println(a + b);
      System.out.println(a * b);
      System.out.println(a - b);
      System.out.println(b - a);
  }
}
  */
    // Задание 2.23
//Напишите класс, который принимает с клавиатуры два целых числа и
//выводит на экран следующие значения (каждое в отдельной строке):
//квадрат каждого числа (отдельно) и сумму квадратов введенных чисел.

 /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        double c;
        System.out.print("Введите два целых числа : ");
        a = in.nextInt();
        b = in.nextInt();
        c = Math.pow(a, 2) + Math.pow(b, 2);
        System.out.printf("%.0f\n", Math.pow(a, 2));
        System.out.printf("%.0f\n", Math.pow(b, 2));
        System.out.printf("%.0f", c);
    }
}
  */
    // Задание 2.24
    // Напишите класс, который принимает с клавиатуры два целых числа,
//каждое из которых представляет собой размер одной из сторон прямо­
//угольника и выводит на экран следующие значения (каждое в отдель­
//ной строке): площадь прямоугольника и его периметр.

    /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, area, perimtr;
        System.out.print("Введитае два целых числа в см. : ");
        a = in.nextInt();
        b = in.nextInt();
        area = a * b;
        perimtr = (a + b) * 2;
        System.out.println("Площадь прямоугольника : " + area + " см.");
        System.out.println("Периметрт прямоугольника : " + perimtr + " см.");
    }
}
     */
    // Задание 2.25
//Напишите класс, который принимает с клавиатуры три целых числа,
//каждое из которых представляет собой размер одной из сторон паралдлелепипеда и
// выводит на экран следующие значения (каждое - в от  в
//дельной строке): объем, площадь каждой из граней, общую площадь и
//общий периметр.
 /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, area, volum, areaA, areaC;
        System.out.print("Введите три целых числа : ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        area = 2 * (a * b + b * c + a * c);
        volum = a * b * c;
        areaA = a * b;
        areaC = c * b;
        System.out.println("Площадь : " + area);
        System.out.println("Объм : " + volum);
        System.out.println("Площадь грани А : " + areaA);
        System.out.println("Площадь грани C : " + areaC);
    }
}
  */
    // Задание 2.26
//Напишите класс, который принимает с клавиатуры два целых числа,
//первое из которых представляет собой год рождения, а второе - ны­
//нешний (текущий) год. Класс должен вывести на экран возраст (в це­
//лых годах).
  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой год рождения : ");
        int youBafDay;
        youBafDay = in.nextInt();
        System.out.print("Введите какой сейчас год : ");
        int today;
        today = in.nextInt();
            if ((today - youBafDay) == 1) {
                System.out.println("Вам : " + (today - youBafDay) + " год");
            }
                if ((today - youBafDay) <= 4 & (today - youBafDay) >= 2) {
                    System.out.println("Вам : " + (today - youBafDay) + " года");
                     }
                    if ((today - youBafDay) > 4) {
                        System.out.println("Вам : " + (today - youBafDay) + " лет");
                    }

                }
            }
               */
    // Задание 2.27
//Напишите класс, который принимает с клавиатуры целое число, пред­
//ставляющее собой массу тела в граммах, и выводящую на экран массу
//этого тела в килограммах.

    /*  public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          float n;
          System.out.print("Введите ваш вес, целое число в граммах : ");
          n = in.nextInt();
          float f = (n / 1000);
          System.out.println("Ваш вес в килограммах : " + f);
      }
  }
     */
// Задание 2.28
//Напишите класс, который принимает с клавиатуры целое число, пред­
//ставляющее собой расстояние в единицах, принятых на флоте - в ка­
//бельтовых. После этого следует вывести на экран это же расстояние в
//метрах и километрах. Известно, что 1кабельтов=185.2 метр
 /*   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число : ");
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
//Задание 2.29
//Напишите класс, который принимает с клавиатуры целое число, пред­
//ставляющее собой промежуток времени в часах, и выводит на экран этот эже
// промежуток времени, но в секундах

  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число : ");
        int h, m, n;
        n = in.nextInt();
        h = n;
        m = h * 60;
        System.out.print(m);
    }
}
   */
    // Задание 2.31
//Кинетическая энергия тела подсчитывается как половина произведе­
//ния массы тела на квадрат скорости тела.
//Напишите класс, который принимает с клавиатуры два числа, первое
//из которых - масса тела, а второе - его скорость.
//Класс должен подсчитать и вывести на экран значение кинетической
//энергии тела.

    /*  public static void main(String[] args) {
          дите массScanner in = new Scanner(System.in);
          System.out.print("Ввеу тела : ");
          int weight;
          weight = in.nextInt();
          System.out.print("Введите скорость тела : ");
          int speed;
          speed = in.nextInt();
          double energy;
          energy = weight * speed * speed / 2;
          System.out.printf("Кинетическая энергия тела равна : %.0f", energy);
      }
  }

     */
    // Задание 2.32
//Напишите класс, который принимает с клавиатуры число и выводит на
//экран обратное ему значение.

 /*   public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        int number;
        System.out.print("Введите целое число : ");
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