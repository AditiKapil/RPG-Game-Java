public class Nim
{
  public static void main (String args[])
  {
    new Nim ();
  }
  
  
  /* Fill in the methods using the comments 
   Don't touch the constructor or the turn method, your team has already finished them.
   */
  
  public Nim ()
  {
    char again = 'y';
    rules ();
    while (again == 'y')
    {
      int left = 15;
      int player = 2;
      String name1 = getName (1);
      String name2 = getName (2);
      
      while (left > 0)
      {
        if (player == 1)
          player = 2;
        else
          player = 1;
        drawLeft (left);
        whoseturn (player, name1, name2);
        left = turn (left);
      }
      whosewon (player, name1, name2);
      again = IBIO.inputChar ("Play again? (y/n) ");
    }
    System.out.println("\nThanks for playing the Game of Nim!");
  }
  
  
  public void rules ()
  {
    /*Write out:
     * 
     Gameof Nim
     Thereare 15 stones in the pile. Players take turns taking stones.
     Oneach turn, they can take one or two stones. The player who
     takes the last stone loses.
     */
    
    System.out.println("Game of Nim");
    System.out.println("Thereare 15 stones in the pile. Players take turns taking stones.");
    System.out.println("On each turn, they can take one or two stones. The player who");
    System.out.println("takes the last stone loses.");
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
    //write "Stones Remaining: " and the number.
    System.out.println("Stones Remaining " + left);
    //loop to draw one star for each stone left
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
    if(num ==1 || num == 2){
      return true;
    }else{
      return false;
    }
    //returns true if num is 1 or 2
    
    //returns false otherwise
   
  }
  
  
  public int turn (int left)
  {
    int amt = IBIO.inputInt ("How enter stones do you want to remove? ");
    while (!isValid (amt, left))
    {
      System.out.println ("That amount is invalid. Try a smaller number.");
      amt = IBIO.inputInt ("How enter stones do you want to remove? ");
    }
    return (left - amt);
  }
  
  
  public void whosewon (int player, String name1, String name2)
  { //if player is 1, then print name1 has lost. name2 forced them to take the last stone.
    if(player == 1){
      System.out.println(name1+" has lost. " + name2+ " forced them to take the last stone.");
    }else{
      System.out.println(name2+" has lost. " + name1+ " forced them to take the last stone.");
    }
    
    //otherwise print a similar message about name2 losing.
  }
}