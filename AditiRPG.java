/*
 * 
 * Name: Aditi Kapil
 * Date: April, 19, 2018
 * 
 * Purpose: The Code for my Doctor Who themed Escape Room 
 * 
 */

//Importing java swing to create the Dialog boxes
import javax.swing.JOptionPane;

public class AditiRPG
{
  //Global variables
  String name = "";
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
    new AditiRPG ();
  }
  
  
  public AditiRPG ()
  {
    title ();
    introduction ();
  }
  
  //This is the Title
  public void title ()
  {
  System.out.println(" ______      __                         __                                  ");
  System.out.println("/\\  _  \\    /\\ \\                       /\\ \\__                               ");
  System.out.println("\\ \\ \\ \\ \\   \\_\\ \\  __  __     __    ___\\ \\ ,_\\  __  __  _ __    __    ____  ");
  System.out.println(" \\ \\  __ \\  /'_` \\/\\ \\/\\ \\  /'__`\\/' _ `\\ \\ \\/ /\\ \\/\\ \\/\\`'__\\/'__`\\ /',__\\ ");
  System.out.println("  \\ \\ \\/\\ \\/\\ \\ \\ \\ \\ \\_/ |/\\  __//\\ \\/\\ \\ \\ \\_\\ \\ \\_\\ \\ \\ \\//\\  __//\\__, `\\");
  System.out.println("   \\ \\_\\ \\_\\ \\___,_\\ \\___/ \\ \\____\\ \\_\\ \\_\\ \\__\\\\ \\____/\\ \\_\\\\ \\____\\/\\____/");
  System.out.println("    \\/_/\\/_/\\/__,_ /\\/__/   \\/____/\\/_/\\/_/\\/__/ \\/___/  \\/_/ \\/____/\\/___/ ");
  System.out.println("                                                                            ");
  System.out.println("                                                                            ");
  System.out.println("         ___      ____                    __                   ");
  System.out.println("       /'___\\    /\\  _`\\                 /\\ \\__                ");
  System.out.println("  ___ /\\ \\__/    \\ \\ \\/\\ \\    ___     ___\\ \\ ,_\\   ___   _ __  ");
  System.out.println(" / __`\\ \\ ,__\\    \\ \\ \\ \\ \\  / __`\\  /'___\\ \\ \\/  / __`\\/\\`'__\\");
  System.out.println("/\\ \\ \\ \\ \\ \\_/     \\ \\ \\_\\ \\/\\ \\ \\ \\/\\ \\__/\\ \\ \\_/\\ \\ \\ \\ \\ \\/ ");
  System.out.println("\\ \\____/\\ \\_\\       \\ \\____/\\ \\____/\\ \\____\\\\ \\__\\ \\____/\\ \\_\\ ");
  System.out.println(" \\/___/  \\/_/        \\/___/  \\/___/  \\/____/ \\/__/\\/___/  \\/_/ ");
  System.out.println("                                                               ");
  System.out.println("                                                               ");
  System.out.println(" __      __  __                ");
  System.out.println("/\\ \\  __/\\ \\/\\ \\               ");
  System.out.println("\\ \\ \\/\\ \\ \\ \\ \\ \\___     ___   ");
  System.out.println(" \\ \\ \\ \\ \\ \\ \\ \\  _ `\\  / __`\\ ");
  System.out.println("  \\ \\ \\_/ \\_\\ \\ \\ \\ \\ \\/\\ \\ \\ \\");
  System.out.println("   \\ `\\___x___/\\ \\_\\ \\_\\ \\____/");
  System.out.println("    '\\/__//__/  \\/_/\\/_/\\/___/ ");
  System.out.println("                               ");
  }
  
  
  //This is the Introduction
  public void introduction ()
  {
    name = IBIO.inputString ("Now then, what shall we call you?:   ");
    System.out.println ("Hello   " + name);
    printSlow ("It is a very rainy evening here in London, England.");
    London ();
    printSlow ("The foregnier's might've ought it to be quite catostrophic.");
    printSlow ("But it's the norm here for you and everyone else. But little did you know");
    printSlow ("that this was gonna be a very unusual evening. An evening you'll never forget");
    printSlow ("It's just a few more hours till closing time for Henrik's shop, (the shop you worked at).");
    printSlow ("You go down to the basement of the shop to gather a few things before closing time.");
    printSlow ("While down there, you notice that the plastic mannequins start the move around...");
    Man () ;
    printSlow ("Almost as if they were alive!");
    printSlow ("You couldn't believe what you were seeing...Walking mannequins?");
    printSlow ("That can't be real? Lost in your thoughts, you were startled by one of the Mannequins");
    printSlow ("trying to attack you...");
    printSlow ("Luckly, you get saved by a very mysterious man..");
    ninthdoc ();
    printSlow ("you have no clue as to who he is, what he does and why he was there. All you really cared about was that");
    printSlow ("he bloodly saved your life! You wanted to thank him, but as soon as you ran away from the shop");
    printSlow ("he was gone. It was a nack of time till you saw that same strange man come to you like a nutter.");
    printSlow ("You were about to thank him for saving your pecish self, but you were");
    printSlow ("starteled by a big blue police box that somehow popped up outta nowhere..");
    tardis ();
    printSlow ("The strange man chuckled and said 'Don't feel alarmed! There's nothing to worry about!");
    printSlow ("Oh pardon me, where are my manners. I'm The Doctor, and this here is");
    printSlow ("is my time travel box....aka the TARDIS! I go on all sorts of adventures with it and if you like,");
    printSlow ("you are more than welcome to come along'....You thought long and hard about what he said.");
    printSlow ("you thought **meh, it's not like I'm doing anything bloodly interesting here...");
    printSlow ("why not give it a try?**");
    printSlow ("'Yes I would love to come along with you!'");
    printSlow ("'Very well then! Off we go then shall we?'");
    printSlow ("And so you went, on a very long adventure with The Doctor.");
    printSlow ("You were ready for all the problems that might come in your way, and you were");
    printSlow ("ready to help him in anyway possible since you are now his companion");
    JOptionPane.showMessageDialog(null,"Note: The Doctor has the ability to regenerate himself into certain generations.\n(Some Generations are used based off of the shows seasons)\nShall we begin?");
    
    
    task1 ();
  }
  
    
    //Task1 Main program/////////////////////////////////////////////////////////////////////////////////////////////////
    public void task1 (){
    title1 ();
    intro1 ();
    char die = startGame1();
    
    
    //  char die = IBIO.inputChar ("Did you die? (y/n) ");
    while (die == 'y')
    {
      JOptionPane.showMessageDialog(null,"Here is your chance to survive! Answer this riddle/question correctly in order to survive.");
      System.out.println ("Riddle: I'm something borrowed, I'm something blue; You stole me, and I stole you; \nI'm quite old and not quite new; End of the world, what to do?"); 
      String ans1 = IBIO.inputString ("Answer:   ");
      if (ans1.equals("TARDIS") || ans1.equals ("tardis")){
        printSlow ("Hooray! Time to try this dimension again!");
        die = startGame1 ();
      }
      else
      {
        System.out.println ("You died");
        die = 'x';
      }
    }
    
    if (die == 'n') 
    {
      task2();
    }
    else // conclusion as the value of die == x
    {
      conclusion();
    }
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
  
  public void intro1 () //Write the intro of the first task
  {
    System.out.println ("You and The Doctor are off on a new adventure.");
    tardis ();
    System.out.print ("****First Century AD in Rome****");
    printSlow ("The Doctor regenerates into the 10th generation of himself");
    tenthdoc ();
    printSlow ("After witnessing an earthquake and a nearby mountain beginning to smolder.");
    Volcano () ;
    printSlow ("The Doctor realizes he has in fact arrived in Pompeii. One day before the eruption of Mount Vesuvius!");
    printSlow ("You both need to get out as soon as possible");
    printSlow ("You were both both being followed by a soothsayer.");
    soothsayer ();
    printSlow ("That Soothsayer then reports to the Sibyline Sisterhood that the prophesied man (The Doctor)");
    printSlow ("in the blue box, has arrived. It has been prophesied that his arrival may bring fire and death to Rome");
    printSlow ("Hence she captures both you and The Doctor.");
    printSlow ("Your mission now is to play a quick modified version of 'Tic-Tac-Toe' with the hot lava stones.");
    printSlow ("That way, you can escape the Sibylline Sisterhood,");
    printSlow ("find the TARDIS and go home");
  }
  
  
  //Add game/task
  public char startGame1() 
  {
    resetTicTacToe();
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
    char winner = printWinner();
    System.out.println ("The winner is " + winner);
    
    if (winner == 'x')
    {
      System.out.println ("Good job. You move on. ");
      return 'n';
    }
    else
    {
      return 'y';
    }
  }
  
  public void resetTicTacToe()
  {
    a = ' ';
    b = ' ';
    c = ' ';
    d = ' ';
    e = ' ';
    f = ' ';
    g = ' ';
    h = ' ';
    i = ' ';
    
    turn = 'x';
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
      } while (!isValidTicTacToe (x, y));
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
  
  public boolean isValidTicTacToe (int x, int y)
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
  
  
  
  //Task2 Main program/////////////////////////////////////////////////////////////////////////////////////////////////
  public void task2 ()
  {
    title2 ();
    intro2 ();
    char die = startGame2 ();
    
    // char die = IBIO.inputChar ("Did you die? (y/n) ");
    while (die == 'y')
    {
      JOptionPane.showMessageDialog(null,"Here is your chance to survive! Answer this riddle/question correctly in order to do the mission again.");
      System.out.println ("Riddle: What was the name of the first epiode featuring the Ninth Doctor?");
      String ans2 = IBIO.inputString ("Answer:   ");
      if (ans2 == ("Rose") || ans2.equals ("rose")){
        printSlow ("Hooray! Time to try this dimension again!");
        die = startGame2 ();
      }
      else
      {
        System.out.println ("You died");
        die = 'x';
      }
    }
    
    if (die == 'n')
    {
      task3();
    }
    else 
      //The end..go striaght to the conculsion
      conclusion ();
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
  
  public void intro2 () //Write the intro of the first task 
  {
    System.out.println ("The Doctor and you are off on another adventure");
    tardis ();
    System.out.println ("****Five Billion years into the future (Year: 5.5/apple/26****");
    printSlow ("The Doctor regenerates into the 9th generation of himself");
    ninthdoc ();
    printSlow ("You and The Doctor land on Platform One (which is a space station in orbit around Earth");
    Spaceship () ;
    printSlow ("You've arrived just in time for a party celebrating the final destruction");
    printSlow ("of Earth by the expansion of the Sun. It was of course all planned and hosted by the elite");
    printSlow ("Aliens whom have created Plateform One.");
    printSlow ("The problem was that while The Steward of Platform One was opening gifts during the party");
    printSlow ("He notices that one of the gifts had robotic spiders coming out of it.");
    printSlow ("Hence it started to kill and destroy everyone and everything in Platform One.");
    printSlow ("Both you and The Doctor found out that the person behind this plan was none other than");
    printSlow ("Lady Cassandra (the last living human that came from earth.)");
    ladycassandra ();
    printSlow ("Unfortunetly, you found out about Lady Cassandra before The Doctor.");
    printSlow ("Now you are captured and imprisoned by Lady Cassandra. But the only way that you can get out");
    printSlow ("is by playing a very famous counting game called 'Gleed'");
    printSlow ("You see, the rules of 'Gleed' is that if you win, Cassandra will release you, but if you lose, she gets to keep you captive");
  }
  
  //Add game/task
  
  public char startGame2 ()
  {
    rules ();
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
      char win = whosewon(player, name1, name2); 
      
    
    return win;
  }
  
  
  public void rules ()
  {
    JOptionPane.showMessageDialog(null,"Game of Gleed\nThere are 25 Altairian Dollar Coins in the pile. Each player can take turns taking the coins out of the pile.\nOn each turn, you can take at least one to four coins. The player who\ntakes the last coin loses.");
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
      
      //Do While ver.
      //do { [This is the do while statement version of it]
      //   amt = (int)(Math.random() * 4) + 1;
      // } while (!isValid(amt, left));
    }
    return (left - amt);
  }
  
  
  public char whosewon (int player, String name1, String name2)
  { //Prints which player won
    if(player == 1){
      System.out.println ("Congradulations! You have won the game! Lady Cassandra can now set you free!");
      System.out.println ("Good job. You move on. ");
      return 'n';
    }else{
      System.out.println ("Oh no! Looks like you have lost. Lady Cassandra has kept you captive");
      return 'y';
    }
    
  }
  

    //Task3 Main program/////////////////////////////////////////////////////////////////////////////////////////////////
    public void task3 () {
    title3 ();
    intro3 ();
    char die = startGame3 ();
    
    //char die = IBIO.inputChar ("Did you die? (y/n) ");
    while (die == 'y')
    {
      JOptionPane.showMessageDialog(null,"Here is your chance to survive! Answer this riddle/question correctly in order to do the mission again.");
      System.out.println ("Riddle: Wht does TARDIS stand for?"); 
      String ans3 = IBIO.inputString ("Answer:   ");
      if (ans3 == ("Time and Relative Dimension in Space")){
        printSlow ("Hooray! Time to try this dimension again!");
        die = startGame3 ();
      }
      else
      {
        System.out.println ("You died");
        die = 'x';
      }
    }
    
    if (die == 'n') 
      Task4();
    else
      //The end..go striaght to the conculsion
      conclusion ();
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
  
  public void intro3 () //Write the intro of the first task 
  {
    System.out.println ("You and The Doctor are back at it again with another adventure!");
    tardis ();
    System.out.println ("****." + name +"'s home in 1996****");
    printSlow ("The Doctor regenerates into the 11th generation of himself");
    eleventhdoc ();
    printSlow ("The Doctor arrives to your home when he accidently crash-landed his TARDIS onto");
    printSlow ("your front yard. You were very young, but decided to help the stranger");
    TardisCrash () ;
    printSlow ("While treating him over at your house (not like that was bloody strange in the 90's)");
    printSlow ("But what was even stranger was a crack that was in your bedroom. The Doctor sees it");
    printSlow ("and he instantly knew what it was! It was a tear in space-time, which lead to an Atraxi prision.");
    Spacetime () ;
    printSlow ("The Doctor then gets a message from the Atraxi heads of the escape of Prisoner Zero.");
    printSlow ("The Doctor rushes out so he can repair the TARDIS (in 5 mins)....");
    printSlow ("5 mins went by for The Doctor, but for you it was 12 years");
    printSlow ("The Doctor was ashtonished by the time change that he did not see");
    printSlow ("You two check the hidden door by a perception filter in your home. He then finds Prisoner Zero and demands that");
    printSlow ("he should leave...however, Zero does not listen. Instead he begins to attack!");
    Zero () ;
    printSlow ("You and The Doctor flee before he starts to attack. But just to their luck,");
    atraxi ();
    printSlow ("the Atraxi arrive in Earth's orbit demanding that they return Zero or else they will destroy the Earth in a nack of time!");
    printSlow ("Your mission now is to help The Doctor go and find Prisoner Zero before it's too late!!");
    
  }
  
//Add game/task
  
  public char startGame3 ()
  {              
    // This Program prints GuessingGame
    JOptionPane.showMessageDialog(null,"Welcome to the Space-time vortex\nThere are around 100 doors that Prisoner Zero could be hiding in. \nIt is your job to guess which door he might be in.");
    //(Wanna add)... Each try you do, you lose 5 pts.
    
    int random = (int) (Math.random () * 100 + 1);
    System.out.println ("random:");
    
    int numguess = 1; 
    int num = IBIO.inputInt ("Guess door #" + numguess + ": ");
    
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
    System.out.println ("Good job. You move on. ");
    return 'n';
    
    
  }
  
  
//Task4 Main program/////////////////////////////////////////////////////////////////////////////////////////////////
  public void Task4 ()
  {
    title4 ();
    intro4 ();
    char die = startGame4 ();
    
    // char die = IBIO.inputChar ("Did you die? (y/n) ");
    while (die == 'y')
    {
      JOptionPane.showMessageDialog(null,"Here is your chance to survive! Answer this riddle/question correctly in order to do the mission again.");
      System.out.println ("Riddle: Iain Glen portrayed Father Octavian in 'Flesh and Stone', but what HBO fantasy-"); 
      System.out.println ("drama series does he star in, as Jorah Mormont?");
      String ans4 = IBIO.inputString ("Answer:   ");
      if (ans4 == ("Game of Thrones")){
        printSlow ("Hooray! Time to try this dimension again!");
        die = startGame4 ();
      }
      else
      {
        System.out.println ("You died");
        die = 'x';
      }
    }
    
    if (die == 'n')
      task5();
    else
      //The end..go striaght to the conculsion
      conclusion ();
  }
  
  public void title4 () //Write ascii ver of title here
  {
    System.out.println("    ____  ___        __  ");
    System.out.println("   / __ )/ (_)___   / /__");
    System.out.println("  / __  / / / __ \\/ //_/");
    System.out.println(" / /_/ / / / / / /  ,<   ");
    System.out.println("/_____/_/_/_/ /_//_/|_|  ");
  }
  public void intro4 () //Write the intro of the first task
  {
    System.out.println ("You and The Doctor are on another adventure");
    tardis ();
    System.out.println ("****2007 Wester Drumlins****");
    printSlow ("The Doctor regenerates into the 10th generation of himself");
    tenthdoc ();
    printSlow ("You were a well known photographer in the Wester Drumlins");
    printSlow ("and for today's project, you decided to go to an abandoned");
    printSlow ("house to find some subjects to photograph.");
    House ();
    printSlow ("You met The Doctor beforehand, so you were prepared for");
    printSlow ("whatever would come in your way.");
    printSlow ("You were told that, there were many eerie looking statues in this abandoned house");
    printSlow ("hence, you made sure that you were being careful");
    printSlow ("However,it's been rumored that if you blinked infront of the 'Weeping Angels'");
    printSlow ("(A very famous statue). The Angel will come alive and kill you!");
    printSlow ("You arrive at the house, unaware of what to expect...");
    printSlow ("*Click....Clack....Boom!* The door behind you shuts....and all you could see was darkness...");
    printSlow ("You start to panic, but a few moments later the lights turn on");
    printSlow ("You then realize that you're in a room filled with Weeping Angels at every corner!");
    Weepingangeles ();
    printSlow ("Not only that, but there is a bloody blinking machine stuck on top of your head");
    printSlow ("This machine randomly thinnks of a number and goes back and forth as to wether or not");
    printSlow ("you blink or not blink...That means you only have a 50/50 chance in surviving this bloody abandoned house!");
  }
  
//Add game/task 
//Randomly gives you a number, and with that number, 
//it either gives you "You blink" or "You don't blink" and if you do, the angeles
//come alive and you end up diying.
  
  public char startGame4 ()
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
      return 'y';
    }
    else
    {
      System.out.println ("Hooray old chap! You've survived!!!");
      System.out.println ("Time for you to move on. ");
      return 'n';
    }
  }
  
  
  
