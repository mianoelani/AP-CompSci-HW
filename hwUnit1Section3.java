/**
* Homework 1.3 -- create a grade average calculator *
* @MiaTabladillo
* @8/21/2019
*/
public class Unit1Hw3 {
/**
* Finds the average of a setc of numbers (grades) */
public static void main(String[] args) {
// first set of grades double gradeOne = 90; double gradeTwo = 90; double gradeThree = 89; double gradeFour = 89; double totalGrade; double finalGrade;
totalGrade = gradeOne + gradeTwo + gradeThree + gradeFour; finalGrade = totalGrade / 4;
//prints out "Final Grade: 90"
System.out.println ("Final Grade 1: " + (int) (finalGrade + 0.5));
//second set of grades
double gradeOne2 = 90; double gradeTwo2 = 89; double gradeThree2 = 89; double gradeFour2 = 89; double totalGrade2; double finalGrade2;
totalGrade2 = gradeOne2 + gradeTwo2 + gradeThree2 + gradeFour2; finalGrade2 = totalGrade2 / 4;
//prints out "Final Grade: 89"
System.out.println ("Final Grade 2: " + (int) (finalGrade2 + 0.5));
} }
