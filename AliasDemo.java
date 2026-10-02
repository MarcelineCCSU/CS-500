public class AliasDemo  
  
  // Perhaps try this with BlueJ
{
   //  a single object can be accessed using multiple reference variables
    public static void main(String[] args)
                               {
      String phrase = "Change is inevitable";
      String slogan, saying ;

      slogan = phrase ;
      saying = phrase ;

      System.out.println("Original string:" + phrase );
      System.out.println("Using slogan: " + slogan );
      System.out.println("Using saying: " + saying );

      // Change what phrase points to
      phrase = "Things stay the same";

      System.out.println("New string:" + phrase );
      System.out.println("Using slogan: " + slogan );
      System.out.println("Using saying: " + saying );
   }
}
