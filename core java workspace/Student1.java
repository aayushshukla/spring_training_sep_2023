class Student1
 {
  String sname;
  int  rno;
  Student1()
    {
     System.out.println("welcome in java...");
    }
  Student1(String name,int rollno) {

           sname=name;
           rno=rollno;
          }


  public static void main(String...s)
   {
      Student1 st1= new Student1();
      Student1 st = new Student1("One piece",1);
      System.out.println("Student name is"+st.sname);
      System.out.println("Student rollno is"+st.rno);
      System.out.println("Student name is"+st1.sname);
      System.out.println("Student rollno is"+st1.rno);
    }
}