//Task5 Main program/////////////////////////////////////////////////////////////////////////////////////////////////
  public void task5 ()
  {
    title5 ();
    intro5 ();
    char die = startGame5 ();
    
    
    // char die = IBIO.inputChar ("Did you die? (y/n) ");
    while (die == 'y')
    {
      JOptionPane.showMessageDialog(null,"Here is your chance to survive! Answer this riddle/question correctly in order to do the mission again.");
      System.out.println ("Riddle: What was the name of the Dalek's home planet?"); 
      String ans5 = IBIO.inputString ("Answer:   ");
      if (ans5 == ("Skaro")){
        printSlow ("Hooray! Time to try this dimension again!");
        die = startGame5 ();
      }
      else
      {
        System.out.println ("You died");
        die = 'x';
      }
    }
    
    if (die == 'n') task6();
    else
      //The end..go striaght to the conculsion
      conclusion ();
  }
  
  
  public void title5 () //Write ascii ver of title here
  {
    System.out.println("O))) O))))))                   O)) O))                                O))  ");
    System.out.println("     O))    O))                O)    O))                              O))  ");
    System.out.println("     O))    O))        O))     O)     O))   O))       O))     O)))) O)O) O)");
    System.out.println("     O))    O) O)    O)   O))  O))) O)    O)   O))  O))  O)) O))      O))  ");
    System.out.println("     O))    O))  O))O))))) O)) O)     O))O))))) O))O))   O))   O)))   O))  ");
    System.out.println("     O))    O)   O))O)         O)      O)O)        O))   O))     O))  O))  ");
    System.out.println("     O))    O))  O))  O))))    O)))) O))   O))))     O)) O)))O)) O))   O)) ");
    System.out.println("                                                                           ");
    System.out.println("O)) O))              O))                      ");
    System.out.println("O)    O))            O))                      ");
    System.out.println("O)     O))   O))     O))   O))    O))     O)))");
    System.out.println("O))) O)    O)   O))  O)) O))  O))  O))  )  O))");
    System.out.println("O)     O))O))))) O)) O))O))    O)) O)) O)  O))");
    System.out.println("O)      O)O)         O)) O))  O))  O) O) O)O))");
    System.out.println("O)))) O))   O))))   O)))   O))    O)))    O)))");
  }
  public void intro5 () //Write the intro of the first task
  {
    System.out.println ("You and The Doctor are on another adventure");
    tardis ();
    System.out.println ("****29th Century, United Kingdom****");
    printSlow ("The Doctor regenerates into the 11th generation of himself");
    eleventhdoc ();
    printSlow ("You're in the future where all of the citizens from the UK live onboard 'Starship UK'.");
    printSlow ("Serching for a new home amongst the stars as the Earth is being roasted by solar flares from the sun.");
    printSlow ("A few moments later...The Doctor notifies you, that he has found something amiss");
    printSlow ("and suspicious that is onboard the vessel. You notice a little girl crying in fear as she claims");
    printSlow ("she saw a being with a really creepy face that was smiling at her. You decided to go have a look for yourself.");
    Smilers ();
    printSlow ("'Goodness that is quite terrifying!' You said in shock! 'What kind of beastly man is he? Why are you even on");
    printSlow ("this ship?'...You then ask The Doctor if he knew anything....");
    printSlow ("Well" + name + "it looks like these men are called the 'Smilers' and it looks like");
    printSlow ("there main objective is to show some sort of video to all the adults on this ship.");
    printSlow ("Apparently, this video can ruin ones memory in less than a minute!");
    printSlow ("I suggest that we go find out where their power source is, and cut them off before the try");
    printSlow ("brainwashing anyone else'");
    printSlow ("You agreed and went off to find the power source.");
    printSlow ("Finally, both you and The Doctor found a door that led to the power source. However, it was blocked");
    printSlow ("by a human robot who loved to play games. The bot demands that you play a round of Tic-Tac-Toe with him");
    printSlow ("in order to enter the room...");
    printSlow ("Your mission now is to play and win a classic game of Tic-Tac-Toe in order");
    printSlow ("to get the power source, and turn off the Smiliers before everyone in the ship gets brainwashed!");
  }
  
//Add game/task 
  public char startGame5() 
  {
    resetTicTacToe();
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
    char winner = printWinner();
    System.out.println ("The winner is " + winner);
    
    if (winner == 'x')
    {
      System.out.println ("Good job. You move on. ");
      return 'n';
    }
    else
    {
      return 'y';
    }
  }
  

  
  
//Task6 Main program//////////////////////////////////////////////////////////////////////////////

  public void task6 ()
  {
    title6 ();
    intro6 ();
    char die = startGame6 ();
    
//    char die = IBIO.inputChar ("Did you die? (y/n) ");
    while (die == 'y')
    {
      JOptionPane.showMessageDialog(null,"Here is your chance to survive! Answer this riddle/question correctly in order to do the mission again.");
      System.out.println ("Riddle: What race are the Rani, the Monk and the Valeyard?"); 
      String ans6 = IBIO.inputString ("Answer:   ");
      if (ans6 == ("Time Lords")){
        printSlow ("Hooray! Time to try this dimension again!");
        die = startGame6();
      }
      else
      {
        System.out.println ("You died");
        die = 'x';
      }
    }
    conclusion ();
  }
  
  
  public void title6 () 
  {
//Write ascii ver of title here
    System.out.println(".------..------..------..------.     .------..------..------.     .------..------..------..------..------..------..------..------.");
    System.out.println("|L.--. ||O.--. ||V.--. ||E.--. |.-.  |A.--. ||N.--. ||D.--. |.-.  |M.--. ||O.--. ||N.--. ||S.--. ||T.--. ||E.--. ||R.--. ||S.--. |");
    System.out.println("| :/\\: ||:/\\ || :(): || (\\/) ((5))| (\\/)|| :(): || :/\\: ((5))| (\\/ || :/\\:|| :(): || :/\\: ||:/\\:|| (\\/)|| :(): || :/\\:|");
    System.out.println("| (__) || :\\/ || ()() || :\\/:|'-.-.| :\\/ || ()() || (__) |'-.-.| :\\/:|| :\\/:|| ()() || :\\/: ||(__) || :\\/:|| ()() || :\\/:|");
    System.out.println("| '--'L|| '--'O|| '--'V|| '--'E|((1)) '--'A|| '--'N|| '--'D| ((1)) '--'M|| '--'O|| '--'N|| '--'S|| '--'T|| '--'E|| '--'R|| '--'S |");
    System.out.println("`------'`------'`------'`------'  '-'`------'`------'`------'  '-'`------'`------'`------'`------'`------'`------'`------'`------'");
  }
  public void intro6 () //Write the intro of the sixth task 
  {
    System.out.println ("At last! You and The Doctor are on your last adventure!");
    tardis ();
    System.out.println ("****2005, downtown London****");
    printSlow ("The Doctor regenerates into the 10th generation of himself");
    tenthdoc ();
    printSlow ("The Doctor decides to go back in time, just to see how much London has chnged from their last adventure");
    printSlow ("to now.");
    System.out.println ("-----3rd floor in an appartment, on Sussex Street-----");
    Appartment ();
    printSlow ("(a man who is obsessed with The Doctor)... 'So in total, I've seen this strange Doctor man for about 3-4");
    printSlow ("times in my bloody life! But then he dissapears in that blue box of his. I also noticed that he always");
    printSlow ("changes each time he comes to visit..very odd indeed...'");
    System.out.println ("-----Back in downtown London-----");
    printSlow ("You and The Doctor are just taking a nice long stroll around Downtown to see the things that have changed");
    printSlow ("But then The Doctor notices someone oddly familar standing around the Tardis...Could it be that");
    printSlow ("strange man...Elton Pope?");
    Elton ();
    printSlow ("'I see you're quiet facinated by my choice of transportation Mr.Pope' said The Doctor.");
    printSlow ("'Please, call me Elton just like everyone else'...said Elton");
    printSlow ("'Ehm okay Elton...My name is The Doctor and thi..' 'that's" + name + "and you guys time travel with that");
    printSlow ("big blue box thingy and...'");
    printSlow ("'What?! How do you know all of that? Have you been stalking me throughout");
    printSlow ("all my journeys?'.. The Doctor looks a little concerned as to what kind of plans Elton might have since");
    printSlow ("it looks like he's been stalking The Doctor and his where abouts everytime he's come to London to visit");
    printSlow ("You whispered to The Doctor..'Does that mean he's obsessed with us and most probably wants us dead");
    printSlow ("because we might be a potenial threat towards everyone else in this world?'");
    printSlow ("Yes I'm afraid so...He will do whatever it takes to take us down so I'm not surprised, said The Doctor");
    printSlow ("'Why not we have a battle with him?' You suggested. 'If he wins, we'll tell him everything and die.");
    printSlow ("and if we win, then he can die and we'll be free'");
    printSlow ("'Oh bloody hell! I like your thinking Ms." + name + "'said The Doctor");
    printSlow ("Your final mission now is to battle against Elton Pope so he can leave you two alone!");
  }
  
