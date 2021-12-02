/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Kyle Flynn
 */
import java.util.Scanner;
import java.util.Random;
public class RedDotFurniture {
    
    public int Products(){
        boolean good = false;
        do{
        System.out.println("Here is our product list today!");
        System.out.println("Item# 1, Green leather, 5 Seat Sofa, $2100");
        System.out.println("Item# 2, Grey leather Recliner, $999");
        System.out.println("Item# 3, King Size Bed Suit, $3000");
        System.out.println("Item# 4, Blue leather, 5 Seat Sofa, $2020");
        System.out.println("Item# 5, Purple leather, 5 Seat Sofa, $2000");
        System.out.println("Please enter the Item# of the product");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num >= 1 && num <=5 ){
            good = true;
            return num;
        }
        else
            System.out.println("Not a valid item #");
            
        }while(!good);
        return 0;
    }
  public String purchase(){
      boolean good = false;
      do{
      System.out.println("What Day would you like that delivered?");
      
      System.out.println("1 = Monday"
              + " 2 = Tuesday"
              + " 3 = Wednesday"
              + " 4 = Thursday" 
              + " 5 = Friday");
      System.out.println("We do not deliever on Saturday or Sunday.");
      
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      
          if(num == 1){
              good =true;
              return "Monday";
          }
          if(num == 2){
               good =true;
              return "Tuesday";
          }
          if(num == 3){
               good =true;
              return "Wednesday";  
          }
          if(num == 4){
               good =true;
              return "Thursday";
          }
          if(num == 5){
               good =true;
              return "Friday";
          }
          else{
              good = false;
          System.out.println( "Not a valid Day");
          }
      }while(!good);
          
          return null;
      
   } 
  
   public String timeDelivery(String d){
       boolean good = false;
       do{
       System.out.println("On " + d + "we have the time avaiable");
                   
       String [] arr = {"8 to 10 AM", 
                        "10 to 12 AM", 
                        "1 to 2 PM", 
                        "2 to 4 PM", 
                        "4 to 6 PM"          
                        };
       Random random = new Random();
       int select = random.nextInt(arr.length);
        
       System.out.println("Is "+ arr[select] + " okay?");
       System.out.println("Enter yes or no");
       Scanner in = new Scanner(System.in);
       String response = in.next().toUpperCase();
       
       
        if(response.equalsIgnoreCase("YES")){
            good = true;
            return arr[select];
        }
        else{
            System.out.println("Lets look again");
        }
      
         }
       while(!good);
       return null;
   } 
   public void takeOrder(int j, String d, String t){
       System.out.println("Please enter your address");
       Scanner in = new Scanner(System.in);
       String address = in.nextLine();
       System.out.println("So you would like ");
       
       switch(j){
       case 1:
                System.out.println( "The Green leather, 5 Seat Sofa for $2100");
                break;
            case 2:
                System.out.println("The Grey leather Recliner for $999");                
                break;
            case 3:
                System.out.println("The King Size Bed Suit for $3000");
                
                break;    
            case 4:
                System.out.println("The Blue leather, 5 Seat Sofa for $2020");
               
                break; 
            case 5:
                System.out.println("The Purple leather, 5 Seat Sofa for $2000");
                
                break;
                
            
   }
      System.out.println("Delivered To " + address + " on " + d + " between "
              + t);
      System.out.println("Thank you for your order!");
   
    
   }

    
    public static void main(String []args){
        RedDotFurniture alex = new RedDotFurniture();
        RedDotFurniture jacob = new RedDotFurniture();
       
        int productIdNum = alex.Products();
        
        Random rand = new Random();
        int n = rand.nextInt(50);
        if(n >= 25){
           System.out.println("Forunately that item is in stock!");
        }
        else if (n <= 50){
           System.out.println("Unforunately we have that item is out of stock!");
           System.exit(0);
        }
        
        String day = alex.purchase();
        String time = alex.timeDelivery(day);
        
        jacob.takeOrder(productIdNum,day, time);
        
    }
}
