import java.util.*;
public class recursion{
    public static int factorial(int n){
    if(n==0||n==1) return 1;
        return n*factorial(n-1);
    }
    public static int sumOfDigit( int n){
        int sum=0;
        if(n==0) return sum;
            int digit=n%10;
            sum+=digit;  
        return sumOfDigit(n/10);
    }
    public static int printNos(int n){
       if(n==0) return 0;
       System.out.print(n+"->");
       return printNos(n-1);
    }
    public static int powerOfn(int n,int m){
        if(m==0) return 1;
        if(m==1) return n;
        return n*powerOfn(n, m-1);
    }
    public static int reverse(int n, int rev){        
        if(n==0) return rev;
        return reverse(n/10,rev*10+n%10);
    }
    public static int countDigit(int n, int count){
        if(n==0) return count;
        count++;
        return countDigit(n/10,count);   
    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        System.out.println("factorial of digit is :"+ factorial(n));
        System.out.println("Sum of digits is "+ sumOfDigit(n));
        System.out.println("print nos:");
        printNos(n);
        System.out.println("power of n to m is "+ powerOfn(n, m));
        System.out.println("reverse is "+ reverse(n,0));
        System.out.println("no of digits are "+ countDigit(n,0));
        System.out.println("fibonacci "+fibonacci(n));
    }
}