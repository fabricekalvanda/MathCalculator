// FABRICE KALVANDA

public class MyCalculator
{
   public static double half(int num)
   {
      double half = 0;
      
      half = num/2.0;
      System.out.println("The half of this number is: " + half);
      return half;
   }
   
   public static int triple(int num)
   {
      int triple = 0;
      
      triple = num * 3;
      System.out.println("The triple of this number is: " + triple);
      return triple;
   }
   
   public static int product2(int num1, int num2)
   {
     //int a = 0;
     //a = num1 * num2;
     System.out.println("The product of these numbers is: " + num1 * num2);

     return num1 * num2;
   }   
   
   public static boolean isPositive(double num)
   {
     System.out.println("This is"); 
     return (num > 0);
   }         
   
   public static long rangeSum(int x, int y)
   {
      if( x < y)
      {
         long rangeSum = 0;
         for(int i = x; i<=y; i++)
         {
            rangeSum = rangeSum + i;
         }
       System.out.println("The range sum of these numbers is: " + rangeSum);  
            return rangeSum;
      }
            return -1;                              
   }
      
}      