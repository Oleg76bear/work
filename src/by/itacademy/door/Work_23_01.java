 // public class Work_23_01 {
     // Дано три целых числа x, y, z.
     // 1. Вывести на экран сумму x y.  И z.
     // 2. Вывести
    /*   public static void main(String[] args) {
           int x = 3;
           int y = 53;
           int z = 35;
           if (x > z) {
               System.out.println("Сумма x + y " + x + y);
           } else {
               System.out.println(z);
           }
           System.out.println((x + y + z) / 3);
       }
   }
   */
    /*public static void main(String[] args) {
        int s = 9;
        for (int i = 1; i <= 9; i++) {
        System.out.print((i * s) + " ");
        }
        }
        }

     */
    /*  public static void main(String[] args) {
        int i = 1;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }
}

     */
  /*  public static void main(String[] args) {
        int i = 1;
        int s = 46;
        do {
            s = s + 3;
            i++;
        }
        while (i > 0) ;
            System.out.println("i = " + i);
        }

    }
    */
  /*  public static void main(String[] args) {
        int number = 0;
       while (number++ < 5) {
           System.out.println(number);
       }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
*/
 /*  public static void main(String[] args) {
        for (int i = 5; i < 10; i++) {
            for (int j = 5; j < 10; j++) {
                System.out.println(i * j + " ");
            }
            System.out.println(" ");
        }
    }
}
*
  */
  /*  public static void main(String[] args) {

        int i = 1;
        for (i = 1; i <= 512; i = i * 2) {
            System.out.println(": " + i);
        }
    }
}

   */

  /*  public static void main(String[] args) {
        char ch = '*';
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j <= 6; j++) {
               System.out.print("*");

                    // if (j != 0) {
                         System.out.print(" ");
                    // }
                }
                System.out.println();

            }
        }
    }


   */

 /*     public static void main(String[] args) {
         String s = "";
          for (int i = 1; i <= 10; i++) {
              System.out.println(s += "*" + " ");
             }
      }
  }


  */

  /*  public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= a; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            a++;
            System.out.println();
        }
    }
}

   */
     /*  for (int i = 0; i < 4; i++) {
           for (int j = 0; j <= 4; j++) {
               System.out.print("*");
               if (j <= i) {
                   System.out.print(" ");
                    }
                 }
          System.out.println("*");

       }
       System.out.println();
   }

}


      */


     /*   public static void main(String[] args) {
        // int[] array = new int[3]
        // int[] array = {1, 45, 467, 90};
        int[] array = {1, 2, 3, 1, 4, 8, 9, 1, 0, -5, 8, 9, 0};
        // array[0] = 10;
        //  String[] array = {"new", "array"};
        int min = array[0]; // 1
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                }
           }
            System.out.println(min);

        }

               // if (array[i] > max) {
              //      max = array[i];
                }
             //   System.out.println(max);



            //  System.out.println(array[3]);
            // System.out.println(array.length);






      */


     /*   public static void main(String[] args) {
         int[][] array = {
                 //  int[] array = {
                 {1, 2},
                 {3, 4, 3}
         };
         int max = array[0][0];
         for (int i = 0; i < array.length; i++) {
             for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max) {
                    max = array[i][j];
                }
                 System.out.print(array[i][j] + " ");
             }
             System.out.println();
         }
     }
 }


      //for (int i = 1; i < array.length; i++) {

      */
 /*   public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j <= i) System.out.print("8");
                }
                System.out.println();
            }
        }


  */
  /*   public static void main(String[] args) {
         int[] array = {1, 2, 3, 1, 4, 8, 9, 1, 0, -5, 8, 9, 0};
         int min = array[0]; // 1
         int max = array[0];
         max = min = array[0];
         for (int i = 1; i < 10; i++) {
             if (array[i] < min)
             { min = array[i]; }
             if (array[i] > max)
             { max = array[i]; }
         }
         System.out.println("max: " + max + " min: " +  min);
     }
 }

   */