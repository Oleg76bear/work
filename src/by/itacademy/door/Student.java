package by.itacademy.task;

 class Student {
     private String name;
     private String university;

     public Student(String name, String university) {
         this.name = name;
         this.university = university;
     }

     public void print() {
         System.out.println(name + " " + university);
     }

     public static void main(String[] args) {
         
         Student inginer = new Student("Grisha", "BNTU");
         Student lingvist = new Student("Valeria", "BSU");
         Student programmer = new Student("Petr", "BSUIR");

         inginer.print();
         lingvist.print();
         programmer.print();
     }


 }

