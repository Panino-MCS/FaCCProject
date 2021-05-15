import java.util.*;

public class Game {
  public static void main(String[] args){
    
    Player p = new Player("Bomber", 100, 100, 10, 10, 0, 0, 100);

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
        if(choiceentry > 1 || choiceentry <= 4){
            if(choiceentry == 4){
              System.out.println("\nExiting the game...");
              stay = false;
            }
          menuSelection(choiceentry, p);
        }
      }
      else {
        System.out.println("Not a valid option!\n");
        String discard = scanchoice.nextLine();
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
        launchStore(p);
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
    System.out.println("\nPress Enter key to continue...");
    try
    {
      System.in.read();
    }  
    catch(Exception e)
    {}  
  }

  private static void launchStore(Player p){
    System.out.println("---Store---\n");

    Scanner scanchoice = new Scanner(System.in);
    int choiceentry = 0;
    boolean stay = true;

    while(stay){
      System.out.println("Available gold: " + p.getGold());
      System.out.println("\"1\" -> Buy health potion (30 gold)");
      System.out.println("\"2\" -> Buy mana potion (30 gold)");
      System.out.println("\"3\" -> Buy stone sword (50 gold)");
      System.out.println("\"4\" -> Buy iron sword (150 gold)");
      System.out.println("\"5\" -> Buy wooden catalyst (50 gold)");
      System.out.println("\"6\" -> Buy ivory catalyst (150 gold)");
      System.out.println("\"7\" -> Exit the store\n");
      if(scanchoice.hasNextInt()){
        choiceentry = scanchoice.nextInt();
        if(choiceentry > 1 || choiceentry <= 7){
            if(choiceentry == 7){
              System.out.println("Exiting the store...");
              stay = false;
            }
          storeSelection(choiceentry, p);
        }
      }
      else {
        System.out.println("Not a valid option!\n");
        String discard = scanchoice.nextLine();
      }
    }
  }

  private static void storeSelection(int selection, Player p){
    switch(selection){
      case 1:
        //Health potion
        if(p.getGold() > 30){
          p.setGold(p.getGold() - 30);
          p.setHPotions(p.getHPotions() + 1);
          System.out.println("Health potion bought!\n");
        } else {
          System.out.println("You don't have enought gold to purchase a health potion!\n");
        }
        break;
      case 2:
        //Mana Potion
        if(p.getGold() > 30){
          p.setGold(p.getGold() - 30);
          p.setMPotions(p.getMPotions() + 1);
          System.out.println("Mana potion bought!\n");
        } else {
          System.out.println("You don't have enought gold to purchase a mana potion!\n");
        }
        break;
      case 3:
        //Stone sword
        if(p.getGold() > 50){
          p.setGold(p.getGold() - 50);
          p.setBaseAtk(15);
          System.out.println("Stone sword bought!\n");
        } else {
          System.out.println("You don't have enought gold to purchase a stone sword!\n");
        }
        break;
      case 4:
        //Iron sword
        if(p.getGold() > 150){
          p.setGold(p.getGold() - 150);
          p.setBaseAtk(20);
          System.out.println("Iron sword bought!\n");
        } else {
          System.out.println("You don't have enought gold to purchase an iron sword!\n");
        }
        break;
      case 5:
        //Wooden catalyst
        if(p.getGold() > 50){
          p.setGold(p.getGold() - 50);
          p.setBaseMag(15);
          System.out.println("Wooden catalyst bought!\n");
        } else {
          System.out.println("You don't have enought gold to purchase a wooden catalyst!\n");
        }
        break;
      case 6:
        //Ivory catalyst
        if(p.getGold() > 150){
          p.setGold(p.getGold() - 150);
          p.setBaseMag(20);
          System.out.println("Ivory catalyst bought!\n");
        } else {
          System.out.println("You don't have enought gold to purchase an ivory catalyst!\n");
        }
        break;
      default:
        break;
    }
  }
}
