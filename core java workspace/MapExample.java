import java.util.*;

class EmpData{
   public static void main(String...s)
    {
      LinkedHashMap <Integer,String> empMap = new LinkedHashMap<Integer,String>();

      empMap.put(101,"Chintu");
      empMap.put(102,"Pintu");
      Scanner sc = new Scanner(System.in);
      System.out.print("enter employee id to get value");
      int eid = sc.nextInt();
      System.out.println("value for given key"+eid+"="+empMap.get(eid));

     for(Map.Entry entry:empMap.entrySet())
          {
              System.out.println(entry);
              System.out.println("keys----");
               System.out.println(entry.getKey());
               System.out.println("values----");
               System.out.println(entry.getValue());
          }

     }




}