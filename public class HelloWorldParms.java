public class HelloWorldParms 
{
   
   public static void main(String[] args)
   {
   
     System.out.println("Hello World parms");

     // Print out each parameter value:
     for (int iCount = 0; iCount < args.length; iCount++)
     {
         System.out.println("Parameter: " + iCount + " is: " + args[iCount]);
     }

   } // end main

} // end class HelloWorldParms