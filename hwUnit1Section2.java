/**
* AutoCoin Program. *
* @MiaTabladillo
* @8/19/19
*/
public class Unit1Hw2 {
/**
* Constructor for objects of class Unit1Hw2 */
public static void main(String[] args) {
int quarters=25;
int dimes=10;
int nickels=5;
int pennies=1;
int initialAmount=93; int remainingAmount;
quarters = initialAmount/quarters; remainingAmount = initialAmount % quarters;
dimes = remainingAmount / dimes; //remainingAmount = remainingAmount % dimes; nickels = remainingAmount / nickels; //remainingAmount = remainingAmount % nickels; pennies = remainingAmount;
System.out.println(quarters); System.out.println(dimes); System.out.println(nickels); System.out.println(pennies);
} }
