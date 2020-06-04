/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author VINAY Kumar Sharma 
 * @version 1.0
 */
public class Main {
    /**
     * This is the main method which check outs inventory class
     * @param args 
     */

    public static void main(String[] args){
        
        Scanner v = new Scanner(System.in);
        String a="";
  //---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------      
      /*
  this piece of code is of id input and validation of id 
  */
      
        for(int i=0;i<1;){ 
            try{
        System.out.print("Enter Inventory Item Id(8 digits including '-': ");
        a = v.nextLine();
        if(!Character.isAlphabetic(a.charAt(0)) || !Character.isAlphabetic(a.charAt(1)) || !Character.isAlphabetic(a.charAt(2)) || !Character.isDigit(a.charAt(4))|| !Character.isDigit(a.charAt(5))||
                !Character.isDigit(a.charAt(6))||!Character.isDigit(a.charAt(7)) || a.charAt(3)!='-') //very long condition
        {
                System.out.println("invalid input, the input should be in form of abc-1234");
                i=0;
                a="";
        }
       
        else
        {
                        System.out.println("valid");
                       
                        i=1;
        }
        }      catch(Exception w){
               System.out.println("invalid input, the input should be in form of abc-1234");           
                           }
                        }
 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------        
      /*
 this piece of code deal with item name and its validation
 */

        String a1="";      
        while(a1.length()<=0){
            try{
             System.out.print("Enter item name: ");
             a1= v.nextLine();
        if(a1.length()<=0){
             System.out.println("you can not leave the name empty");
             a1="";
        }
        else
        {
            System.out.println("valid");
            
           }
            }catch(Exception o){
                System.out.println("you can not leave the name empty or fill with numbers");
                a1="";
            }
        }
        
        System.out.println();
 //-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------       
         /*
 this piece of code deal with qoh and its validation
 */
         int b=0;
         while(b<=0){
              try{
        System.out.print("Qty on hand: ");
        b= v.nextInt();
        if(b<=0){
        System.out.println("Error: QOH must be greater than 0.");
        
        }
        else{
            
            System.out.println("ok");
            
        }
        }catch(Exception z){
                System.out.println("Error: QOH must be greater than 0. and no strings allowed");
               
            }
    }
        System.out.println();
 
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
          /*
 this piece of code deal with rop and its validation
 */
         int b1=0;
         while(b1<=0){
             try{
        System.out.print("Reorder point: ");
        
        b1= v.nextInt();
        if(b1<=0)
        System.out.println("Error: QOH must be 0 or more.");
         else{
            
            System.out.println("ok");
            
        }
        }catch(Exception x){
                System.out.println("Error: ROP must be greater than 0. and no strings allowed");
            }
         }
        
        System.out.println();
//--------------------------------------------------------------------------------------------------------------------------------------------------------------
/*
this code is for inputing selling price
*/        
double c=0;
         while(c<=0){
              try{
        System.out.print("Selling Price:$");
        
        c= v.nextDouble();
        if(c<=0)
        System.out.println("Selling price need to be greater than 0");
          else{
            
            System.out.println("ok");
            
        }
          }catch(Exception y){
                System.out.println("Error: SP must be greater than 0. and no strings allowed");
            }
         }
  //----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------              
       // thiis code deaalt with total unit to buy aand its price and stuff 
  
  
        System.out.println();
        System.out.println();

        Inventory abc= new Inventory(a,a1,b,b1,c);

        System.out.println(abc);
        System.out.println();
        System.out.println();

        System.out.print("enter # of unit to buy: ");
        int c1= v.nextInt();
        System.out.println("Total cost;$"+c1*c);
        System.out.println();


      

    } // end of main method

} // end of class
