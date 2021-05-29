public class Task2
{
  public static void main(String args[])
  {
    new Task2 ();
  }
  
  
  public Task2 ()
  {
    title2 ();
    intro2 ();
    startGame ();
  }
  
  public void title2 () //Write ascii ver of title here
  {
  System.out.println(" dMMMMMMP dMP dMP dMMMMMP         dMMMMMP dMMMMb  dMMMMb ");
  System.out.println("   dMP   dMP dMP dMP             dMP     dMP dMP dMP VMP ");
  System.out.println("  dMP   dMMMMMP dMMMP           dMMMP   dMP dMP dMP dMP  ");
  System.out.println(" dMP   dMP dMP dMP             dMP     dMP dMP dMP.aMP   ");
  System.out.println("dMP   dMP dMP dMMMMMP         dMMMMMP dMP dMP dMMMMP\"    ");
  System.out.println("                                                         ");
  System.out.println("   .aMMMb  dMMMMMP      dMMMMMMP dMP dMP dMMMMMP ");
  System.out.println("  dMP\"dMP dMP            dMP   dMP dMP dMP      ");
  System.out.println(" dMP dMP dMMMP           dMP   dMMMMMP dMMMP     ");
  System.out.println("dMP.aMP dMP             dMP   dMP dMP dMP        ");
  System.out.println("VMMMP\" dMP            dMP   dMP dMP dMMMMMP     ");
  System.out.println("                                                 ");
  System.out.println("   dMP dMP dMP .aMMMb   dMMMMb  dMP     dMMMMb ");
  System.out.println("  dMP dMP dMP dMP\"dMP dMP.dMP dMP     dMP VMP ");
  System.out.println(" dMP dMP dMP dMP dMP dMMMMK\" dMP     dMP dMP  ");
  System.out.println("dMP.dMP.dMP dMP.aMP dMP\"AMF dMP     dMP.aMP   ");
  System.out.println("VMMMPVMMP\"  VMMMP\" dMP dMP dMMMMMP dMMMMP\"  ");
  }
  
  public void intro2 () //Write the intro of the first task (DO IT AT THE END)
  {
    System.out.println (""); //INTRO
  }
  
  //Add game/task (Nim *edited*)
  
  public void startGame ()
  {
    char again = 'y';
    rules ();
    while (again == 'y')
    {
      int left = 25;
      int player = 2;
      String name1 = getName (1);
      String name2 = "Lady Cassandra";
      
      while (left > 0)
      {
        if (player == 1)
          player = 2;
        else
          player = 1;
        drawLeft (left);
        whoseturn (player, name1, name2);
        left = turn (left, player);
      }
      //If you win, Lady Cassandra will set you free
      //Otherwise, she will keep you captive
      whosewon(player, name1, name2); //ERROR
      //name1 = user (the Doctor's companion)
    //  if (whosewon == name1)
    //    System.out.println ("Congradulations! You have won the game! Lady Cassandra can now set you free!");
     // else
//        System.out.println ("Oh no! Looks like you have lost. Lady Cassandra has kept you captive");
    }
    }
  
  
  public void rules ()
  {
    System.out.println("Game of Gleed");
    System.out.println("Thereare 25 Altairian Dollar Coins in the pile. Each player can take turns taking the coins out of the pile.");
    System.out.println("On each turn, you can take at least one to four coins. The player who");
    System.out.println("takes the last coin loses.");
  }
  
  
  public String getName (int num)
  { //asks the player for their name - eg. Player #1: Enter your name:
    //use the num parameter to get the player number
    String name = IBIO.inputString("Player #"+num+" enter your name: ");
    //returns the name
    return name;
  }
  
  
  public void drawLeft (int left)
  { //make out a blank line to add white space
    System.out.println();
    //write "Coins Remaining: " and the number.
    System.out.println("Coins Remaining " + left);
    //loop to draw one star for each coin left
    for(int i = 0; i < left; i++){
      System.out.print("* ");
    }
  }
  
  
  public void whoseturn (int player, String name1, String name2)
  { //if player is 1, it prints that it is name1's turn
    if(player == 1){
      System.out.println(name1+"'s turn");
    }else{
      System.out.println(name2+"'s turn");
    }
    //otherwise, it prints that it is name2's turn
    
  }
  
  
  public boolean isValid (int num, int left)
  { //returns false if num is greater than left
    if(num == 1 || num == 2 || num == 3 || num == 4){
      return true;
    }else{
      return false;
    }
    //returns true if num is between 1-4
    
    //returns false otherwise
   
  }
  
  
  public int turn (int left, int player)
  {
    int amt;
    if (player == 1) //user
    {
      amt = IBIO.inputInt ("How enter stones do you want to remove? ");
      while (!isValid (amt, left))
      {
        System.out.println ("That amount is invalid. Try a smaller number.");
        amt = IBIO.inputInt ("How enter stones do you want to remove? ");
      }
    }
    else {
      //amt = (int)... [that part only goes once, then after return, it goes striaght to the while loop]
      amt = (int)(Math.random() * 4) + 1; 
      while (!isValid (amt, left))
      {
        amt = (int)(Math.random() * 4) + 1;
      }
      
      //do { [This is the do while statement version of it]
     //   amt = (int)(Math.random() * 4) + 1;
     // } while (!isValid(amt, left));
    }
    return (left - amt);
  }
  
  
  public void whosewon (int player, String name1, String name2)
  { //Prints which player won
    if(player == 1){
      System.out.println ("Congradulations! You have won the game! Lady Cassandra can now set you free!");
    }else{
        System.out.println ("Oh no! Looks like you have lost. Lady Cassandra has kept you captive");
    }
    
  }
}