import java.util.Scanner;

/*
Задание 1.
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/


public class Task1 {
    public static void main(String[] args) {
        System.out.println(requestFloatNumber());
    }

    public static float requestFloatNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        float f;
        try {
            f = Float.parseFloat(in.next());
        } catch (NumberFormatException e) {
            System.out.println("Введены не корректные данные!");
            return requestFloatNumber();
        }
        return f;
    }
}
