public class Demo
{
   // object is accessed using reference variable phrase
    public static void main(String[] args)
                               {
      String phrase = "Change is inevitable";
      System.out.println("Original string:" + phrase );

      // Change what phrase points to
      phrase = "Things stay the same";
      System.out.println("New string:" + phrase );
    }
}
