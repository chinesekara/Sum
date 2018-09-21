/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.util.Scanner;

/**
 *
 * @author Jin
 */
public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i;
       int n;
       int m;
       Scanner sc=new Scanner(System.in);
       int sum;
       int fac;
       sum=0;
       fac=1;
       System.out.print("please input M: ");
       m=sc.nextInt();
       System.out.print("please input N: ");
       n=sc.nextInt();
       for (i=m;i<=n;i++) { //i++ is equivalent to i = i+1;
            sum+=i; // sum+i is quivalent to sum=sum+i;
            fac*=i; // sac*=i is equivalent to fac=fac*i;
       }
       System.out.println("sum="+sum+",fac="+fac);
    }
    
}
