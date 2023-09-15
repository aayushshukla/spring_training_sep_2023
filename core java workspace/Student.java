class Student
 {
  // a variable that declared inside a class but outside any method 
  int x;   // non static variable
  Student() {

              x=10;
             System.out.println("my constructor runs..");
   
          }

  public void show()
   {
     int y =0; // local variable need to instialised 
      System.out.println("the value of x "+x);
      System.out.println("the value of y "+y);
   }
  public static void main(String...s)
   {
      
      Student st = new Student();
       Student st1 = new Student();
       System.out.println("the value of x "+st.x);
       st.show();
   }

}