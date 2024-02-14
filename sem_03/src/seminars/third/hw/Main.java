package seminars.third.hw;

public class Main {
    public static void main(String[] args) {
        int n1 = 5;
        if (evenOddNumber(n1)) {
            System.out.println(n1 + " is even.");
        } else {
            System.out.println(n1 + " is odd.");
        }

        int n2 = 50;
        if (numberInInterval(n2)) {
            System.out.println(n2 + " is in the interval (25;100).");
        } else {
            System.out.println(n2 + " is not in the interval (25;100).");
        }
    }


    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).
    public static boolean evenOddNumber(int n) {
        return n % 2 == 0;
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public static boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }

}
