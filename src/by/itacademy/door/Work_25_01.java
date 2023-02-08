package by.itacademy.task;

public class Work_25_01 {
    /*  public static void main(String[] args) {
          int[] array = {1, 2, 3, 1, 4, 8, 9, 1, 0, -5, 8, 9, 0};
          int[][] array = {{1, 2}, {3, 1},{6,5}};
             //    for (int i = 1; i < array.length; i++) {
       for(int[] i : array)
         // for (int i : array) {
           for (int j : i){
          }
          System.out.println(i);
      }
  }
     */
// final static String WELCOM_MASSEGE = "Hello"
  //  public class Box_25 {
        public static void main(String[] args) {

            Students oleg = new Students();
             oleg.name = "Oleg";
             oleg.famaly = "Pupkin";
           oleg.userName = "Zigmutovich";
             oleg.spec = "Programmer";

            System.out.println(oleg.name +  oleg.famaly + oleg.userName + oleg.spec );

            Students ivan = new Students();
            ivan.name = "Oleg";
            ivan.famaly = "Oleg";
            ivan.userName = "Oleg";
            ivan.spec = "Oleg";

            System.out.println(ivan.name +  ivan.famaly + ivan.userName + ivan.spec );

            Students petr = new Students();
            petr.name = "Oleg";
            petr.famaly = "Oleg";
            petr.userName = "Oleg";
            petr.spec = "Oleg";
            System.out.println(petr.name +  petr.famaly + petr.userName + petr.spec );
        }
    }

