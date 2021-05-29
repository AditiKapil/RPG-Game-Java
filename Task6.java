public class Task6
{
  public static void main(String args[])
  {
    new Task6 ();
  }
  
  
  public Task6 ()
  {
    title6 ();
    intro6 ();
    startGame ();
  }
  
  public void title6 () //Write ascii ver of title here
  {
  System.out.println(".------..------..------..------.     .------..------..------.     .------..------..------..------..------..------..------..------.");
  System.out.println("|L.--. ||O.--. ||V.--. ||E.--. |.-.  |A.--. ||N.--. ||D.--. |.-.  |M.--. ||O.--. ||N.--. ||S.--. ||T.--. ||E.--. ||R.--. ||S.--. |");
  System.out.println("| :/\\: ||:/\\ || :(): || (\\/) ((5))| (\\/)|| :(): || :/\\: ((5))| (\\/ || :/\\:|| :(): || :/\\: ||:/\\:|| (\\/)|| :(): || :/\\:|");
  System.out.println("| (__) || :\\/ || ()() || :\\/:|'-.-.| :\\/ || ()() || (__) |'-.-.| :\\/:|| :\\/:|| ()() || :\\/: ||(__) || :\\/:|| ()() || :\\/:|");
  System.out.println("| '--'L|| '--'O|| '--'V|| '--'E|((1)) '--'A|| '--'N|| '--'D| ((1)) '--'M|| '--'O|| '--'N|| '--'S|| '--'T|| '--'E|| '--'R|| '--'S |");
  System.out.println("`------'`------'`------'`------'  '-'`------'`------'`------'  '-'`------'`------'`------'`------'`------'`------'`------'`------'");
  }
  public void intro6 () //Write the intro of the first task (DO IT AT THE END)
  {
    System.out.println ("");
  }
  
  //Add game/task (Pokemon Game *edited*)
  public void startGame ()
  {
    String again = "y";
    while (again.equals ("y"))
    {
      //Squirtle == The dotor's companion (user)
      //Charmander == Elton Pope
      System.out.println ("You and Elton Pope are now fighting for your lives!.");
      int charHP = 40;
      int squirtHP = 40;
      //the loop for one game
      while (charHP >= 0 && squirtHP >= 0)
      {
        //the HP update
        if (charHP != 40 || squirtHP != 40)
          printSlow ("***** The battle continues.... *****");
        System.out.println (" Elton Pope's HP:\t" + charHP);
        System.out.println (" Your HP:\t" + charHP);
        System.out.println ("");
        //User chooses an attack
        System.out.println ("What attack do you want to choose?");
        System.out.println ("(1) Sonic Screwdriver ");
        System.out.println ("(2) Cutting Device ");
        System.out.println ("(3) Impluse Laser ");
        int choice = IBIO.inputInt ("What's your attack? ");
        //Elton Pope responds
        int rand = (int) (Math.random () * 3) + 1;
        if (rand == 1)
          System.out.println ("Elton Pope responds with a Sonic Screwdriver ");
        else if (rand == 2)
          System.out.println ("Elton Pope responds with a Cutting Device ");
        else if (rand == 3)
          System.out.println ("Elton Pope responds with a Impluse Laser ");
        //calculate the winner
        System.out.println ("");
        int winner = (int) (Math.random () * 2) + 1;
        int pts = (int) (Math.random () * 10) + 1;
        if (winner == 1)
        {
          System.out.println ("Elton Pope wins. ");
          squirtHP = squirtHP - pts;
        }
        else
        {
          System.out.println ("You win. ");
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
        System.out.println ("Elton Pope has lost the battle!");
        System.out.println ("You have won the battle!");
      }
      else
      {
        System.out.println ("You have lost the battle!");
        System.out.println ("Elton Pope wins the battle!");
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