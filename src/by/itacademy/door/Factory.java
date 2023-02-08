package by.itacademy.task;

 class Factory {
     private String name;
     private int emploueCount;


     public Factory(String name, int emploueCount) {
         this.name = name;
         this.emploueCount = emploueCount;

     }


         public void print () {
             System.out.println(name + " " + emploueCount);
         }


         public static void main (String[]args){

             Factory ibm = new Factory("Grisha", 10);
             Factory aple = new Factory("Valeria", 56);
             Factory horizont = new Factory("Petr", 8);

         }
     }






