public class Task1
{
  char a = ' ';
  char b = ' ';
  char c = ' ';
  char d = ' ';
  char e = ' ';
  char f = ' ';
  char g = ' ';
  char h = ' ';
  char i = ' ';
  
  char turn = 'x';
  
  public static void main(String args[])
  {
    new Task1 ();
  }
  
  public Task1 ()
  {
    title1 ();
    intro1 ();
    startGame();
  }
  
  public void title1 ()//Write ascii ver of title here
  {
    System.out.println(".-----..-.           .---.  _                           .--.");
    System.out.println("`-. .-': :           : .--':_;                         : .-'");
    System.out.println("  : :  : `-.  .--.   : `;  .-..--.  .--.  .--.    .--. : `; ");
    System.out.println("  : :  : .. :' '_.'  : :   : :: ..'' '_.'`._-.'  ' .; :: :  ");
    System.out.println("  :_;  :_;:_;`.__.'  :_;   :_;:_;  `.__.'`.__.'  `.__.':_;  ");
    System.out.println("                                                            ");
    System.out.println("                                                            ");
    System.out.println("         .---.                            _  _ ");
    System.out.println("         : .; :                          :_;:_;");
    System.out.println("         :  _.'.--. ,-.,-.,-..---.  .--. .-..-.");
    System.out.println("         : :  ' .; :: ,. ,. :: .; `' '_.': :: :");
    System.out.println("         :_;  `.__.':_;:_;:_;: ._.'`.__.':_;:_;");
    System.out.println("                             : :               ");
    System.out.println("                             :_;               ");
  }
  
  public void intro1 () //Write the intro of the first task (DO IT AT THE END)
  {
    System.out.println (""); //INTRO
  }
  
  
  //Add game/task (Tic-Tac-Toe*semi-edited*)
  public void startGame() 
  {
    while (!winner ())
    {
      printboard ();
      makemove (turn);
      if (turn == 'x')
        turn = 'o';
      else
        turn = 'x';
    }
    printboard ();
    System.out.println ("The winner is " + printWinner ());
    
  }
  
  public void printboard ()
  {
    //The actual tic-tac-toe board
    
    System.out.println("  1    2    3");
    System.out.println("1  "+a+" | "+b+" | "+c+"");
    System.out.println("  ------------");
    System.out.println("2  "+d+" | "+e+" | "+f+"");
    System.out.println("  ------------");
    System.out.println("3  "+g+" | "+h+" | "+i+"");
  }
  
  
  public void makemove (char piece)
  //When the player makes the moves
  {
    int x, y = 0;
    if (piece == 'x') {
    x = IBIO.inputInt ("\nEnter the x-coordinate: ");
    y = IBIO.inputInt ("Enter the y-coordinate: ");
    while (!isValid (x, y))
    {
      System.out.println ("Error - invalid coordinate. Try again.");
      x = IBIO.inputInt ("\nEnter the x-coordinate: ");
      y = IBIO.inputInt ("Enter the y-coordinate: ");
    }
    }
    else {
      //Use a do while loop so that the computer can generate a random number once so that the computer can play as well
      do {
        
        x = (int)(Math.random() * 3) +1;
        y = (int)(Math.random() * 3) +1;
      } while (!isValid (x, y));
    //Carry on with the if statements  
    }
    if (x == 1 && y == 1)
      a = piece;
    else if (x == 2 && y == 1)
      b = piece;
    else if (x == 3 && y == 1)
      c = piece;
    else if (x == 1 && y == 2)
      d = piece;
    else if (x == 2 && y == 2)
      e = piece;
    else if (x == 3 && y == 2)
      f = piece;
    else if (x == 1 && y == 3)
      g = piece;
    else if (x == 2 && y == 3)
      h = piece;
    else if (x == 3 && y == 3)
      i = piece;
  }
  
  public boolean isValid (int x, int y)
  {
    //Picking the positions (where the player can place his/her player piece (X or O)
    if(x==1 && y==1 && a!=' '){
      return false;
    }else if(x==2 && y==1 && b!=' '){
      return false;
    }else if(x==3 && y==1 && c!=' '){
      return false;
    }else if(x==1 && y==2 && d!=' '){
      return false;
    }else if(x==2 && y==2 && e!=' '){
      return false;
    }else if(x==3 && y==2 && f!=' '){
      return false;
    }else if(x==1 && y==3 && g!=' '){
      return false;
    }else if(x==2 && y==3 && h!=' '){
      return false;
    }else if(x==3 && y==3 && i!=' '){
      return false;
    }else if((x >3 || x < 1) || (y > 3 || y < 1)){
      return false;
    }else{
      return true;
    } 
  }
  
  public boolean winner ()
  { //the first line a-b-c is a match
    if (a == b && a == c && a != ' ')
      return true;
    else if (d == e && d == f && d != ' ')
      return true;
    else if (g == h && g == i && g != ' ')
      return true;
    else if (a == d && a == g && a != ' ')
      return true;
    else if (b == e && b == h && b != ' ')
      return true;
    else if (c == f && c == i && c != ' ')
      return true;
    else if (a == e && a == i && a != ' ')
      return true;
    else if (c == e && c == g && c != ' ')
      return true;
    else
      return false;
  }
  
  public char printWinner ()
  { //returns who is in the winning condition
    if (a == b && a == c && a != ' ')
      return a;
    else if (d == e && d == f && d != ' ')
      return d;
    else if (g == h && g == i && g != ' ')
      return g;
    else if (a == d && a == g && a != ' ')
      return a;
    else if (b == e && b == h && b != ' ')
      return b;
    else if (c == f && c == i && c != ' ')
      return c;
    else if (a == e && a == i && a != ' ')
      return a;
    else if (c == e && c == g && c != ' ')
      return c;
    else 
      return c;
    
  }
} 
