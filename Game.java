import java.util.*;

public class Game {
  public static void main(String[] args){
    
    Player p = new Player("Bomber", 100, 100, 15, 10, 0, 0);

    Scanner scanchoice = new Scanner(System.in);
    int choiceentry = 0;
    boolean stay = true;

    while(stay){
    
      System.out.println("Menu - Press a number to continue: ");
      System.out.println("\"1\" -> Start e new fight");
      System.out.println("\"2\" -> Enter the shop");
      System.out.println("\"3\" -> Player' status");
      System.out.println("\"4\" -> Exit");
      if(scanchoice.hasNextInt()){
        choiceentry = scanchoice.nextInt();
          if(choiceentry < 1 || choiceentry > 3){
            System.out.println("Exiting the game...");
            stay = false;
          }
        menuSelection(choiceentry, p);
      }
      else {
        stay = false;
      }
    }
  }

  private static void menuSelection(int selection, Player p){
    switch(selection){
      case 1:
        //Fight
        System.out.println("Figth!");
        break;
      case 2:
        //Merchant
        System.out.println("Merchant!");
        break;
      case 3:
        //Status
        System.out.println("---Status---");
        System.out.println(p.toString());
        pressEnterKeyToContinue();
        break;
      default:
        break;
    }
  }

  private static void pressEnterKeyToContinue()
  { 
         System.out.println("Press Enter key to continue...");
         try
         {
             System.in.read();
         }  
         catch(Exception e)
         {}  
  }
}
