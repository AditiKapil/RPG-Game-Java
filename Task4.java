public class Task4
{
  public static void main(String args[])
  {
    new Task4 ();
  }
  
  
  public Task4 ()
  {
    title4 ();
    intro4 ();
    startGame ();
  }
  
  public void title4 () //Write ascii ver of title here
  {
  System.out.println("    ____  ___        __  ");
  System.out.println("   / __ )/ (_)___   / /__");
  System.out.println("  / __  / / / __ \\/ //_/");
  System.out.println(" / /_/ / / / / / /  ,<   ");
  System.out.println("/_____/_/_/_/ /_//_/|_|  ");
  }
  public void intro4 () //Write the intro of the first task (DO IT AT THE END)
  {
    System.out.println ("");
  }
  
  //Add game/task (Diasy edited) 
  //Randomly gives you a number, and with that number, 
  //it either gives you "You blink" or "You don't blink" and if you do, the angeles
  //come alive and you end up diying.

  public void startGame ()
  {
    int random = (int)(10 * Math.random() )+5;
    System.out.println(random);
    
    int x;
    for(x = 1; x <= random; x++)
    {
      if(x%2 == 0)
      {
        System.out.println("You Blinked");
      }
      else
      {
        System.out.println("You did not Blink");
      }
      
      try
      {
        Thread.sleep (100);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
  //if you got "you blinked" then you die
   if (x%2 == 0)
   {
     System.out.println ("You've died laddy");
   }
   else
   {
     System.out.println ("Hooray old chap! You've survived!!!");
   }
                           
  }
  }