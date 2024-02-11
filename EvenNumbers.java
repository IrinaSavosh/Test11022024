// Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]. Необходимо написать программу, которая выведет в консоль все чётные числа. 

public class EvenNumbers {
   public static void main(String[] args) {

      int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

      for (int n : numbers) {
         if ((n % 2) == 0) {
            System.out.println(n);
         }
      }
   }
}
