/*
Jacob Leusch, Samual Hunkler, Jacob Warner, Brittany Posner
*/

import java.util.Scanner;

class Main {
  public static void main(String []args){
    Pillowcase pillowcase = new Pillowcase();
    //New Scanner 
Scanner s = new Scanner(System.in);
System.out.println("Happy Halloween!");
System.out.println("How many houses should we trick or treat at?");
int houseCount = s.nextInt();

//while loop
while (houseCount>0) {
  pillowcase.getCandy();
  houseCount--;
}
System.out.println ("We have " + pillowcase.getTotalCandyNum ()+ "candies");

pillowcase.printNumCandies();
  }
}