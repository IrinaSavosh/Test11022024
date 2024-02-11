// 1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
// - сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
// - совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ComparisonOfNumber {


   /**
    * @param args
    */
   public static void main(String[] args) {
      ArrayList<Integer> array = new ArrayList<>();
      int size = 100;

      for (int i = 0; i < size; i++) {
         Random rnd = new Random();
         array.add(rnd.nextInt(10));
      }
      System.out.print("Введите первое число: ");
      Scanner scan = new Scanner(System.in);
      int numberOne = scan.nextInt();
      System.out.print("Введите второе число: ");
      int numberTwo = scan.nextInt();

      
      System.out.println(numberOne + "     " + numberTwo);
      comparison(numberOne, numberTwo);
      addition(numberOne, numberTwo);
      substraction(numberOne, numberTwo);
      multiplication(numberOne, numberTwo);
      division(numberOne, numberTwo);

      scan.close();
   }

   public static void comparison (int a, int b){
      if (a<b){
         System.out.println(a + " < " + b);
      }
      else if (a>b) {
         System.out.println(a + " > " + b);
         
      }
      else {
         System.out.println(a + " = " + b);
      }
   }

   public static void addition (int a, int b){
      System.out.println("Сумма чисел:");
      System.out.println(a+b);
   }

   public static void substraction (int a, int b){
      System.out.println("Разность чисел:");
      System.out.println(a-b);
   }

   public static void multiplication (int a, int b){
      System.out.println("Произведение чисел:");
      System.out.println(a*b);
   }

   public static void division (int a, int b){
      System.out.println("Частное чисел:");
      System.out.println((double)a/b);
   }

}