//Add game/task
  public char startGame6 ()
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
      Screwdriver ();
      System.out.println ("(2) Cutting Device ");
      CuttingDevice ();
      System.out.println ("(3) Impluse Laser ");
      ImpulseLaser ();
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
      System.out.println ("Good job. You move on. "); //else part
      return 'n';
    }
    else
    {
      System.out.println ("You have lost the battle!");
      System.out.println ("Elton Pope wins the battle!");
      return 'y';
    }
    
  }
  
  
  
//The Conclusion
  public void conclusion ()
  {
    System.out.println ("****You fell through an open space hole which led you to the parallel universe****");
    System.out.println ("****You were semi consious, and all you heard were distant voices shouting your name...\t" + name + "....."+ name + "......" + name + "****\"");
    System.out.println ("****and after that, all you could see what white matter, and ever so slowly those voices you heard****");
    System.out.println ("****gradualy started fading away... [two months later..]****");
    printSlow ("You are woken up by the bright luminous lamp that was in your room. But for some reason it didn't really look like your room");
    Bed ();
    printSlow ("Being that one anxious lad....you started to freak out! 'Why am I here? This isn't my room...where's the sky? Why does everything seem so futureisitc?'");
    printSlow ("'Ohhh honey you're finally awake!' Your mum said in relif");
    printSlow ("'Awake? How long have I been sleeping for?'");
    printSlow ("'Oh honey bunches...you've been knocked out for good few months. How was heaven like?'");
    printSlow ("'Mum I'm not in the mood for any jokes!...Where are we? Where's The Doctor?'");
    printSlow ("'Hun, The Doctor saved your life!'");
    printSlow ("'Saved my life? Mum what are you saying? Is he dead?' You were anxious and you needed answers ASAP!");
    printSlow ("'Honey no he's fine...he's on the other side', she said calmly");
    printSlow ("'What side?', now you are confused more than ever. Where could this man be? You two promised to be on each other's sides no matter what");
    printSlow ("fighting evil, saving lifes, and discovering the different time dimensions in this universe");
    printSlow (name  + ", that small mistake that you made on your last trip was the reason why you two are seperated. You see, time traveling can be really risky");
    printSlow ("You make one small mistake in trying to save the world, and you end up creating a much smaller space-hole between the two universe's.");
    printSlow ("The universe that the Doctor is in, is the one that we used to live in, and the parallel universe (which is exactly the same as our universe,");
    printSlow ("except this one, is like traveling sideways without a proper nature course.)'");
    printSlow ("You were in utter shock! You never knew that there was another universe that existed, let alone one that acts and behaves almost like the one you used to live in");
    printSlow ("'So does that mean, I can never, ever be able to meet The Doctor again?'");
    printSlow ("'Honey...you know that you're considered dead in the other universe'");
    printSlow ("'Wait what? Me...dead? How is that bloody possible?' You were now feeling very enraged and scared at the same time");
    printSlow ("'Honey I'm so sorry...but that's life, some things stay while other things go..'");
    System.out.println ("****You sighed and looked through your window to check the view of the new universe that you are now living in****");
    Puniverse ();
    printSlow ("'I guess some things do happen for a bloody reason...'");
    printSlow ("_____________________________________________________________________________________________________________");
    printSlow ("To be continued...");
    //Concluding Quote
    JOptionPane.showMessageDialog(null,"The universe is big, it's vast and complicated,\nand ridiculous and sometimes, very rarely,\nimpossible things just happen and we call them miracles.\n -The Doctor");
  }
           
   
  //PrintSlow
  //In order for the PrintSlow to work
  public void printSlow (String s)
  {
    for (int i = 0 ; i < s.length () ; i++)
    {
      System.out.print ("" + s.charAt (i));
      //sleep for a bit after printing a letter
      try
      {
        Thread.sleep (90);
      }
      catch (InterruptedException m)
      {
        ;
      }
    }
    System.out.println ();
  }
  
  
  //ASCII ARTS
  //Here are all the Ascii art that is needed for this program
  //Tardis Ascii
  public void tardis ()
  {
    System.out.println("                 _.--._");
    System.out.println("                 _|__|_");
    System.out.println("     _____________|__|_____________");
    System.out.println("  .-'______________________________'-.");
    System.out.println("  | |________POLICE___BOX__________| |");
    System.out.println("  |  |============================|  |");
    System.out.println("  |  | .-----------..-----------. |  |");
    System.out.println("  |  | |  _  _  _  ||  _  _  _  | |  |");
    System.out.println("  |  | | | || || | || | || || | | |  |");
    System.out.println("  |  | | |_||_||_| || |_||_||_| | |  |");
    System.out.println("  |  | | | || || | || | || || | | |  |");
    System.out.println("  |  | | |_||_||_| || |_||_||_| | |  |");
    System.out.println("  |  | |  _______  ||  _______  | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |_______| || |_______| | |  |");
    System.out.println("  |  | |  _______ @||@ _______  | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |_______| || |_______| | |  |");
    System.out.println("  |  | |  _______  ||  _______  | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |       | || |       | | |  |");
    System.out.println("  |  | | |_______| || |_______| | |  |");
    System.out.println("  |  | '-----------''-----------' |  |");
    System.out.println("_|__|//__________________________\\|__|_");
    System.out.println("'----'----------------------------'----'");
  }
  
  //Soothsayer Ascii
  public void soothsayer ()
  {
    System.out.println("              ...");
    System.out.println("             ;::::;");
    System.out.println("           ;::::; :;");
    System.out.println("         ;:::::'   :;");
    System.out.println("        ;:::::;     ;.");
    System.out.println("       ,:::::'  @ @  ;  ");
    System.out.println("       ::::::;       ;   ");
    System.out.println("       ;:::::;   _   ;       ");
    System.out.println("      ,;::::::;     ;'       ");
    System.out.println("    ;:::::::::`. ,,,;.    ");
    System.out.println("  .';:::::::::::::::::;,    ");
    System.out.println(" ,::::::;::::::;;;;::::;,  _");
    System.out.println(";`::::::`'::::::;;;::::: ,# )   ");
    System.out.println(":`:::::::`;::::::;;::: ;::#  )   ");
    System.out.println("::`:::::::`;:::::::: ;::::#   )    ");
    System.out.println("`:`:::::::`;:::::: ;::::::#__)   ");
    System.out.println(" :::`:::::::`;; ;:::::::::##      ");
    System.out.println(" ::::`:::::::`;::::::::;:::#       ");
    System.out.println(" `:::::`::::::::::::;'`:;::#      ");
    System.out.println("  `:::::`::::::::;'      `:#     ");
    System.out.println("   ::::::`:::::;'         `#     ");
  }
  
  //Lady Cassandra O'Brien Ascii
  public void ladycassandra ()
  {
    System.out.println("/((((/((((((((/(((((((((((((((((/(/((/////((((((((#(###(((((((/(((/((/////");
    System.out.println("(////(/((((((((((#(#######(((((((/////(//((((((###((((((((((((//(/////////");
    System.out.println("/(((//(((((((((((((((((((((((((/(//////(/(/(((((/(((/((///((/((//////////*");
    System.out.println("(///(//((//((((/(((((//////////////////(////////*#(*****//(((((/////*////");
    System.out.println("////(//(///(/#/(///(##%%&%@@@//****/////////*//@@@@%%@&//**/////*//////**");
    System.out.println("//////////(/*//////(((((&@@#@%%//***////****/%#@@@&%/**/////*/////////**/");
    System.out.println("////////////(/(///////////****************,/****//*/*****//*//*//////*//*");
    System.out.println("////////////////////////****,.,,*****///****,,,,,.,,*********/**********/");
    System.out.println("////////*/////////*//*****/*/,,*********/******,*,,,*********************");
    System.out.println("////*///////////////*********************************,****,**************");
    System.out.println("////////////////**//*/*/****************/*************,,,,*********//****");
    System.out.println("/*/////////*////*/*////*//*********/**/*/*/******************************");
    System.out.println("/////////////////*//*************************************//*****/********");
    System.out.println("*///////*///////////*/*///*/************/****,**********,**********,*****");
    System.out.println("//*/*///*//**/*///////**//**/****//####%##%(//**********************,****");
    System.out.println("*//////*/***//*//////*/**//**/((/(/((###(#/(/,/*****,**,***,,,***********");
    System.out.println("///*/**/////////**/*****//////%%&&&%%%%&&&%#,/*/**,*************,********");
    System.out.println("/****/////**/**/**********(/**,**/((/**/*////*,.,,,*,,****,**************");
    System.out.println("//**///*/***/**********/****,,,,,,,,,,,,,.....,,,,,,,,,,*****************");
    System.out.println("/////**///*******//******,***,***,,,,...,..,,,,,,,,,,,**,******,*********");
  }
  
  //Atraxi Ascii
  public void atraxi ()
  {
    System.out.println("                                                                               ");
    System.out.println("             ..*/*.        ....**.        ((.          *(*                     ");
    System.out.println("               .....       ..  ((.     .**..         **,..                         ");
    System.out.println("      ...         .        ..  ((.     .((         ..**.           ..               ");
    System.out.println("      ***..         ,,     ..  ((.     .((     ..  ((.    ..    ..,**            ");
    System.out.println("        .((        .((..   ..  ((.     .((     ..  ((. ...      *(*              ");
    System.out.println("           ((.        ..     ..  *(.  .,((,,...  ,,    ...    ((.                ");
    System.out.println("             *(((*      ...  ..  ,,   ..,,  ...,*((   .  .((((                      ");
    System.out.println("                 .(*      .(/..  ,,..,(/,,  ...,,  ..,,/(*      ...                  ");
    System.out.println("                   .((    .(/..    ...,,    ...  ..,,/(.    ....                      ");
    System.out.println("             .....    ,,/(* .((..  ...,,  ..,,,  ..,,     ..                     ");
    System.out.println("     *,           .. .  ,******..  (%%  ..   ..,,     .                         ");
    System.out.println("    ..,********.      ....,**//%%%%*,,,*%%%%/** .,,....       *********         ");
    System.out.println("      .********,......,,...,*##%%%%.   .%%%%##/ .,,..,,.......*********        ");
    System.out.println("               *////////*,.,/@@             %@&**,,..*********               ");
    System.out.println("       ........,,,,,,,,,,,*(#@@  .,,,,,,,,  %@&((((((.                             ");
    System.out.println("               .........  ,@%    .,%@@@%,,    ,@&,,,,                             ");
    System.out.println("                  ,,,,((((#@%    .,%@@@%,,    ,@&((((*,,,*((((                   ");
    System.out.println("             *((((((((,,,,,,/@@  .,,,,,,,,  %@&(/....     ,,,,(((((((((          ");
    System.out.println("      .((((((.,.........   ,/@@             %@%..,,((,....    ,,                    ");
    System.out.println("     (*  ......       ((((/,,  @@@@,   ,@@@@#(/..,,((. *(/....             ");
    System.out.println("    ..          .********,..  ////#%%%#,,//((/  ..((. ..,////....               ");
    System.out.println("               ***.,**..... .**,,,,***,,,,  ,*,  ....**.  ....//.  .             ");
    System.out.println("           ....***,,,,.....**//,,  .,. .,,  ,,,  ..,,**,..    **,..,.              ");
    System.out.println("       ....****.  ....  ..,**,,. .,*//*,    .,.    ..  ,**..    ****,           ");
    System.out.println("      .((((    ...      *(*  ,,../(*,*(*  ..   ,,  ..    .((                      ");
    System.out.println("      *               ((.    ..  ,,  .(*  ..   ,,  ....  .((                     ");
    System.out.println("                   .((       ..  *(. .(*  ..  .(*  ....     ((                       ");
    System.out.println("               *(((*       ..  ((.   .(*  ..  .(*    ..       ((.                 ");
    System.out.println("             *(.        ...    ((.   .(*  ..  .(*    ..         *(*                ");
    System.out.println("           ((.        ..    .((      .(*  ..  .(*    ..           .(*              ");
    System.out.println("           ..               .((      .(*  ..   .,**     .          ..         ");
    System.out.println("                            .((      .(*        .((    ...                            ");
  }
  
  
  //The Doctor Ascii
  //The Ninth Doctor Ascii
  public void ninthdoc ()
  {
    System.out.println("                 ,  /((&@@&@&%#*.                                            ");
    System.out.println("               . (#@@&&&&&&@&&@@@#                                           ");
    System.out.println("              &%@&%&&%&%((#(##%%&&@(*                                        ");
    System.out.println("             /&&&%%&%#((#((((/#(#%&&&%(");
    System.out.println("           .*#%%%%##/***/**/(((#(#(##(//*");
    System.out.println("           ,(((%%/*,,...,,,****(/////*,*(/                                     ");
    System.out.println("           ,((#//,.......     ,.,.,,...,*(,");
    System.out.println("           *####/,.,.....       .......,*(/                                    ");
    System.out.println("           ,%&&&%/,,,..,.......,......,**%");
    System.out.println("          **&&@@%(**,,....    ..... ...,,%*                                    ");
    System.out.println("           */#&&%/***,.. ........  ...,*//*");
    System.out.println("          *(,/(%(*,*,,,******,,.,,,,/%&/*");
    System.out.println("          ,*,/*/*,,*/(#%%%(#%%%/..%&(/*(//,                                    ");
    System.out.println("          *.,,,(*,,,..,*/****,,.  ,**//,,*,                                    ");
    System.out.println("           .,.,((/*,... .......,. .,,,.,,/                                     ");
    System.out.println("          .....((#(/*,.........,. .*,..,/.                                     ");
    System.out.println("               @%((((/*,,..,,,.....****//                                      ");
    System.out.println("            &%@@##(//(/,,,,..*&%/,,/*,/%");
    System.out.println("            (@@&@%#/***/*,***,,/%@@#%#(*                                       ");
    System.out.println("            @@@@%%&/*/**,,*((#%%#(/(#                                        ");
    System.out.println("           (@@@&%##@@@#//****/(##%#//*%                                        ");
    System.out.println("           @@@&%#((#&@@@%/,,,..,,**/                           ");
    System.out.println("          .&&&(/*((%@@@@&(//***/## ...                                          ");
    System.out.println("        %%%%%#####(,,//(%@@@@&&%#@@&&&%%(                        ");
    System.out.println("     %#%#%%#&%%######%###(//((#&(%@#/&@&@&&&%#                        ");
    System.out.println("    (#%&&&%#%((/////(((##((#%%%#%&%*(@##&@@&&&&&%%%                        ");
    System.out.println("   /%%%&%((((#(//******(####(#&%&&%#%%@(#&&&@@&&%%%#                       ");
    System.out.println("   (&&&%%#(%####(//*////(#%%%#%#@%%@@&%#%&&&&&%%%%%%%%");
    System.out.println("/&@@@&&&&%%%%%%###((((#%%%%&&@@@&@&&%%%&@@@@(#&&&&&&&&%&%%");
    System.out.println("%@@@@@@@@@@@&&&&&&&&%#(///(###%%&@@&&%%%&@@@&(%&&&&&@&%@&%#");
    System.out.println("%&@@&&&&@@&&&%%%%%%%%#####((#%%&&@@@&&&%%&&@@&(&@&&&@&&@@%%&@&%");
    System.out.println("%@@@@@@@@@@@&&&%%%%%%&%%%%%##(#%%&&&&&&@&&&&&@&/@@&&@&&@@&@@&& *  #");
    System.out.println("&@@@@@@@@@@@@@@@&&%%#%%%%%%%&&@@@@@@@@&%&&&&&&@%#&&@@&@@@@#(%&&@@@@#  #");
    System.out.println("&@@@&@@@@@&@@@@@@@@&%%&%%%%%%%%&&@@@@&%#%&&&&&@@#&@@@&@@@@%#%@@@@@&&&%%#");
    System.out.println("#@@@&&@@@@@&%%%%&@@@@&&&@@@@@@&@@@&%##%&&&&&&&&&&%&@@@@@@@&&&&&&@&&&&&%&%");
    System.out.println(".@@@%%%@@@@@@@@&%##((##((((///(#%%&&&&&&&&&&&&&&&%%@@@@@@@&@@@@&%%%%%%%&&&@@#");
    System.out.println("*&@@&&&&@@@@@@@@@@@@@@&%###(((###%%%%%%%%&&&&&@&&@%@&%##&%&&%&@@@@&%&@&&&&&&%  ");
    System.out.println("  @@@%%&&@@@@@@@@@@@@@@@@@&@&(((((((####%%%&&&&&/,,,,,,**(//#&@&%@@&@@@&&&@&.");
    System.out.println("  #@@@&%%%&@@@@@@@@@@@@@@@@@@@@@&&&&%%%%%#%%%%&&@@%.,.,,,,***.//&@@&@@&@@@@@@@(");
    System.out.println("   &@@@@&%##%&@@@@@@@@@&&&&&%%%%&%&&%%%%%####%&@&%%%*.,,,,,*(@@((&@@@@@@@@@@@@/");
    System.out.println("   (@@@@@@&%#%%&@@@@@@@@@@&@&&&%%%%%%###((##%%&&%%#%&*,,,*(%@@@##&@@@@@&@@@@@@ ");
    System.out.println("    &@@@@@@@&%%#%%@@@@@@@@@@@&%%%########%%#%&%###(%@&,#%%&%%&@(&@@@@@@@@@@@/");
    System.out.println("    /@@@@@@@@@((#%&@@@@@@@@@@@&&%%%%%%%%#%%%##((/(&@&@&%%&@@&&@@@@@@@@@@@@@&%");
  }
  //The Tenth Doctor Ascii
  public void tenthdoc ()
  {
    System.out.println("                  #@%&&%&&&%%@#");
    System.out.println("                (&&&%@%@@&@&&%#%%##");
    System.out.println("              /%#%&&&@@@%@@@@&&%@&%%#");
    System.out.println("             %@%@&%%&&@&@@@&@@@&&%(&&%");
    System.out.println("             %%%&%@&@%&@@@@@@@&@@@@&&@&&");
    System.out.println("           %@@%@&@@@@@&@@@@@@@%@@@@&@@@&&&");
    System.out.println("          &@&@&(@@&@&@@@@@@@@@@@@@@@@@@@@&&&");
    System.out.println("          &@&&@&@&&&&&@@@@@&&&%#%%%@@@@@@#&");
    System.out.println("          %@%%@%%%#(/###%#(/**,*/(#%%&@&&&%%");
    System.out.println("          %&%@(((/(******,,..,,,,,*(#%&@@&%&");
    System.out.println("         &&&%#//(****,,,,......,,,*/(#&&&@#&");
    System.out.println("         ###((/*****,,,......,,,,,**/#&%&&%%");
    System.out.println("         //&&,///****,,........,,****/(&&%##(");
    System.out.println("          /%%./(((//**,,..,,,*(%#(##/*/##(##(");
    System.out.println("           //.#####%%%%/,,*(#(#(//(*/,,*&%%#");
    System.out.println("           ((,*/(%/%&%/(#*.*///,%@(/(***,%%//");
    System.out.println("          (/.*//((/****(,,*,,,,,***,***,(%,/");
    System.out.println("           //(./***,,,,/(.,*,,...,,,,,**.#(*,");
    System.out.println("           /( ,/**,,,*#*.***,,..,,,,**./#**,/");
    System.out.println("            ,**.*/*,,,//,.*,*/,,.,,,***.#%**,");
    System.out.println("              , .,/***(%%((/(*,,,,,**//*%/.  ");
    System.out.println("                 .*///(((/(*********///*/  ");
    System.out.println("                 ../(#%##%##(((#/***///,. ");
    System.out.println("                  .//(/((###(/**/*///*/*,  ");
    System.out.println("                   ,*//**,,,,***////((/*");
    System.out.println("                   **(//*****///(#(//****/&&&");
    System.out.println("                   **(#########((/***,,,,&&&&&");
    System.out.println("                  ,*./(###(((///*,,....&&&&&&&&%");
    System.out.println("                #%,**#(((////**,.....&&&&&&&&&&&&&&&");
    System.out.println("               (%%%(//(////****.....&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println("              &&(#%&%##((/(///......%&&%&&&&&&&&&&&&&&&&&&&&&&&&&");
    System.out.println("             &&&@@#/(%&%##((((#.......&&%&&&&&&&&&&@@&&&&&&&&%%%%%%&&&&%");
    System.out.println("         %&@@&@@&%&**/#%%((##*.......&%&&&&&&&&@&&&&&&&&&%&&&%%%&%%&&&&&%%");
    System.out.println("    %&&&@@@&@%%%&(&*,/%#((,##%.. .%%%%%&&%&&&&&&&&&&&&%&&%%&%&&&%%&&&%&%%#");
    System.out.println("   &&&&%&@@&&@&&/&&@#,////#%&%@@&&%%%&&&&&&&&&&&&&%&&&&%&%&&&&&%%&&&%&&%%");
    System.out.println("@@%&&&&%&&@@&&&&%&&(#(%@@&@&&%%&@(&%%%&&&&&&&&&&&&&&&%&&&&%&&&&&&&&&%&&&%&&&%@@");
    System.out.println("@@&&&&&%&@&&&&@&%&&%(((%&&@%%&%@/&%%%%&&&%&&&&@&&&&&&%&&&&%&&&&&&&&&%&&&%%%&&%@");
    System.out.println("@#&&&%&%&@%&&&&&%&&(***/#@&%&@@%&%&%&&&&&&&&&&&&&&&&&%&&&&%&&&&&&&&&&%&&%%%&%%@");
    System.out.println("@#&&&&%&&&@&&&&%&&&,*//*%&&%&@/&&&%&&&&&&&%&&&&&&&&&&%&&&&&&%&&&&&&&&%%&&%%%%%#");
    System.out.println("@#%&&%#&&%&&&%&&&&%,../*&%@&&&&%%%&&&&&&&@&&&&&&%%&&&&&&&%&&%&&&&&&&&&%&&%%%%%%");
    System.out.println("@##%%&&%&@&&&&&&%,..*&&&&&&&&%&&&&&&%@&&%&&%&%%&&&%%&&%&&&&%%&&&&&&&%%&%%#%@@");
    System.out.println("@###%%#%%&&&&&&&&&&,.,%&%&@&&&&&&&&&%@&&%&%%%%%%%%%%%%%%%%&&&%%%%%%&&&&%%%%@@@@");
    System.out.println("@#&(%%#%&&&&&&&&&&.*%&&%@&&%&&%&%&&&&&&%%%%%%%%%%%%%%%&&&&&%%%%%&&&&%%%@@@@@@");
    System.out.println("@#%%#%&&&&&&&&&&&&,&&&%@@&%%%%%%&&&&&&%%%%%%%%%%%%%%%%&&&&&%%&%%&&&%%@@@@@@@@");
  }
  //The Eleventh Doctor Ascii
  public void eleventhdoc ()
  {
    System.out.println("                              ,&&&&&&&@@&&&@/");
    System.out.println("                           ,%@@@&&&&&&@@@&&&&&%/,,*,");
    System.out.println("                          &@@@@@@@&&%%%%&@&&@&&&&&&&&&");
    System.out.println("                        ,&@@@@@@@@@&%%&&&@@@&@&&&&&&@@&*");
    System.out.println("                       *%&&&&&&%%%&&&@@&@@@@@@&%&&&&@@@@@%");
    System.out.println("                      %&&@@@&&&&&@@@@@@@@@@@&&%&&&@@@@@@&*");
    System.out.println("                      %&@@&&&%&@@@@@@@@@&&&&&%%%&&&@@@@@@&");
    System.out.println("                      &&@@@&&@@@@%%&&&&%%%#((((#%&&@@@@@@(");
    System.out.println("                     /&@@@&@@%#(/*,....,,,,****/#%@@@@@@@@*");
    System.out.println("                     (@@&&&(/*,,,...,,,,,***/(#&@@@@@@@&,");
    System.out.println("                     (&@&&(/**,,,,,,,******//#%@@@@@@@@@%");
    System.out.println("                     #@@@&%(/*,,,,,,,,,,,,**/((%&@@@@@@&&&");
    System.out.println("                     ,%@@(//*,,,,,,,,,,,,*//(((#&@@@%%###");
    System.out.println("                      #@@&&&&(/***//(##(////((((%@&@((*");
    System.out.println("                     ,%@&%%##%/,/#%%(&&%&%%(///#@%%///(");
    System.out.println("                      %//(((/,.,**/(((/****/(#%%%(*#/");
    System.out.println("                      /(#/***(,.,***,,,,,,**/(%%%#//%/");
    System.out.println("                         %/**//,.,**/*,,,,*//(%###%&@&");
    System.out.println("                          #//(*,.,**/*,,,,*/(#(#####&(");
    System.out.println("                          ///(&%#&&%/,,,,**(((((####&/");
    System.out.println("                         ,((((/*/,,,**,**/(///(#%(#*");
    System.out.println("                           #(/%%%%###(**/*////(#%#(#*");
    System.out.println("                           /#((####/****//(/(#%%(((#**");
    System.out.println("                            /(/**,,,,,*//((%%&%(///,*/");
    System.out.println("                             *(/*****/(#%%@&%(/,.,,,,**#%.");
    System.out.println("                              %%%%%%&@@@&%#/.....,,*,(%#%");
    System.out.println("                             #,,.#%&@@@@&%%*........,,*(#%#%#%*");
    System.out.println("                           *@@@@@%(#&&%/,.....  ..,,((#####%###");
    System.out.println("                          &@@@&@@@&@@&@&&/  ..,/((#(########%#%#*");
    System.out.println("                    /#%@@@@&&&&&&@&&@@&&,...,*(((((((#####(%##%###/");
    System.out.println("             *#%%%%%&@@@@@&&@@@@&@&&&(.. /(((#/((#####((##%##%#%####(");
    System.out.println("          */##%%%%%##%&&&@@&%%%%@&&&%,./##(((#((##%&&%%#%#(%##%##%#%%#%#*");
    System.out.println("         ####%#%###%#%%%%&&&%/**,,**(&@@/(,*#((((#(#/#(######%########%#%%#%#%");
    System.out.println("        #%%%#%####%#%%%%%%%%,.......,*(#,./(#(#/#((#####(#(%((%((%#####%(%%#%%");
    System.out.println("       #%%%%######%#%%#%%##*..  ...,..,../#/#((((#(##(#((%###((#((#####%%(%###");
    System.out.println("      ##%%######%######%#((..   . ....  //#/#(#(#(##((#%##%(##(##(####%#%####%");
    System.out.println("     *#(%%%####%%######%%(,..   ...... *#/#/#(((((((#%######(#%(%#####%(%#%%%&");
    System.out.println("      ###%%###%##%######%#(,.   ...... ((#/#(%(##(((%(#####(#((%(##########%%%&");
    System.out.println("      ###%######%%######%(/..  ......./#(#(%((((#(#####(%(##(#########%#%%%%&");
    System.out.println("      %#%%%############%#(*.   ....../(#(#(((((#%######(#(##(%#(######%#%#%%%%&");
    System.out.println("      #%%%###%%###%####%((..  ......(#(#((((###((#(##((#(#(##(%#####%#%%%%%%&");
    System.out.println("     ,%%%%####%########%((.  ......(#(#(((#(#%#(##/#######(#((%#%#(#####&%%%%%&");
    System.out.println("     ,%%%###%%%%#%####%#(,.   .  .###(((((#%((###########%((#(#%#####%##%#%%%%&");
    System.out.println("     *%%%%%%##%#%###(##(#.. . ..,/#(((((#%#(%(#%(#######(##(%##%(##%%%%#%%%%%%&");
    System.out.println("     /%%#%##%%%#%%###%(((.. ... /((#((#(((%#(#((%#((##(#%#%##%###%%%##%#%%%%&");
    System.out.println("     (%%%%%%%%%%%#####(#*,...../#(((#&%#######(###%####(##%#%%#%#%%%%%##%%%%%%&");
    System.out.println("     #%%%###%%%%####(((#*..,  *###%@&%#((#(##%#(#(########%#%%#%%%%%&%%%%#%%%%%");
    System.out.println("     %%%%%%#%%%%%###((%#*.,...#(%@#%(##(#%#%##%#%%%#####%#%%#%#%%%&%%%%%%%%%%");
    System.out.println("    *%%%%%%%%%%%%%(#(#%(*....#&@&%%##%((((#%(%#(%(####%%%%&%%%#&%%%&&%%#&%%%%%%");
    System.out.println("    (%%%%%%%%%%%%%(((#%(,,..#&&####%###(#%(##(%#######%#%%%%%%%%&&&%##%%%%%%&");
  }
  
  //Sonic Screwdriver Ascii
  public void Screwdriver()
  {
    System.out.println("      .-.");
    System.out.println("    .-| |-.");
    System.out.println("   '._| |#|");
    System.out.println("      :-;");
    System.out.println("      /_\\");
    System.out.println("     |  '|");
    System.out.println("     |...|");
    System.out.println("     |___;");
    System.out.println("      |=H");
    System.out.println("      |_H_");
    System.out.println("     /   H");
    System.out.println("     |   H");
    System.out.println("     |___:");
    System.out.println("     /   \\");
    System.out.println("     |===|");
    System.out.println("     |   H");
    System.out.println("     |   H");
    System.out.println("     |   H");
    System.out.println("     |   H");
    System.out.println("     |   H");
    System.out.println("     |   H");
    System.out.println("     |===H");
    System.out.println("     '---' ");
  }
  
  //Weeping Angeles Ascii
  public void Weepingangeles ()
  {
    System.out.println("                                               /(//*//                                             ");
    System.out.println("                                              #/(#/(%((                                            ");
    System.out.println("                                              (***((/*%                                            ");
    System.out.println("                                  /(%(/())    ((((//***,   (///(//)                                ");
    System.out.println("                                 /(%%%#((#    ////@#((//   %(###&(/)                               ");
    System.out.println("                                *(&(((#%##    (#(/&%//(/   #(#(((/))                               ");
    System.out.println("                                (%(((((%(/     ((/&(#((   .((#(((/((*                              ");
    System.out.println("                               ,(/%%(((////(//*%#((**(//*/(((((///())                              ");
    System.out.println("                               (/(%/((((#//(((/*/(((#/*//(//((///%///                              ");
    System.out.println("                               /(###(#(##///////#/*/(/*/////(#///(/#//                             ");
    System.out.println("                               //#(/((((#/////*/(//(#(//////#(((#/%//,                             ");
    System.out.println("                               (%#((#/#(#(/////&/(((%%//*//(((//(///(/                             ");
    System.out.println("                               (((((#((((#(//(#(((//%#@///(/(/(/(/#/(*                             ");
    System.out.println("                               /////#(((((###((/((//((%(((%/(/(//#///*                             ");
    System.out.println("                               /#//%#(#(((((%//(/(/*//(((#((/(%/%(#(/*                             ");
    System.out.println("                               /((((#((((//#(#/(///*//(/((((#/(/(&%(/*                             ");
    System.out.println("                               (((((#(#(((////(//*(//((*#/#/(////(///,                             ");
    System.out.println("                               ((/((#(#(,/#*////#/#/%*///(((/(#(/((//                              ");
    System.out.println("                               /(//(((#( @#(&&%&&&(/(#&&%#/(/(/(#//))                              ");
    System.out.println("                               ,((/((((  /(/((/((#(/((#/((/..(/(/(/#/                              ");
    System.out.println("                               ./(((((/ ,/(/((/(/((/(/#/#(/( ,///(/(/                              ");
    System.out.println("                                /((/(/,(((//(/(*((////(/((/// //(/(/                               ");
    System.out.println("                                .(//((/((/////(*(#/(//(//(/(/.////(*                               ");
    System.out.println("                                 /((#(#(//////(/(#/(/(///(/(///(///                                ");
    System.out.println("                                 (((*/((//////((/#/(/(///(/(/( //(/                                ");
    System.out.println("                                  ((/(((((/////((#/(/(///#/((/ (//                                 ");
    System.out.println("                                  *(((((/((////((#///(/(*#/((/ (/.                                 ");
    System.out.println("                                    /#/(((/////((#*(((/(/#(/(/.                                    ");
    System.out.println("                                   /#(((((((/((#/((/(/#(//(*(//                                    ");
    System.out.println("                                   ((/(((/(//((#/((/(//(//(/(//                                    "); 
    System.out.println("                                 /#(((/#(/(/(##(/(/((((/#(/((///                                   ");
    System.out.println("                                 (((((##/((#*%///(*(/((/#(/(/(/(                                   ");
    System.out.println("                               ((((#(((/#*%(//*((/(*////#(//#/(#(#                                 ");
    System.out.println("                              #((##/(/(((%(((//#/((*(////#(//((((#(,                               ");
    System.out.println("                               ##(((/(%#((((//*#///##(/(((###(#(((#                                ");
  }
  
  //Smilers Ascii
  public void Smilers ()
  {
    System.out.println("                      #@@@@@@@@@@@@@@&&&&&@@@&@%%%%%%%%.                      ");
    System.out.println("                    (&&@@@@@@@@&&&&&&%%%%#####((########(##.                   ");
    System.out.println("                  %&&@@@@@@@@&%&%%%%%%##########(((((((((/(((/                 ");
    System.out.println("                /&&&&&@@@@@@&&&%%%%###((#(((((((((((/////////((,               ");
    System.out.println("              *%%%&&&&&&&&&&&###(((((/////////////*//****//////.)             ");
    System.out.println("             (%%%%%%&&&&&&&&%#((((((//////////******************/)           ");
    System.out.println("           /(#####%%%&&%##(//////**********,*********/******,,*,,,,)       ");
    System.out.println("         */(#####%%%%%%#(////***/*****/***,,**************,*,,,,,,,*//     ");
    System.out.println("        ,//((#%%%%%%%%#(/***(/**,*(/***(***(/**,///***,,,,,**,,,,,,.,,       ");
    System.out.println("        **/(/%%%%(*(@@#/*****((**,,((*,#*.%(/*,,//**//***,..,.,,*,,.,,,         ");
    System.out.println("        /*/*###((###%%(((((%@@&(*,.,(,.%*,#/*,*///,,,,,,******,,..,,,,,        ");
    System.out.println("        //*(##((((%@@@&&@(##(/*,.*/,.#*,*/*,..,***(##((((//**,,..,,,,//       ");
    System.out.println("        */,##(((#@&&@@@&&@@&@@#(/*/#*,/#/*,,****(###//%%###////*,,,..,,        ");
    System.out.println("        */.##((#@%&&&&&&%&@@@@@@&&&%##/////*/###%&%%%%#%%#(/(/*,...,,//       ");
    System.out.println("       .*/.(##(#@%((&&&&%##&@@@@@@&&%%%#((***/(#/&&%%%#(/###%#(/**,..,,*/      ");
    System.out.println("  /#&@@#(,*%####&@@#&&&&&&@@@@@@@@%%&&&%(/***/(#%&%%%%#**(##@(*//*,,,.,*(/(/*  ");
    System.out.println(" *%%%*%,*,(%%%%%%&@@@@@@@@@@@@&%#%&&&%(/***//(//#&%%/*,#&@//(//*,,,.,.,,,,,  ");
    System.out.println(" /@@@&,,*,/&&&&&%#%&&&&@@@@@@@&%#%%&%#(/*******/(##(//*///(#((/**,,*,,..,,,  ");
    System.out.println(" .@@@@%,(./&&&&%#%%&@@@@@&&@@@@&%%##&%#(///***(//,,,**//(###((//***/(/*,.*..   ");
    System.out.println("  @@@@(,/,/&&&%%%%&@@&&&%%&@@&%&%##%&%#(///********/**,****//*****((/,*,,,..   ");
    System.out.println("  %@@@(*//.#&&&%%&&&&#(/%@&*,/(,,%&&%%#(***,,,,,,*((***********(//**,.,,.    ");
    System.out.println("  .@@@(./(,,(%&&%%%%##(/**#&%@/.,#&%%#(//*,,///****(//**,,,***///*,*,,,,.    ");
    System.out.println("   /@@@///(*,/%#%%##((//,#%@@@&%&(,/%%#(/,/,,,,*******(/**,,,,*,***,*,,.,,     ");
    System.out.println("    %@@@((//,,/,##((////#&@@@&@@@&###(//,,,,,,*,,,,**(/**,,.,,,,,,*,,,,,     ");
    System.out.println("    .%@&%*/(/.,*#((////(&@@@@%&&&&&%##(/****,,,*,,,,,,**(***,.,,..,.,,,,,      ");
    System.out.println("     .(,,,(/*.,(((///*#&@@@&%%&&&&%%%####(/**,,,,,,,,,,,*(/*,.......,,,*.      ");
    System.out.println("       ..///**,#(//**/&@@@%#(#%%%&&%%#(((((//**,,,,.,,,,,*/(*,.......,..       ");
    System.out.println("          */*/,(//***%@@(,(%%%#(#&&&&&&%%###(((/**.,,,,,,*(*........           ");
    System.out.println("          ,////(/**(&&%/.(##@@&@@#(&@(*,%&*,*#*,(**/###/,....*(*.....          ");
    System.out.println("           //*//*,/&&%*/(#@@@#/#*&%*,.&(,.*(,./,.,,(#*...,//,...,          ");
    System.out.println("           //*(/*/@%&%(#@@@@@(/,&((*#/&(/*#***&,,,,/*#%%(...,#*....          ");
    System.out.println("           ,/*(*,&&(#@@@@@@@%@@@&&@@(#%#*#%%&&**###/#&@%,.,*(...           ");
    System.out.println("            /*(/*@/%@@@@@@(@@@@@@@@@&&&&&@@@@@@&&%%&%##&@@%,,*#...           ");
    System.out.println("            ./(/*(#@@@@@&%%&&&&&&&&&%%%%###%########%%&@@@@(.*(...           ");
    System.out.println("              ,(((#%&&&&&&&%%%%%%%%#((/***,,,,,,,***,********,,...             ");
    System.out.println("                /(((########%%#%%%%##((///*****,,,,,,,,,,,,,,,...              ");
    System.out.println("                  ((((#########%%%#(((//*/**,,,,,,,,,,,.,,,,..                 ");
    System.out.println("                     *(###(/(######(((//***,,,,,,,,,,,,,,,..                 ");
  }
  
  //Elton "The Man"
  public void Elton ()
  {
    System.out.println("            #&&@@@%&&@@@@@@@#&@@@@&&&&%@&&@#@@@@&@@@@&%%%");
    System.out.println("           &&&&%@#(&%%@&@@@%#%&&&&&%%%&&&@&&%@&%@&%@&%%&&%");
    System.out.println("          ###&&%&%@#((@@#&%&(%#%#%%###%%%#&%##%%#%%%%#%%(");
    System.out.println("         &%%&&%&@%(&&&%(#%##(##(##((((#/#(###########%// ");
    System.out.println("         #&&%#&&%%&&%(%##%##((/(((*/(///((/((((((((((((((/,");
    System.out.println("         &%%%&&%(&%##&&%###&%(((*/////////**////////((((((((");
    System.out.println("         &&&&%(&#(%####((#((///////**//**/*////////////(*/,,.  ");
    System.out.println("         %%%#&&%#(%%(%(&(/#(#(((////*****/**/*///***//////// ");
    System.out.println("          &&%&%%%%%&%%#%##((#((((/////******************/*///,");
    System.out.println("           %##%%##%%(%&(##%#((//////*/********/*********////*  ");
    System.out.println("            ##%&%%%%%%%#((/////*/**************/*/(//(#%%%&&");
    System.out.println("             #%%%%#%%##%#(//////*///////((###(((//**/(*#%**&");
    System.out.println("             /(*(%%#%####(/////***//(((**%,#//*//////////,//");
    System.out.println("             *(**(%%%#(##(/***********///*//////*//***////// ");
    System.out.println("             /*/####(//(//**********,**********/******///**&& ");
    System.out.println("             ###/*/(/(/*/(//********,,,,,,*******/***///*///,");
    System.out.println("               %%%***,*(/*////************,,,***/(*********,,#");
    System.out.println("               #%%%%//***//***********************/#(//((//*.# ");
    System.out.println("                 #%%%##(////*****************************//**( ");
    System.out.println("                   @@%%%*********************************//*//  ");
    System.out.println("                 @@@@&@/**/*********************/(%&%@@%#(,/  ");
    System.out.println("               @@@@@@@@&**///*****************((######((//& ");
    System.out.println("             @@@@@@@@@@@***/////****************//*///////");
    System.out.println("           @@@@@@@@@@@@%(***//((//**************//*//////");
    System.out.println("          @@@@@@@@@@@@@&%%******/(#(////*/*/**/***/*****/");
    System.out.println("        @@@@@@@@@@@@@@@%#%(*******//((##(////*/*********/");
    System.out.println("      @@@@@@@@@@@@@@@@%(#%(/********///(###((/////////#/");
  }
  
  //Cutting Device
  public void CuttingDevice ()
  {
    System.out.println("      ***///");
    System.out.println("       */(/(/");
    System.out.println("        *//(/");
    System.out.println("         */((//");
    System.out.println("          */(//*.,#%##((((//***//**");
    System.out.println("           /(&&&&%%#((((//**********");
    System.out.println("         .../(%%&&@@@&%%#(((((//******");
    System.out.println("       */..*/(((##%&@@@@&%%###(((/*****");
    System.out.println("        ,//*,*///((##%&@@@@@&%###(((//******");
    System.out.println("      .,,,,,,**////((##%&@@@@@&%##((((/****//");
    System.out.println("      ...,,,,***////((#%&@@@@&#((((//*****// **");
    System.out.println("        ....,,***////((##%&@@@&%#((((//**");
    System.out.println("          ...,,****////(##%&&@@@((/////**");
    System.out.println("          ...,,,***////(((#%%%&&((////*,,");
    System.out.println("           ...,,,****////((#%%&&%%#(/////*");
    System.out.println("           .....,,,*****//((##%%%%##(///");
    System.out.println("             ...,,,******///((#%%%#(");
    System.out.println("              ...,,,********//(##%##(/*//**");
    System.out.println("               ....,,,,,,,***//((###(//**");
    System.out.println("                  ....,,,,,,,,**/((##(/**");
    System.out.println("                   ....,,,,,,,,**/(#%##//");
    System.out.println("                   .....,,,,,,,,**//(#%%#(");
    System.out.println("                       ...,,,,,,,,*///(###(");
    System.out.println("                        .........,,,*//(###(");
    System.out.println("                          ........,,,*//(###(");
    System.out.println("                            .......,,,,**/(###");
  }
  
  //Impusle Laser
  public void ImpulseLaser ()
  {
    System.out.println("                                                                                                         ,/(((* ..                                               ");
    System.out.println("                                                                                                    ./((#(##((((((#(((/                                        ");
    System.out.println("                                                                                                 *((##(###/((%%%&&%((//                                        ");
    System.out.println("                                                                                              /((%%(.((((####%#(%%%#/.                                         ");
    System.out.println("                                                                                         .(((##. .//(###(///%%%#((//.                                          ");
    System.out.println("                                                                                     .*((%%(  *(/(#%%##((####/*(#%#/,,,,,.                                     ");
    System.out.println("                                                                                  ,/(#&@@@&%((%&%##((((##(/(#%#(####,,,..                                      ");
    System.out.println("                                                                               *((#&&@@(#&@@@@@#((#(//(%&%%#%##(/**,,.                                       ");
    System.out.println("                                                                           ,/((%#*  #(/#&@@@@@@&&%(//(&&@&&%(//(*****,,.                                       ");
    System.out.println("                                                                       ,(((%#. .///(&@%%%%&@@&(//&#((#(/(#%/..,*,,                                           ");
    System.out.println("                                                                    *(/(#/  .//(%&%%#((##//(@@@%((#(/(#(,  ,,,.                                              ");
    System.out.println("                                                                .//(#%(/(*//(%%%##//((#(//%@@@@@@%(/(#/,..,,,.                                                 ");
    System.out.println("                                                             ,(/(%#((((//(%###(/(((#(//%@@@@@@#/(#%(/****,.                                                    ");
    System.out.println("                                                         ./(/##. /((/((##(#**/(((///%%%%%%%(//##(////*..                                                       ");
    System.out.println("                                                     ,///#(.  ,(/(####**#%%%#///#%#((/#(//(#*...,,,.                                                           ");
    System.out.println("                                                 ./(((#*  .*//(#%#((*(#%%#////(#(//#(/(#(,  .,,..            ");
    System.out.println("                                             .*(//(#,  *//(#####(*/###(//(%#%//(#//(#/,  .,,.                                                                  ");
    System.out.println("                                           /*(##%(.*#(//(###,///(##///#%%%%%%(//##/,..,,,.           ");
    System.out.println("                                        *##/,###, /((####(*/((((*/(%&%%%%%///##(/****..               ");
    System.out.println("                                        /((*/%%. ,%%#/(*/(##(*/#%%##(##///##(//***..                 ");
    System.out.println("                                        *((/(, ,%%#/####//*/%%((/(#///#(,   .,.                    ");
    System.out.println("                                     .((((////((#%#((#(//##((/((//(#(,   .,.                ");
    System.out.println("                                  ,((((((/**,**#((///#%#((##(//((*.  .,,.                    ");
    System.out.println("                              ./(((//(//*,**////%&%%##(##/*/((*. ..,,                        ");
    System.out.println("                             ,////,**,**////***/*****//**((/*,,*,..                       ");
    System.out.println("                             ,*#%#(/(/(/***//#&%##(#((#(///**,.                     ");
    System.out.println("                              //(##(/**///(##%&&&&%%#////*,.             ");
    System.out.println("                               (((#(//((///**////*..                      ");
    System.out.println("                                 *(///**,*****,.                         ");
    System.out.println("                                   .,,,,,*,.                         ");
  }
  
  //London Ascii
  public void London ()
  {
  System.out.println("                                                                                              #                                            ");
  System.out.println("                                                                                              &                                            ");
  System.out.println("                                                                                             ,@@                                           ");
  System.out.println("                                                                                              &.                                           ");
  System.out.println("                                                                                              (*                                           ");
  System.out.println("                                                                                              #                                            ");
  System.out.println("                                                                                              #&                                           ");
  System.out.println("                                                                                             @, @                                          ");
  System.out.println("                                                                                            @,//*@.                                        ");
  System.out.println("                                                                                          /@. *% (@/                                       ");
  System.out.println("                                                                                         @@    &   @&                                      ");
  System.out.println("                                                                                        @ (@&%%&@@@(.&                                     ");
  System.out.println("                                                                                         @ ( , @ *%/#                                      ");
  System.out.println("                                                                                         @ @ . # (& *                                      ");
  System.out.println("                                                                                        ,*&@@%(((#%&.                                      ");
  System.out.println("                                                                                        /    , ( (   &                                     ");
  System.out.println("                                                                                       @ % /   &.     @                                    ");
  System.out.println("                                                                                     &&  % @./,&/& %(,/@&                                  ");
  System.out.println("                                                                                   &@          .,*.     .@&                                ");
  System.out.println("                                                                                 .@*&@%(. *  # .. (. ,  .,/                              ");
  System.out.println("                                                                                 (   *@/ #@( @ /* %% %# %.  @                              ");
  System.out.println("                                                                                 %   *@. /#  . (( *. %( %/  @                              ");
  System.out.println("                                                                                .&  %@@@@&%/.  #%  *%@@@, @                              ");
  System.out.println("                                                                                .@    #% ./    %&  &%   @   @                              ");
  System.out.println("                                                                                .@  ** #  * @  %&.,  &  *,* @                              ");
  System.out.println("                                                                                ,@  @   %(  *. %@(.   &.  & @.                             ");
  System.out.println("                                                                                ,@  %       @  %@ @      *. @,                             ");
  System.out.println("                                                                                ,@   &     @(  %@ ,@*   &   @*                             ");
  System.out.println("                                                                                ,@     /@@#    #@    .      @*                             ");
  System.out.println("                                                                                .@ ,&%%**# #, &/@ (&, &,*@%*@,                             ");
  System.out.println("                                                                                 @   (@.*& #( & * (&* &,.&& @.                             ");
  System.out.println("                                                                                 @* (&@@&&%%&%#.@ .,*****(&%                               ");
  System.out.println("                                                                                  &  # / . . *  @ ,    . % #*                              ");
  System.out.println("                                                                                  &, & # .., (  @.*  * ( @ %%                              ");
  System.out.println("                                                                                  &/ % / . . *  @.,  , ( & %&                              ");
  System.out.println("                                                                                  &(  *%&@@@@@&@@(((((#%&@@&&                              ");
  System.out.println("                                                                                  %#            @*    .... #&                              ");
  System.out.println("                                                                                  #% ,.*     ,  @*.    . ( (&                              ");
  System.out.println("                                                                                  ,@ & # .., (  &(*  * ( @ ,&                              ");
  System.out.println("                                                                                  .@ % / . . *  &(.  , / & .&                              ");
  System.out.println("                                                                           ,       @            %(         .&                              ");
  System.out.println("                                                                           %/      @(&@@@@@%#/(%##*(%%&&&%%*&                              ");
  System.out.println("                                                                          @ #,     @ # / . . *  (#,    . %  &                              ");
  System.out.println("                                                 .     %     &     @    &  .#      @ & ( . , (  /#*  . * @  &                              ");
  System.out.println("                                                 @@    %@   ,*%   *.&  .(& ,& (@   @ & # .., (  *#*  , ( @  &                              ");
  System.out.println("                                                (,@(  # &,  (.#   . %  / &./& (  @ & ( .., /  .#,  * ( @  %   ,@@@@(                     ");
  System.out.println("                                                 %@   *.%   %,/   /.%  *.& (& &&   @ /       ....#          &@%(&    .                     ");
  System.out.println("                                                 &&   **/   %..   /,/  *// /& @&   &             #         &&     .&@% *@/    .%%.         ");
  System.out.println("                                         #&&@@@@@@@@@@@@@@@@@@@@@@@@&&&&&&%%((*,,%,@&&&@@@@, @@@@@@&&&%.#   .%*   #/  @  /    *%/&/    ");
  }
  
  //Parallel Universe Ascii
  public void Puniverse ()
  {
    System.out.println("###############I-Ixxxxxx] xxx%%%%%%%%%%%%%%%%%xxxxxxxxxxxxxxxx%%%");
    System.out.println("##[][][][][]###I-Ixx][]x] xxxxxxxxxxx%%%xx....      ......:xxxxx%");
    System.out.println("##[][][][][]###I-Ix[][]x].......xxxx%%  .....  /\\\\  ....:::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[][]x]     ./:xx%%% :.... /____\\\\ ..::::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[][]x]  ./. .:xx%%% : ... |++++|~| .::::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[][]x]/......:xx%%% : .  _|____||| .::::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[][]x].......:x%%%% :.. |+++++|||||.::::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[][]x].......:xx%%% :  _|_____|||||_  ::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[][]x]...... :xx%%% : |+++++++++||||| ::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[][]x]......%%%%%%% : |+++++++++||||| ::xx%%%%");
    System.out.println("##[][][][][]###I-Ix[]xxx]....%%%%%%________________ |||| ::xx%%%%");
    System.out.println("##[][][][][]###I-Ixxx:[x]..%%%%%%%%# # # # # # # #|| ||| ::xx%%%%");
    System.out.println("###############I-Ixx~ [x]%% _______###############||____ ::xx%%%%");
    System.out.println("###############I-Ix] ::::::| # # # # # # # # # # # # # || :xx%%%%");
    System.out.println("##I ::::::: ###I-Ix] ::::::| # # # # # # # # ___________________");
    System.out.println("##I ::::::: ###I-I@] ::::::| # # # # # # #_/UUUUUUUUUUUUUUUUUUUU");
    System.out.println(":::::::::::::::::::::::::::|.# # # # # # [uUUUUUUUUUUUUUUUUUUUUUU");
    System.out.println("UUUUUUUUUUUUUUU\\...........~~~~~~~~~~~~   ~~|H~H~H//~~~~\\\\\\]H~H~H");
    System.out.println("uuuuuUUUUUUUU::|______  .................[XXXXXXX|||~~~~#||XXXXX]");
    System.out.println("uuUUUUUUUUU|:/_____//~\\\\  ................. |H~H~|||    #||~H~H~H");
    System.out.println("uUUUUUUU|:: ||####||  %|| __________________~~~~~\\||    \\||~~~~~~");
    System.out.println("UUUU|:;:: ::||####||===||                                            ");
    System.out.println("|:::::: ::::||####||_-_~  ===============================         !");
    System.out.println("|_____ `::-~     _-~__   _||          I\\             !         ==!==");
    System.out.println("__//~%\\\\~     _-~_____  _||~ ~  ~~~~  ~II\\        =!=          !");
    System.out.println("#||  %||   _-~________ _|||   ~     ~~ ~~II\\         !     ======!===");
    System.out.println("#||===||_-~____________|||~     ~~~~  \"  ~~II\\  ====!====       !");
    System.out.println("#||  _-~______________||||    \"            ~~II\\    !           !");
    System.out.println(" ~------------------||||~  \"  ~~~~~~  \"     \"  \\\\    ========!===");
    System.out.println("___________________||||~ \"\"\"         ~~~~~  =======!========   !");
    System.out.println("                  ||||~   ~~~~~~~    `          \\ 0  !\\         !");
    System.out.println("-----------------||||~ \"\"           \"\"   ' \"\"|:0!###\\      !");
    System.out.println("                ||||~      ~~~~                 |:   0!o#### \\   !");
    System.out.println("_______________||||~  \"\"          ~~~~~~~    \"  |:0!ooo#####\\ !");
    System.out.println("              ||||~   `     \"\"                  |:0ooooooo###   !");
    System.out.println("-------------||||~ \"\"  ~~~~~~      `  \"\"\"   \"===============!===");
    System.out.println("            ||||~        ,     \"\"   ~~~~        ##\\\\0oooooooo!##");
    System.out.println("           ||||~ ~~~~  \"     ~~~~~~     `  ~~~~ ~###\\\\0oooooo!###");
    System.out.println("----------||||~                                  ~####\\\\0000000##");
    System.out.println("         |||~~      ~~~~~~         ~~~~~     '    ~#####:::::::::");
    System.out.println("______     ~    \"           `                \"     ~####:::# # #");
    System.out.println("     [[III]   ~~~~~           ~~~~~~      ~~~~~~    ~####::::::::");
    System.out.println("  [[ [[III] ]]           ~~~~~~                      ~####IIIIIII");
    System.out.println("__[[[[[III]]]] ~~~~~~~~~~           ~~~~~~     ~~~~   ~`##IIIIIII");
    System.out.println("  [[ [[III] ]] ~          ~~~~~~~           ~~~     ~~  ~[#######");
    System.out.println("___  [[III]        ~~~~~~          ~~~~~~        ~~~    ~~~~~~~~~");
    System.out.println("    |[[III] ~~~~~        ~~~~~~~~~~       ~~~                    ");
  }
  
  //Volcano Ascii
  public void Volcano ()
  {
  System.out.println("                      ooO");
  System.out.println("                     ooOOOo");
  System.out.println("                   oOOOOOOoooo");
  System.out.println("                 ooOOOooo  oooo");
  System.out.println("                /vvv\\");
  System.out.println("               /V V V\\ ");
  System.out.println("              /V  V  V\\          ");
  System.out.println("             /         \\  ");
  System.out.println("            /           \\               ");
  System.out.println("          /               \\ ");
  System.out.println("         /                 \\  ");
  System.out.println("       /                     \\ ");
  }
  
  //Spaceship Orbiting around the Earth Ascii
  public void Spaceship ()
  {
  System.out.println("                   .'.");
  System.out.println("                   |o|");
  System.out.println("                  .'o'.");
  System.out.println("                  |.-.|");
  System.out.println("                  '   '");
  System.out.println("                   ( )");
  System.out.println("                    )");
  System.out.println("                   ( )");
  System.out.println("");
  System.out.println("               ____");
  System.out.println("          .-'\"\"p 8o\"\"`-.");
  System.out.println("       .-'8888P'Y.`Y[ ' `-.");
  System.out.println("     ,']88888b.J8oo_      '`.");
  System.out.println("   ,' ,88888888888[\"        Y`.");
  System.out.println("  /   8888888888P            Y8\\");
  System.out.println(" /    Y8888888P'             ]88\\");
  System.out.println(":     `Y88'   P              `888:");
  System.out.println(":       Y8.oP '- >            Y88:");
  System.out.println("|          `Yb  __             `'|");
  System.out.println(":            `'d8888bo.          :");
  System.out.println(":             d88888888ooo.      ;");
  System.out.println(" \\            Y88888888888P     /");
  System.out.println("  \\            `Y88888888P     /");
  System.out.println("   `.            d88888P'    ,'");
  System.out.println("     `.          888PP'    ,'");
  System.out.println("       `-.      d8P'    ,-'  ");
  System.out.println("          `-.,,_'__,,.-'");
  }
  
  //Tardis crash land Ascii
  public void TardisCrash ()
  {
  System.out.println("            (____)");
  System.out.println("           (___)");
  System.out.println("       ___()");
  System.out.println("_______(_@_)_______");
  System.out.println("| POLICE      BOX |");
  System.out.println("|_________________|");
  System.out.println(" | _____ | _____ |");
  System.out.println(" | |###| | |###| |");
  System.out.println(" | |###| | |###| |   ");
  System.out.println(" | _____ | _____ |   ");
  System.out.println(" <<>>>|| | || || |");
  System.out.println(" \\\\\\\\\\// | ||_|| |  ");
  System.out.println(" //////////_____ |  ");
  System.out.println(" ^^^^^^^^^^^| || |  ");
  System.out.println(" vvvvvvvvvvvv_|| | ");
  System.out.println(" ////////////\\\\_ |");
  System.out.println(" ^^^^^^^^^^^^^^^ |   ");
  System.out.println(" ^^^^^^^^^^^^^^^^^^^^         ");
  System.out.println(" ///////...\\\\\\\\\\\\\\///        ");
  System.out.println(" ^^^^^^^^^^^^^^^^^^^^");
  }
  
  //The tear of Space-time Ascii
  public void Spacetime ()
  {
  System.out.println("+/////:-::-/-:----------------------------------------+o:--------------------");
  System.out.println("::::://::::::-------------------------------------:+s+::---------------------");
  System.out.println("--::::/:://--:---------------------::---------/oyso/-------------------------");
  System.out.println("::--::/:::++:-----------------::syyyyyoo+:::os+/::---------------------------");
  System.out.println("--:/::::-::+/:--------------/oo+:::::/++sso/--------------..-----------------");
  System.out.println("---::::--:-:-/::.-------.-:so----------:-------------------------------------");
  System.out.println("-::::-::-:---:o::---:oos+/o:---------------------------.---------------------");
  System.out.println("--:::--:-----/+/+/++o+//-:---------------------------------------------------");
  System.out.println("-------------::/:o/------------------------.-----------------------:---------");
  }
  
  //Prisoner Zero Ascii
  public void Zero ()
  {
  System.out.println("((((((((((((((((((((((((((((/**//*****,,,***********,,,,**,.,,*////////*******///////////////////////////((##########(//(((((*  .****");
  System.out.println("(((((((((((((((((((((((((((/(((((//////********,,,*,**/* .,,**,,////******////////////////////////////////((####%###%%#(*/((((*. ,*,*");
  System.out.println("((((((((((((((((((((((((/**#######(///*,,,,***,,.,,,*//(((**/*,.,*******//////////////////////////////*///(#####%%%%%%%%##((((/, ,***/");
  System.out.println("(((((((((((((((((((((((((###%%######(*,,..,*,,**/**,*////((,,*,,,***///////////////////////**////////**//((######%%%%%%%##//,*,..,**,*");
  System.out.println("((((((((((((((((((((((((#((#%%%%&&%#(*... .,**. .//,,**/,,((/*,*(((////*//*///////////*********/////****//(#######%%%%%####((/,   ,*,,*");
  System.out.println("(((((((((((((((((((((((###%%%%%%%#(((/*.*/(*///***,, ,,//,/#%%#((/*.,(%#//*/////****************////****///(#############(((///,,****,,,/");
  System.out.println("(((((((((((((((((((((((####%%%%####%#//,.,,,**///***,. ,/((##(/((/**/(/**************************///***,*/((((((###%#######((#(((/(/*,*");
  System.out.println("((((((((((((((((((((((####%%%%%((%(#(/(**(((/(#/,***, .*,***//,.*/////*/*************************///**/((((#########%%%%#####((((//**,*/");
  System.out.println("((((((((((((((((((((((#%###((((///**/*/*(##(((#(/*,**,//.,/*,,*..*///**(/*************************/*****/((######%###%%%###(((////*,.,,/");
  System.out.println("((((((((((((((((((((((##(#(((##(%#(#((##((/(#((#%#(((//*.,*///,,.,///************************************/((((###########(((#((/*.   .,**");
  System.out.println("((((((((((((((((((//(((#(/***(#/#(/#//#//(###(####(/..***////((/*///**************************************/((((((((###########(((/******,,*");
  System.out.println("((((((((((((((((((/(((((*,,//##(&%(%(/%(*(##(####%%%/..*////**/(//(//**..***************************,,,,,,//(((######(#####(#(((((//***");
  System.out.println("################((((//##/,,((#%(&%/%#/%#(%%((####(/*,,*///,**#%#((((#(/(#/************************,,,,,,*/((((((((#((###((###(((//***,,");
  System.out.println("%%%%%%%%%%%%%%%%%%%%/(##/,*#(#&%(%%/%%(&%%%##%#&&&%%%#/*//((#%#/*,,//*//**************************,,,,,,*//((((((##(####(((##(((///***,,,,,");
  System.out.println("/*/*****************/(##(**##%&%&%#&&/%&&&&%&&&&&&%%%%#(//(%%(/*/(**///***,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,//(((((((((((((((##((((//****,,,,");
  System.out.println("************************((*#%%%&&&%&&(%%%&&&&&&&&&@&&%%##(/*(%#((/,//*///(/*,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.*//((((((((####((/(###((///**,,,,,");
  System.out.println("************************(#((%%%&&&&@@%&&&&&&@@@&&&@@&%%%%#*,/%#(/*.*//////*, .*,,,,,,,,,,,,,,,,,,,,,,,,,,,**/((####(##(((/(####((/*,*,,,,");
  System.out.println("(/************/((((/////(##(%%%&&&@@&%&@@@&&&&&&&&&@&%%%%#/*(##(***,,*///**/*/((,,,,,,,,,,,,,,,,,,,,,..,,***/((((((/((//*,*/(((((/*,,,,,");
  System.out.println("(/***********,/((((((((((#%#%%%&&&&&@@@@@&&&&&&&%&&&@%%%%##(/(#(//(/////(/////(/*,,,,*,*************/****////(((((((((/*,***/(((///,,****");
  System.out.println("(/******,,,,,,/((((((((((##%#%%&&&&&&&&&&&&&&%%%&&@@&&%%%%%(((##(((/////(///((//,*,,,*,,,,,,,,,,*****,,,***/((#####(##(##//(((#(((((**,***");
  System.out.println("(/******,,,,,,/((((((((((##%#%%%%%&&&&&&&&&%%%%&@&&&&&%%%#(((##(((((///(((//(((/**,,.,,,,,,,,,,,,,**,,...,*//(############(((((((((/**,**");
  System.out.println("(/*****,,,,,,,/((((((((((((###%%%%%%&&&&&&&%%%&&@@@@&&%###(/(###((////(((((///((///,,*,,,,,,,,,,,,,,,,...,*///(((######(####((///**,.,,,,**");
  System.out.println("(******,,,,,,,/(/(((((((((((####%%&%%%%%%%%##&&&&&&&&&%#((###%%#(((///(#(///(((((//***,,,,***,,,,,,,,,...,*///((((##((####(((/****, .,,,*/**");
  System.out.println("(******,,,,,,,/(////((/((/(//(#(#%%%%%%&&%%%%%&&&&&&%%#(*,/%%###((((/(#((/((((##((*.,*,,,,***,,,,,,,,,.,,,***/(((((((((((((((/***/*,,,,**/*");
  System.out.println("(***,,,,,,,,,,////////////(///(#####%%%%#%##%%%%%%%%%#(/(########%%%%%%##(((((#####(/*,,,****,,,,,,,,..,,.**//((((############((//,.,****");
  System.out.println("(*,,,,,,,,,,,,/((((((((((((((*,/((###%%%%##%%%%%%####/..,/#####%%%%%%%%(((((((#####(**,,,****,,,,,,,,,...,*///(((((((((((///(((#(/, ,****");
  System.out.println("(*,,,,,,,,,,,,/((((((((((((((((/*((##%%%%((%##%%%###(/(#######%%%%&&%%%##(((((####(*,*,,,,***,,,,,,,,....,////(((########((((##(((/..,***");
  System.out.println("(*,,,,,,,,,,.,/(((((((((((((((/***((######%%%%######((/#%%%%%%%%%%&&%%%##(((((##((/,,*,,,,***,,,,,,***,..,//((((##########(######((/,,**");
  System.out.println("(*,,,,,,....,,/((((((((((((((((/,./(##%%%%%%%%%%%#/,,/%%%%%%%%#((%&%%%##((((/**#(//,,*,,,,***,,,,,,*,,,,.,////((#######%#/(((####(((/**");
  System.out.println("(*,,,,,,......*///////////////////*/(##%%%###%%%##*/%%%%&&&%&&&&&&%%%%##(//,,*/((//,,*,,,,**,,,,,,,*,,,,..*//((###%%%##########((((");
  System.out.println("(*,,,,,,......*/////////////////,**/(###%%%%%%%#(/*(#%%&&&&&&&&&%%%%%%##((/(((/////,,*,,,,,,,,,,,.,,,,,.,.,*/((((((((((///*/((((((//,,");
  System.out.println("(*,,,,,,......*///////////////////,,*(###%%%#####/*/#%%%%&&&&&&%%#%%%%#((((((/(((//*,*,,,,,,,,,,,.,*,,,,*.*((########%%%#((//////*****");
  System.out.println("(*,,,,,,......*((((((/(((((((////*.  ,/######/,. .(%%%%%%%%%##%%%%%%%###((((((((/..***,,,,,,,,,,,.,*,,,,,,/((###%%%%%%%%%%%%######(((((//*");
  System.out.println("(*,,,,,.......*/////////(((((////////,.*//((//.,(##%&&&&&&&&&&&&%%%%%%##((((((((/*,*/*,***,,,,,,,,,*,,,.,*/*/(####%##%%%%%%%#######((/(//***");
  System.out.println("(*,,,,,.......*////////////////////**/*.,*.,../(###%%%%&@@&&&&&%%%#####(((##((((####(/*////////****//*,.,*,./(((((((####%###(/,*((//(///*");
  System.out.println("(*,,..........*///////////////////*/////*,....,(##%%&&&&&&&%&%%%######(((#(((((#((((//,/////////*////***/*,/((((//*((##((#####* ,,  .,,*****");
  System.out.println("(*............*/////////////////////////*,...../(#%%%&&&&&&&&&%%%######(##(/*(##((((//*////////////(/*/***/(#######(((##(/(((((,,,   ,******");
  System.out.println("/*....,,......*/////////((//////////////*,.... ,(#####%%&&&%%%%%%#%%########((##(((///*////////////(/,////((###%%#((((###((//(#(*,..,******");
  System.out.println("####//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,. .   (####%&&&%%&&%%%%%%%%%%%%%%%%%%#(((((/////**//(##*(%%%%#/*./(##((///");
  System.out.println(".,,/**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.      ,(###%%%%%%%%%#####%%%%%%%%%&%%###(//(/((***/((%%#((/##(, *(((///");
  System.out.println(",,,,**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.      .,(#(#%%%%%%%%%%%###%%%%&&&%%%%%%%#(((//*/*./((/##(.,/((#**(/,*");
  System.out.println("/(/((/,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..       ,(##%%&%%%%%%%%%%%%%%%&&&%%%%%%%%###(***,...,*((/*/(###%#(//(((");
  System.out.println("/////*****,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,         ../#%%%%%%%%%%#%%%%%%&&&&&&%&&%%%%%#/*/(/(((/,*(#(#####(///");
  System.out.println("**////**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.,,,,,,,,         . ./#%%%%%%%%%%%%%##%%%%%&&&&&%%%%#(/(#####%%#/(######(///");
  System.out.println("(((((///,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.        .  .(%%%%%%%%%%%%%##%%%%%%&&&&%%%%&%######%%%%%#######///(((");
  System.out.println("////(/**,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,.        .   ./#%%%%%%%%%%%%%%%%%%%%&&&&&&%%%%#(##%&&&&%####(((/(((");
  }
  
  //Abandoned House Ascii
  public void House ()
  {
  System.out.println("                               !!!!!!!");
  System.out.println("                       .       [[[|]]]    .");
  System.out.println("                       !!!!!!!!|--_--|!!!!!");
  System.out.println("                       [[[[[[[[\\_(X)_/]]]]]");
  System.out.println("               .-.     /-_--__-/_--_-\\-_--\\");
  System.out.println("               |=|    /-_---__/__-__-_\\__-_\\");
  System.out.println("           . . |=| ._/-__-__\\===========/-__\\_");
  System.out.println("           !!!!!!!!!\\========[ /]]|[[\\ ]=====/");
  System.out.println("          /-_--_-_-_[[[[[[[[[||==  == ||]]]]]]");
  System.out.println("         /-_--_--_--_|=  === ||=/^|^\\ ||== =|");
  System.out.println("        /-_-/^|^\\-_--| /^|^\\=|| | | | ||^\\= |");
  System.out.println("       /_-_-| | |-_--|=| | | ||=|_|_|=||\"|==|");
  System.out.println("      /-__--|_|_|_-_-| |_|_|=||______=||_| =|");
  System.out.println("     /_-__--_-__-___-|_=__=_.`---------'._=_|__");
  System.out.println("    /-----------------------\\===========/-----/");
  System.out.println("   ^^^\\^^^^^^^^^^^^^^^^^^^^^^[[|]]|[[|]]=====/");
  System.out.println("       |.' ..==::'\"'::==.. '.[ /~~~~~\\ ]]]]]]]");
  System.out.println("       | .'=[[[|]]|[[|]]]=`._||==  =  || =\\ ]");
  System.out.println("       ||== =|/ _____ \\|== = ||=/^|^\\=||^\\ ||");
  System.out.println("       || == `||-----||' = ==|| | | |=|| |=||");
  System.out.println("       ||= == ||:^s^:|| = == ||=| | | || |=||");
  System.out.println("       || = = ||:___:||= == =|| |_|_| ||_|=||");
  System.out.println("      _||_ = =||o---.|| = ==_||_= == =||==_||_");
  System.out.println("      \\__/= = ||:   :||= == \\__/[][][][][]\\__/");
  System.out.println("      [||]= ==||:___:|| = = [||]\\\\//\\\\//\\\\[||]");
  System.out.println("      }  {---'\"'-----'\"'- --}  {//\\\\//\\\\//}  {");
  System.out.println("    __[==]__________________[==]\\\\//\\\\//\\\\[==]_");
  System.out.println("   |`|~~~~|================|~~~~|~~~~~~~~|~~~~||");
  System.out.println("   |^| ^  |================|^   | ^ ^^ ^ |  ^ ||");
  System.out.println("  \\|//\\\\/^|/==============\\|/^\\\\\\^/^.\\^///\\\\//|///");
  System.out.println(" \\\\///\\\\\\//===============\\\\//\\\\///\\\\\\\\////\\\\\\/////");
  }
  
  
  //Appartment Ascii
  public void Appartment ()
  {
  System.out.println("       ___________   ");
  System.out.println("      |  ___      |   ");
  System.out.println("      | | ^ |     |    ");
  System.out.println("      | | V |     |  ");
  System.out.println("      |  --- ___  |  ");
  System.out.println("      |     |   | |   ");
  System.out.println("      |     |   | |   ");
  System.out.println("      |      ---  |  ");
  System.out.println("      |  |^^^^^^| |    ");
  System.out.println("      |  |^^^^^^| |   ");
  System.out.println("      |  | |||| | |    ");
  System.out.println("      |  | |||| | |      ");
  System.out.println("      |  | |||| | |      ");
  System.out.println("      ^^^^^^^^^^^^^      ");
  }
  
  //Mannequins Ascii
  public void Man ()
  {
  System.out.println("                                                          ");
  System.out.println("                                           `````````                                                ");
  System.out.println("                                           ..---..`.`                                               ");
  System.out.println("                                           -:::-....`                                               ");
  System.out.println("                                           -//::.`..                                                ");
  System.out.println("                                           `///:.`.`                                                ");
  System.out.println("                                            -//:...                                                 ");
  System.out.println("                                            -//:...`                                                ");
  System.out.println("                                           `-:::-`..``                                              ");
  System.out.println("                                      ``````...--....```````                                        ");
  System.out.println("                                   ---:-```  `.....`````..```                                       ");
  System.out.println("                                  `:/+o-`    ```.```````.-.``                                       ");
  System.out.println("                                  -/+o+-`   ```...``````.:-```                                      ");
  System.out.println("                                 `:/+s-`::--.``.:::--...`-:```                                      ");
  System.out.println("                                 .:/oo` /+/:-...-://:-..`-:.``                                      ");
  System.out.println("                                 -/+o/  -++///-.--.--... ./-``                                      ");
  System.out.println("                                `.:+o   ./++//:-:-``...   +/-``                                     ");
  System.out.println("                                .-:/+   .::///:-:-```.`   /+:``                                     ");
  System.out.println("                                .-:  -//::://::::-----...  /:``                                     ");
  System.out.println("                                ...  ://::::/:::------...  -:``                                     ");
  System.out.println("                                ... `:///:-://::----:-...  -:.`                                     ");
  System.out.println("                               `.`` `:///:-.://:--:/:-...  .:.`                                     ");
  System.out.println("                               ..-.  ////:-.-//::/+//:-..  .-``                                     ");
  System.out.println("                               --:.  ////:--.-:/++++/:...  .:..`                                    ");
  System.out.println("                               `.--` :++/:--..``/++++/-..`  /-:`                                    ");
  System.out.println("                                  `  .++/:---.  `++++/-..`  ::-                                     ");
  System.out.println("                                      ++//:--.   -+++/:...                                          ");
  System.out.println("                                      :++/:--.   `/++/:-..                                          ");
  System.out.println("                                      -++/:--`    .++/:---`                                         ");
  System.out.println("                                       `++/:-:      :++:--.                                         ");
  System.out.println("                                        /+/::/      .++/---                                         ");
  System.out.println("                                        :+/::/       :+/:::`                                        ");
  System.out.println("                                        :+/:::       `///::-                                        ");
  System.out.println("                                        :+/::/        `/+/:--                                       ");
  System.out.println("                                        :+/::+`        /++/::`                                      ");
  System.out.println("                                        `//:::.         `/++/:.                                     ");
  System.out.println("                                         ://::`          .++/::`                                    ");
  System.out.println("                                         .//:/`           -++/:.                                    ");
  System.out.println("                                          //:/`            :+/:-                                    ");
  System.out.println("                                          -///`            `++/:                                    ");
  System.out.println("                                          `+//`             -+//`                                   ");
  System.out.println("                                           ///`              /+:-                                   ");
  System.out.println("                                           /+/-              -+/:`                                  ");
  System.out.println("                                           ///:              `++:-                                  ");
  System.out.println("                                          `+/::.              :o/:.                                 ");
  System.out.println("                                       .--os/:::.......````````++::`                               ");
  }
  
  //Bedroom Ascii
  public void Bed ()
  {
  System.out.println("                                         _________________              ");
  System.out.println("                                        | | | | | | | | | |             ");
  System.out.println("                                        | | | | | | | | |<:             ");
  System.out.println("                                        | | | | | | | | | |  _          ");
  System.out.println("                                   _    | | | | | | | | | | {o}         ");
  System.out.println("                                  (')   | | | | | | | | | |  |    _!_   ");
  System.out.println("             ___                   $    ++++++++++++++++++|  |E  /___\\  ");
  System.out.println("            /   \\                 (_)   |{} ************ <:  |    ");
  System.out.println("           | //  |          _!_         ++++++++++++++++++| ______(_)__ ");
  System.out.println("            \\___/          /___\\        | | | | | | | | | | |____=____| ");
  System.out.println(";,     ______   ______       |          | | | | | | | | | | |____=____| ");
  System.out.println(");_   {______}-{______}   __(_)__       | | | | | | | | | | |____=____| ");
  System.out.println(";_|   %%%%%%%%%%%%%%%%%   |__=__|       | | | | | | | | |<: |____=____| ");
  System.out.println("__|__%%%%%%%%%%%%%%%%%%%__|__=__|______ |_|_|_|_|_|_|_|_|_|_|____=____|");
  System.out.println("\"\"|\"%%%%%%%%%%%%%%%%%%%%%\"|\"\"\"\"\"|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|/\"\"\"\"   \\|");
  System.out.println("\"\"\"%%%%%%%%%%%%%%%%%%%%%%%\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
  System.out.println("\"\"%%%%%%%%%%%%%%%%%%%%%%%%%\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
  System.out.println("\"%%%%%%%%%%%%%%%%%%%%%%%%%%%\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
  System.out.println("/|||||||||||||||||||||||||||\\\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
  System.out.println("|||||||||||||||||||||||||||||\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
  System.out.println("||||||||||||||||||||||||||lc|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
  System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
  }
}