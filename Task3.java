public class Task3
{
  public static void main(String args[])
  {
    new Task3 ();
  }
  
  
  public Task3 ()
  {
    title3 ();
    intro3 ();
    startGame ();
  }
  
  public void title3 () //Write ascii ver of title here
  {
  System.out.println(" _______ _            ");
  System.out.println(" '   /    /        ___ ");
  System.out.println("     |    |,---. .'   `");
  System.out.println("     |    |'   ` |----'");
  System.out.println("     /    /    | `.___,");
  System.out.println("                       ");
  System.out.println("  .____   .                                .    _     ");
  System.out.println("  /       |     ___  _   __   ___  , __   _/_   /     ");
  System.out.println("  |__.    |   .'   ` |   /  .'   ` |'  `.  |    |,---.");
  System.out.println("  |       |   |----' `  /   |----' |    |  |    |'   `");
  System.out.println("  /----/ /\\__ `.___, \\/    `.___,/    |  \\__/ /   |");
  System.out.println("                                                     ");
  System.out.println(" __  __                      ");
  System.out.println(" |   |    __.   ,   . .___    ");
  System.out.println(" |___|  .'   \\ |   | /   \\ ");
  System.out.println(" |   |  |    |  |   | |   '   ");
  System.out.println(" /   /   `._.'  `._/| /       ");
  System.out.println("                             ");
  }
  public void intro3 () //Write the intro of the first task (DO IT AT THE END)
  {
    System.out.println ("");
  }
  
  //Add game/task (Guessing Game *edited*)

public void startGame ()
{              
    // This Program prints GuessingGame
 System.out.println ("Welcome to the Space-time vortex");
 System.out.println ("There are around 100 doors that Prisoner Zero could be hiding in. \nIt is your job to guess which door he might be in.");
 //(Wanna add)... Each try you do, you lose 5 pts.
 char continu = 'y';
 while (continu == 'y')
 {
 int random = (int) (Math.random () * 100 + 1);
 System.out.println ("random:");
 
 {        
 int numguess = 1; 
 int num = IBIO.inputInt ("Guess door #" + numguess + ": ");
 
 {
 while (num != random)
 {
     if (num < random)
     {
  numguess ++;
  System.out.println ("The door number is too low.");
     }
     else if (num > random)
     {
  numguess ++;
  System.out.println ("The door number is too high.");
     }
     
     num = IBIO.inputInt ("Guess door #" + numguess + ": ");

 }
 //When you get the right door
 System.out.println ("Bingo mate, you found the bloody door!.");
 System.out.println ("It only took " + numguess + " guesses. Good Job");
   
    }
 
 //Pts
    }

    }
}
}