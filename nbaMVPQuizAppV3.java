/*
 * NBAQuizAppV2
 * An improved version of the original NBAQuizAppV2
 * Changes: +gives an option for a hint, gives an option to give up, displays correct answer if user gives up
 */

//next version: display % of answers right
import java.util.Scanner;

public class nbaMVPQuizAppV3
{
  public static void main (String [] args)
  {
    Scanner input = new Scanner (System.in);
    int counter = 0, cont = 0, allcont = 0;
    String userstr = "";
    
    System.out.println("Welcome to the NBA MVP Quiz V2!");
    System.out.println("All answers must be in full first and last name (at the time they won MVP) AND be properly capitialized");
    do{ 
    do
    {
     System.out.println("Who was the 2023-2024 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Nikola Jokic"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Nikola Jokic");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has won 3 MVPS including this one.");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0; 
    
    do
    {
     System.out.println("Who was the 2022-2023 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Joel Embiid"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Joel Embiid");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was born in Cameroon");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 2021-2022 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Nikola Jokic"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Nikola Jokic");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was born in Serbia");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2020-2021 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Nikola Jokic"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Nikola Jokic");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was drafted with the 41st pick");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2019-2020 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Giannis Antetokounmpo"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Giannis Antetokounmpo");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won DPOY this year aswell");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2018-2019 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Giannis Antetokounmpo"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
     else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Giannis Antetokounmpo");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was born in Greece");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2017-2018 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("James Harden"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was James Harden");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player led the league in three pointers made this year.");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2016-2017 NBA MVP? (type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Russell Westbrook"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Russell Westbrook");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was the first to average a triple doubble since Oscar Robertson");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2015-2016 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Stephen Curry"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Stephen Curry");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won the first ever unanimous MVP this year");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2014-2015 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Stephen Curry"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Stephen Curry");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has a dad and brother that played in the NBA");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2013-2014 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kevin Durant"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kevin Durant");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is a 4x gold olympic medalist.");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2012-2013 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was LeBron James");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This is this player's last MVP out of 4 MVPs");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2011-2012 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was LeBron James");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was born in Akron, Ohio");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2010-2011 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Derrick Rose"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Derrick Rose");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is the youngest MVP ever.");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2009-2010 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was LeBron James");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is a 3x gold olympian");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2008-2009 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("LeBron James"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was LeBron James");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is the only player with 40k points.");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2007-2008 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kobe Bryant"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kobe Bryant");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is dubbed 'The Black Mamba'");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2006-2007 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Dirk Nowitzki"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Dirk Nowitzki");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was born in Germany");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2005-2006 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Steve Nash"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Steve Nash");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player coached Kevin Durant, Kyrie Irving, and James Harden");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2004-2005 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Steve Nash"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Steve Nash");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was born in Canada");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2003-2004 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kevin Garnett"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kevin Garnett");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was a 4x rebound champion");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2002-2003 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Tim Duncan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Tim Duncan");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was known as Mr Fundamental");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2001-2002 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Tim Duncan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Tim Duncan");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played on 1 team his whole career");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 2000-2001 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Allen Iverson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Allen Iverson");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is known as one of the best dribblers of all time");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 1999-2000 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Shaquille O'Neal"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Shaquille O'Neal");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player dominated college ball at LSU");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 1998-1999 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Karl Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Karl Malone");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was a teammate with the all-time leader in assists");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1997-1998 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Michael Jordan");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("As of August 2024, this player has 38 signature shoes");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
        
    do
    {
     System.out.println("Who was the 1996-1997 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Karl Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Karl Malone");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is 3rd in all-time points");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1995-1996 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Michael Jordan");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is 5th in all-time points");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1994-1995 NBA MVP?(type g to give up, type h for hint)v");
     userstr = input.nextLine();
     if(userstr.equals("David Robinson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was David Robinson");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player's nickname is 'The Admiral'");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1993-1994 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Hakeem Olajuwon"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Hakeem Olajuwon");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was drafted before Michael Jordan");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1992-1993 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Charles Barkley"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Charles Barkley");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was drafted in 1984.(type g to give up, type h for hint)");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1991-1992 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Michael Jordan");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is a 1 time slam dunk champion");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1990-1991 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Michael Jordan");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played for the Bulls and Wizards");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1989-1990 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Magic Johnson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Magic Johnson");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is 7th on all-time assists");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
       
    do
    {
     System.out.println("Who was the 1988-1989 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Magic Johnson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Magic Johnsson");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player retired for 4 years because of HIV");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1987-1988 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Michael Jordan"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Michael Jordan");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has its own shoe brand");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1986-1987 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Magic Johnson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Magic Johnson");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played for 1 team");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1985-1986 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Larry Bird"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Larry Bird");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player coached the Indiana Pacers after retiring");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1984-1985 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Larry Bird"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Larry Bird");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player was apart of the Dream Team");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1983-1984 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Larry Bird"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Larry Bird");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played for 1 team his whole career");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1982-1983 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Moses Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Moses Malone");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won this MVP while on the 76ers");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1981-1982 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Moses Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Moses Malone");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player retired in 1995.");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1980-1981 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Julius Erving"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Julius Erving");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is known for its cradle dunks");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1979-1980 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kareem Abdul-Jabbar");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is 2nd all-time in points");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
      
    do
    {
     System.out.println("Who was the 1978-1979 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Moses Malone"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Moses Malone");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player's nickname is 'Chairman of the Boards'");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1977-1978 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bill Walton"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bill Walton");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played 12 years and was forced to retire because of foot injuries");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1976-1977 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kareem Abdul-Jabbar");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player retired at 41 years old");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1975-1976 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kareem Abdul-Jabbar");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has the most MVPs in history");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1974-1975 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bob McAdoo"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bob McAdoo");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won this MVP on the Braves");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1973-1974 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kareem Abdul-Jabbar");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has the 2nd most played games in history");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1972-1973 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Dave Cowens"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Dave Cowens");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player played on the celtics from 1970 to 1980");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1971-1972 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Kareem Abdul-Jabbar"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Kareem Abdul-Jabbar");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is known for his hook shots");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1970-1971 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Lew Alcindor"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Lew Alcindor");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won another MVP under another legal name");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1969-1970 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Willis Reed"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Willis Reed");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played for 10 years and only for the knicks");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
     
    do
    {
     System.out.println("Who was the 1968-1969 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Wes Unseld"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Wes Unseld");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won MVP his rookie year");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1967-1968 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Wilt Chamberlain");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player scored 100 in a game");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1966-1967 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
        System.out.println("The correct answer was Wilt Chamberlain");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has the highest PPG in history");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1965-1966 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Wilt Chamberlain");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played for the warriors and lakers");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    
    do
    {
     System.out.println("Who was the 1964-1965 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bill Russell");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has the most championships in history");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1963-1964 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Oscar Robertson"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Oscar Robertson");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player averaged triple double this year");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1962-1963 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bill Russell");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has a FINALS MVP named after them");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1961-1962 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bill Russell");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won 11 championship");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1960-1961 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bill Russell");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played for the celtics");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1959-1960 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Wilt Chamberlain"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Wilt Chamberlain");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player won an MVP in his rookie year(not this year)");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1958-1959 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bob Pettit"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bob Pettit");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player only played for the hawks");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1957-1958 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bill Russell"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bill Russell");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player is visually compared to Morgan Freeman");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1956-1957 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bob Cousy"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bob Cousy");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has the #14 retired from the celtics");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
   
    do
    {
     System.out.println("Who was the 1955-1956 NBA MVP?(type g to give up, type h for hint)");
     userstr = input.nextLine();
     if(userstr.equals("Bob Pettit"))
     {
       System.out.println("Correct!");
       counter += 1;
       cont = 1;
     }
      else if(userstr.equalsIgnoreCase("g"))
     {
       System.out.println("The correct answer was Bob Pettit");
       System.exit(0);
     }
     else if(userstr.equalsIgnoreCase("h"))
     {
       System.out.println("This player has #9 retired from the hawks");
     }
     else
     {
       System.out.println("Wrong, guess again!");
       counter += 1;
     }
    }while(cont == 0);
    cont = 0;
    allcont = 1;
    }while(allcont == 0);
   
    System.out.println("You took " + counter + " tries to guess all NBA MVPS!");

  }
}