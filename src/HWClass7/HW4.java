package HWClass7;

public class HW4 {
    public static void main(String[] args) {
        //Print odd numbers between 20 and 50 (2 ways)
        for (int numbers = 50; numbers >= 20; numbers--) {
            if (numbers % 2 == 1) {
                System.out.print(numbers + " ");
            }
        }
        int number = 50;
        System.out.println();
        while (number >= 20) {
            if (number % 2 == 1)
                System.out.print(number + " ");
            number--;
        }
    }
}