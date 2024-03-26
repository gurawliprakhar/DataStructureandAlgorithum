package DataType;

import java.util.Scanner;
/*
. Discount Calculator
The iron and steel industry manufactures various products using iron, steel, tungsten, and
nickel. Customers are the one who place bulk orders to the industry. The industry gives
two discount cards for its customers. One is based on the type of metal purchased and
another one is based on the total purchase cost. At any point in time, customer can use
one of the two discount cards.
The goal is to calculate the discount using the two discount cards and recommend the customer
to use the one which gives the highest discount.
For example, the industry has the below two discount cards
Type of metal
purchased
Discount% on purchase
amount
Iron 7%
Steel 3%
Tungsten 2%
Nickel 1%
Total purchase cost
in Rs
Discount% on the purchase
cost
Till 25000 Nil
25001 to 50000 5%
50001 to 100000 7%
>100000 10%
If the customer purchases Rs.15000 worth of Iron, Rs.10000 worth of steel, Rs.2000 worth of
Tungsten and Rs.1500 worth of Nickel, then as per the two discounts rate cards, then the
discount can be calculated as follows,
As per discount rate card 1, discount rate = (15000*7/100) + (10000*3/100) + (2000*2/100) +
(1500*1/100) = Rs.1405.00
As per discount rate card 2, total purchase amount = 15000+10000+2000+1500= 28500, hence
discount rate = 28500*5/100 = Rs.1425.00
As the discount is more using the second discount rate, the customer can use the second discount
rate card and second discount amount.
Function Description
Complete the function calculateDiscount in the editor and its prints the discount rate.
calculateDiscount has the following parameter(s);
Purchase cost of Iron: integer
Purchase cost of Steel: integer
Purchase cost of Tungsten: integer
Purchase cost of Neckel: integer
Constraints
· All the four input values are integers
· Final output should be printed in a float with two precisions
Input Format For Custom Testing
The first line contains an integer, n1, denoting the purchase cost of iron
The second line contains an integer, n2, denoting the purchase cost of steel
The third line contains an integer, n3, denoting the purchase cost of tungsten
The forth line contains an integer, n4, denoting the purchase cost of nickel
Sample Input
15000
10000
2000
1500
Sample Output
1425.00
Explanation
As per discount rate card 1, discount rate = (15000*7/100) + (10000*3/100) + (2000*2/100) +
(1500*1/100) = Rs.1405.00
As per discount rate card 2, total purchase amount = 15000+10000+2000+1500= 28500, hence
discount rate = 28500*5/100 = Rs.1425.00
Higher discount is Rs.1425.00
 */
public class DiscountCalculator {
    // function should always use camelconvection
    public static float discountCalculator(float i, float s, float t, float n){
      float d1 = 0.0f;
      float d2 = 0.0f;
      d1 = (i*(7.0f/100)) + (s*(3.0f/100)) + (t*(2.0f/100)) + (i*(1.0f/100));
      float sum = i + s + t + n;
      if(sum <= 25000){
          d2 = 0;
      }else if(sum >= 250001 && sum <= 50000){
          d2 = sum * (5.0f/10);
          
      }else if (sum >= 50001 && sum <= 100000) {
          d2 = sum * (7.0f/10);
      }else{
        d2 = sum * ((10.0f/100));
      }
      if(d1 > d2){
          return d1;
      }else{
          return d2;
      }
    }

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        System.out.println("Purchase cost of Iron: ");
        float i = scan.nextFloat();
        System.out.println("Purchase cost of Steel: ");
        float s = scan.nextFloat();
        System.out.println("Purchase cost of tungestan : ");
        float t = scan.nextFloat();
        System.out.println("Purchase cost of Nickel: ");
        float n = scan.nextFloat();

        DiscountCalculator disCalc = new DiscountCalculator();
        System.out.println(disCalc.discountCalculator(i,s,t,n));
    }
}
