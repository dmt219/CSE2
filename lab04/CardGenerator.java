//Duc Tran  
//CSE 002
// A program that generate a random card from the deck

public class CardGenerator {
    //main class required for every java program
    public static void main(String[]args){ //java program class
    //[0, 1)
int number = (int)(Math.random()*52)+1;


String a = "Diamonds";
String b = "Clubs";
String c = "Hearts";
String d = "Spades";
String e = "";
String f = "Rank";
if (1<=number && number<=13){ e = a;} 
else if (14<=number && number<=26){ e=b;}
else if (27<=number && number<=39){ e = c;}
else if (40<=number && number<=52){ e = d;}


switch(number%13){
    case 1:
    System.out.println("You picked the 2 of "+ e);
    break;
    case 2:
    System.out.println("You picked the 3 of "+ e);
    break;
    case 3:
     System.out.println("You picked the 4 of "+ e);
    break;
    case 4:
     System.out.println("You picked the 5 of "+ e);
    break;
    case 5:
     System.out.println("You picked the 6 of "+ e);
    break;
    case 6:
     System.out.println("You picked the 7 of "+ e);
    break;
    case 7:
     System.out.println("You picked the 8 of "+ e);
    break;
    case 8:
     System.out.println("You picked the 9 of "+ e);
    break;
    case 9:
     System.out.println("You picked the 10 of "+ e);
    break;
    case 10:
     System.out.println("You picked the Jack of "+ e);
    break;
    case 11:
     System.out.println("You picked the Queen of "+ e);
    break;
    case 12:
     System.out.println("You picked the King of "+ e);
    break;
    case 0:
     System.out.println("You picked the Ace of "+ e);
    break;
   
    
}
      
}
}