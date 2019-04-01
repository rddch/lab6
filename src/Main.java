import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       System.out.println("Введите 4 целых числа от 1 до 9: ");

       Scanner in = new Scanner(System.in);

       double[] array = new double[4];
       int count = 1;

       for (int i = 0; i < 4; i++) {
           array[i] = in.nextInt();
           while (array[i] > 9 || array[i] <= 0) { // Проверка ввода
               System.out.println("Вы ввели неверное число! Внимание, число должно быть в диапазоне от 1 до 9!");
               System.out.println("Повторите попыткку снова: ");
               array[i] = in.nextInt();
               count++;
               if (count == 5) { // Если количество неудачных попыток равно 5, автоматический ввод числа
                   array[i] = (int)(Math.random() * 10);
                   if (array[i] == 0) {
                       array[i] = i+1;
                   }
                   System.out.println();
                   System.out.println("Ввод выполнен  за Вас: " + array[i]);
               }
           }
           count = 1;
       }
        System.out.println("Подождите");
        System.out.println(new YorN().canBeEqualTo24(array));
    }
}
