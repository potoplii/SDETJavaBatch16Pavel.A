package HWClass7;

public class HW3 {
    public static void main(String[] args) {
        //Print even numbers from 20 to 1 (2 ways)
        for (int numbers = 20; numbers >= 1; numbers -= 2) {
            System.out.print(numbers + " ");
        }
        int number = 20;
        System.out.println();
        while (number >= 1) {
            System.out.print(number + " ");
            number -= 2;
        }
    }
}