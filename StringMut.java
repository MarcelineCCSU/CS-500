public class StringMut
{
   //-----------------------------------------------------------------
   //  Prints a string and various mutations of it.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      String phrase = "Change is inevitable";
      String mutation;

      System.out.println("Original string: \"" + phrase + "\"");
      System.out.println("Length of string: " + phrase.length());

      // Create  a new string
      mutation  = phrase.toUpperCase();

      // Print mutatation string
      System.out.println("Mutation: " + mutation);
      System.out.println("Mutated length: " + mutation.length());
   }
}
