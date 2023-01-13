package com.driver;

import java.util.Scanner;
public class Main {
   public static  void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       int y = sc.nextInt();
       int z = sc.nextInt();
       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       Product p = new Product();

       System.out.println(p.product(x,y));
       System.out.println(p.product(x,y,z));
       System.out.println(p.product(x1,y1));


   }
}
class Product{
    public int product(int x, int y) {
        return x*y;
    }
    public int product(int x,int y,int z){
        return x*y*z;
    }
    public double product(double x,double y){
        return x*y;
    }


}
