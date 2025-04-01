public class Main {

   public static void main(String []args) {
      System.out.println("Recursive Methods");
      // neverEnd(); // causes a stack overflow error because infinite loop
   }

   //RECURSIVE methods called themselves to repeat over
   // to IDENTIFY a recursive method, look for its name again in the curly brackets
   
   public static void neverEnd() {
      System.out.println("Recursion is cool");
      neverEnd();

      // Contains at least one call to itself in the method body
   }




}
