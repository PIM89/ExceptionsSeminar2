/*
Задание 2.
Если необходимо, исправьте данный код
(https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
*/
public class Task2 {
    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        tast2(ints);
    }

    public static void tast2(int[] intArray) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("CatchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (Exception e){
            System.out.println("Catching exception: " + e);
        }
    }
}
