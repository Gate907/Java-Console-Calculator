/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Calculator
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you 1st Number");
        double a=sc.nextDouble();
        System.out.println("Enter you 2nd Number");
        double b=sc.nextDouble();
        System.out.println(" ");
       int ch; 
        do{
            System.out.print("1: Addition "+"\n"+"2: Subtraction "+"\n"+
        "3: Multiplication "+"\n"+"4: Division ");
        
        System.out.println(" ");
        System.out.print("Enter Choice :");
         ch=sc.nextInt();
            switch(ch){
                case 1:
                    {
                        double ans = a+b;
                        System.out.println("Addition are ="+ans);
                        break;
                    }
                case 2:
                    {
                        double ans = a-b;
                        System.out.println("Subtraction are ="+ans);
                        break;
                    }
                case 3:
                    {
                        double ans = a*b;
                        System.out.println("Multiplication are ="+ans);
                        break;
                    }
                case 4:
                    {
                        try{
                             double ans = a%b;
                                System.out.println("Division are ="+ans);
                                break;
                        }catch(Exception e){
                            System.out.println("Divide not by zero ");
                        }
                    }
            }
        }while(ch!=5);
       
	}
}
