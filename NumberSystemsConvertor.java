 /*Eli Boudaie
 * March 12, 2018
 * NumberSystemsConvertor
 * */

 import java.util.*;
 public class NumberSystemsConvertor {
  public static void main(String args[]) {
   Scanner keyInput = new Scanner(System.in);
   System.out.print("What number type would you like to enter? Choose between decimal, binary, octal, or hexadecimal.");
   String i = keyInput.nextLine();

   System.out.print("What number type would you like to convert it to?");
   String j = keyInput.nextLine();

   System.out.print("Enter the number you would like to convert. Limit the number to 6 digits.");
   int k = keyInput.nextInt();

   if (i.equals("decimal") && j.equals("binary")) {
    if (k == 0) {
     System.out.println("0");
    }
    String binary = "";
    while (k > 0) {
     int remainder = k % 2;
     binary = remainder + binary;
     k = k / 2;
    }
    System.out.println("The binary conversion to the number you entered is: " + binary);

   }
   if (i.equals("binary") && j.equals("decimal")) {
    if (k == 0) {
     System.out.println("0");
    }
    int d = 0;
    int pwr = 0;
    String binary = "";
    while (k > 0) {
     int a = k % 10;
     d += a * Math.pow(2, pwr);
     k = k / 10;
     pwr++;
    }
    System.out.println("The decimal conversion to the number you entered is: " + d);
   }
   if (i.equals("decimal") && j.equals("octal")) {
    if (k == 0) {
     System.out.println("0");
    }
    String octal = "";
    int rem = 0;
    while (k > 0) {
     rem = k % 8;
     octal = rem + octal;
     k = k / 8;
    }
    System.out.println("The octal conversion to the number you entered is: " + octal);
   }

   if (i.equals("octal") && j.equals("decimal")) {
    if (k == 0) {
     System.out.println("0");
    }
    int decimal = 0;
    int n = 0;
    while (k > 0) {
     int b = k % 10;
     decimal += b * Math.pow(8, n);
     k = k / 10;
     n++;
    }
    System.out.println("The decimal conversion to the number you entered is: " + decimal);
   }
   if (i.equals("decimal") && j.equals("hexadecimal")) {
    if (k == 0) {
     System.out.println("0");
    }
    String hd = "";
    String[] hexNum = {
     "0",
     "1",
     "2",
     "3",
     "4",
     "5",
     "6",
     "7",
     "8",
     "9",
     "A",
     "B",
     "C",
     "D",
     "E",
     "F"
    };
    int rem = 0;
    while (k > 0) {
     rem = k % 16;
     hd = hexNum[rem] + hd;
     k = k / 16;
    }
    System.out.println("The hexadecimal conversion to the number you entered is: " + hd);
   }
   if (i.equals("hexadecimal") && j.equals("decimal")) {
    int power = 0;
    int decimal = 0;
    String hexNum = "0123456789ABCDEF";
    String hexCode = k.toUpperCase();
    for (int index = 0; index < hexCode.length(); index++) {
     char digit = hexNum.charAt(k.length() - index - 1);
     decimal = decimal + hexCode.indexOf(digit) * (int) Math.pow(16, power++);
    }
    System.out.println("The hexadecimal conversion to the number you entered is: " + decimal);
   }

  }