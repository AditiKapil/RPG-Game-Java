public class PokemonBattle
{
  public static void main(String args[])
  {
    new PokemonBattle ();
  }
  public PokemonBattle ()
  {
    String again = "y";
    while (again.equals ("y"))
    {
      System.out.println ("A charmander and a squirtle meet on a field.");
      int charHP = 40;
      int squirtHP = 40;
      //the loop for one game
      while (charHP >= 0 && squirtHP >= 0)
      {
        //the HP update
        if (charHP != 40 || squirtHP != 40)
          printSlow ("***** The battle continues.... *****");
        System.out.println (" Charmander's HP:\t\t" + charHP);
        System.out.println (" Squirtle's HP:\t" + charHP);
        System.out.println ("");
        //let squirtle choose an attack
        System.out.println ("What attack did does the Squirtle choose?");
        System.out.println ("(1) _______");
        System.out.println ("(2) _______");
        System.out.println ("(3) _______");
        int choice = IBIO.inputInt ("Squirtle's attack? ");
        //charmander responds
        int rand = (int) (Math.random () * 3) + 1;
        if (rand == 1)
          System.out.println ("Charmander responds with a _______");
        else if (rand == 2)
          System.out.println ("Charmander responds with a _______");
        else if (rand == 3)
          System.out.println ("Charmander responds with a _______");
        //calculate the winner
        System.out.println ("");
        int winner = (int) (Math.random () * 2) + 1;
        int pts = (int) (Math.random () * 10) + 1;
        if (winner == 1)
        {
          System.out.println ("Charmander wins. ");
          squirtHP = squirtHP - pts;
        }
        else
        {
          System.out.println ("Squirtle wins. ");
          charHP = charHP - pts;
        }
        System.out.println ("");
      }
      //the battle is over, print the winner
      System.out.println ("");
      printSlow ("***** The battle is over!!! *****");
      System.out.println ("");
      if (charHP < 0)
      {
        System.out.println ("Charmander has lost the battle!");
        System.out.println ("Squirtle wins the battle!");
      }
      else
      {
        System.out.println ("Squirtle has lost the battle!");
        System.out.println ("Charmander wins the battle!");
      }
    }
  }
  //In order for the PrintSlow to work
  public void printSlow (String s)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (100);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  }
}