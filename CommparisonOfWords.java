// 2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
// В результате сравнения в консоль должно быть выведено одно из сообщений: "Строки неидентичны" или "Строки идентичны"
import java.util.Scanner;


public class CommparisonOfWords {
   public static void main(String[] args) {
      
      System.out.print("Введите первую строку: ");
      Scanner scan = new Scanner(System.in);
      String LineOne = scan.nextLine();
      System.out.print("Введите вторую строку: ");
      String LineTwo = scan.nextLine();

      
      System.out.println(LineOne + "     " + LineTwo);
      comparison(LineOne, LineTwo);

      scan.close();
   }

   public static void comparison(String a, String b){
   if(a.equals(b)){
      System.out.println("Строки идентичны");
    }else{
      System.out.println("Строки не идентичны");
    }}
}
