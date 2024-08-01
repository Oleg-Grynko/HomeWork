package HomeWork;

import java.util.Scanner;


public class Exe1Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scan.nextDouble();
        System.out.print("Введите операцию (+, -, *, /)  ");

        char sign = scan.next().charAt(0); // Позволяет принимать от пользователя символы (0) значит первый
        System.out.print("Введите второе число  ");
        double number2 = scan.nextDouble();
        double Plus = number1 + number2;
        double Minus = number1 - number2;
        double Multiply = number1 * number2;
        double Difference = number1 / number2;



        if (sign == '+') {
            System.out.println("Результат =  " + Plus);
        }

        if (sign == '-') {
            System.out.println("Результат =  " + Minus);
        }
        if (sign == '*') {
            System.out.println("Результат =  " + Multiply);
        }
        if (sign == '/') {
            System.out.println("Результат =  " + Difference);
        }
        if (sign != '/' && sign != '*' && sign != '+' && sign != '-') {
            System.out.println("Ошибка ввода математического символа ");
        }








        //System.out.print("Введите второе число");



        //Необходимо написать калькулятор. Алгоритм:
        //1. Вывести на экран: Введите первое число
        //2. Получить число с помощью Double.parseDouble(scanner.nextLine()), сохранить его в переменную
        //3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
        //4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
        //4. Вывести на экран: Введите второе число
        //5. Получить число с помощью Double.parseDouble(scanner.nextLine()), сохранить его в переменную
        //6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
        //Если знак операции не относится к перечисленным выше, вывести - "Ошибка"

        //scanner.close();
    }



}
