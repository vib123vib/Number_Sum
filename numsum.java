import java.util.*
public class Add
  {
    public static void main(String []args)
    {
      static int sum(int a, int b){ return a+b;}
      Add a = new Add();
      //an example of use, always use object a to access sum function.
      System.out.println(a.sum(56,87));
    } 
    
  }
