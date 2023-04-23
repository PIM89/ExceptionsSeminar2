import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/
public class Task4 {
    public static void main(String[] args) {
        checkEmptyString();
    }
    public static void checkEmptyString(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите любую строку: ");
        String result = in.next();
        if (result.isEmpty()) {
            throw new RuntimeException("Введенная строка пустая!");
        }
        System.out.println("Введенная строка соответствует требованиям");
    }
}
