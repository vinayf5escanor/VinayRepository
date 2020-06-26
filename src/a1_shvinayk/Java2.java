/*
assignment 1 
*/
package a1_shvinayk;
import java.util.Arrays;
public class Java2 {
    public static void main(String[] args) {
//     students[] array= new students[5];
//              array[0]=new students("Vinay");
//               array[1]=new students("Vali");
//                array[2]=new students("Puneeta");
//                 array[3]=new students("Simran");
//                  array[4]=new students("Alankrita");
//                  
//          for(int i=0;i<array.length;i++) 
//              System.out.println(array[i].getName());
//           
//        
            int[] a = (CountChar('a','b','1','4','8','o','p','4'));
            System.out.println(a[0]);
            System.out.println(a[1]);
            System.out.println(a[2]);
    }//end of method
     public static int[] CountChar(char... x) { 
        int[] count=new int[3];
        
        for(int i=0;i<x.length;i++){
            if(Character.isDigit(x[i]))
                count[0]++;
            else if(Character.isLetter(x[i]))
                count[1]++;
            else
                count[2]++;
        }
        
return count;
    }
}//end of class
