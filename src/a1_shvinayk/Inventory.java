/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VINAY Kumar Sharma
 * @version 1.0
 */
public class Inventory {
    
   private String id;
   private String name;
   private int qoh;
   private int rop;
   private double sellPrice;
   public int roll;
 //--------------------------------------------------------------------------------------- 
   /*
   constructors 
   */
   /**
    * this act as default constructor
    */
   public Inventory (){
       id="abc-1234";
        name="New Item";
         qoh=0;
          rop=25;
           sellPrice=0;
   }
   /**
    * my constructor with 3 arguments
    * @param id
    * @param name
    * @param sellPrice 
    */
   public Inventory(String id,String name,double sellPrice){
       this.id=id;
        this.name=name;
         this.sellPrice=sellPrice;
   }
   /**
    * my constructor with 5 arguments
    * @param id
    * @param name
    * @param qoh
    * @param rop
    * @param sellPrice 
    */
       public Inventory(String id,String name,int qoh,int rop,double sellPrice){
       this.id=id;
        this.name=name;
         this.qoh=qoh;
          this.rop=rop;
           this.sellPrice=sellPrice;
   }
  //-----------------------------------------------------------------------------------------------   
       /*
       setter or mutator methods
       */
       /**
        * for id set
        * @param id 
        */
    public void setId(String id){
         this.id=id;
    }  
    /**
     * for name set
     * @param name 
     */
     public void setName(String name){
          this.name=name;
     }  
     /**
      * to set qoh
      * @param qoh 
      */
      public void setQoh(int qoh){
           this.qoh=qoh;
      }  
      /**
       * to set rop
       * @param rop 
       */
       public void setRop(int rop){     
            this.rop=rop;
       }  
       /**
        * to set price
        * @param price 
        */
        public void setSellPrice(double price){
           sellPrice=price;
        }
 //------------------------------------------------------------------------------------------ 
        /*
        accessor or getter methods
        */
        /**
         * getting id
         * @return id
         */
    public String getId(){
        return id;
    }
     /**
         * getting name
         * @return name
         */
     public String getName(){
         return name;
     }
      /**
         * getting qoh
         * @return qoh
         */
      public int getQoh(){
          return qoh;
      }
       /**
         * getting rop
         * @return rop
         */
       public int getRop(){
           return rop;
       }
        /**
         * getting sp
         * @return sp
         */
        public double getSellPrice(){
           return sellPrice;
        }
//------------------------------------------------------------------------------------------ 
        /**
         * the to string method to return custom string
         * @return 
         */
        @Override
public String toString(){
    return(id+"("+name+"),"+qoh+", Price: $"+sellPrice);
}
}

