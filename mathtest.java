public class mathtest
{
   public static void main (String[]args)
  {
    new mathtest();
  }
  public mathtest()
  {
    System.out.println ("Question 1: 6 + 2 + 7");
    int q1 = IBIO.inputInt ("Your answer:");
    int a1 = 6 + 2 + 7;
    System.out.println ("Correct answer:" + a1 + ".");
    System.out.println ("Your answer:" + q1 + ".");
    
    System.out.println ("\nQuestion 2: 253 - 23");
    int q2 = IBIO.inputInt ("Your answer:");
    int a2 = 253 - 23;
    System.out.println ("Correct answer:" + a2 + ".");
    
    System.out.println ("\nQuestion 3: 45 x 64");
    int q3 = IBIO.inputInt ("Your answer:");
    int a3 = 45 * 64;
    System.out.println ("Correct answer:" + a3 + ".");
    
    System.out.println ("\nQuestion 4: 900 / 20");
    int q4 = IBIO.inputInt ("Your answer:");
    int a4 = 900 / 20;
    System.out.println ("Correct answer:" + a4 + ".");
    
    System.out.println ("\nQuestion 5: 600 / 2 x 50");
    int q5 = IBIO.inputInt ("Your answer:");
    int a5 = 600 / 2 * 50;
    System.out.println ("Correct answer:" + a5 + ".");
  }
}