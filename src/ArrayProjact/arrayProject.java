package ArrayProjact;
import java.util.Scanner;

 

// task number 1 

public class arrayProject {

 

       public static void main(String[] args) {

          

             Scanner sc= new Scanner(System.in);    
             //System.in is a standard input stream 

            

             int array[]=new int[5];   

             System.out.print("Enter first number- "); 

             array[0] = sc.nextInt(); 

             System.out.print("Enter second number- "); 

             array[1]= sc.nextInt(); 

             System.out.print("Enter third number- "); 

             array[2]= sc.nextInt(); 

             System.out.print("Enter fourth number- "); 

             array[3]= sc.nextInt(); 

             System.out.print("Enter fifth number- "); 

             array[4]= sc.nextInt();

             int total =array[0]+array[1]+array[2]+array[3]+array[4];

            

             System.out.println("The Total "+total);

       }

 

}