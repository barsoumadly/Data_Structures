import java.util.LinkedList;
import java.util.Scanner;

public class PracticeJava {
    public static void main(String[] args) {
        startApplication();
    }

    public static void startApplication() {
        int binaryNumber = getDecimalNumber();
        LinkedList<Integer> list = addBinaryToLinkedList(binaryNumber);
        int integerNumber = convertBinaryToDecimal(list);
        addIntegerToLinkedList(list, integerNumber);
        integerNumber = getIntegerNumber(list);
        System.out.println(integerNumber);
    }

    public static int getDecimalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter binary number");
        return scanner.nextInt();
    }

    public static LinkedList<Integer> addBinaryToLinkedList(int binaryNumber) {
        LinkedList<Integer> list = new LinkedList<>();
        while (binaryNumber != 0) {
            list.add(binaryNumber % 10);
            binaryNumber /= 10;
        }
        return list;
    }

    public static int convertBinaryToDecimal(LinkedList<Integer> list) {
        int counter = 0;
        int integerNumber = 0;
        while (counter != list.size()) {
            integerNumber += (list.get(counter) * Math.pow(2, counter));
            counter++;
        }
        return integerNumber;
    }

    public static void addIntegerToLinkedList
            (LinkedList<Integer> list, int integerNumber) {
        int remainder, counter = list.size() - 1;
        while (counter != -1) {
            remainder = integerNumber % 10;
            list.remove(counter);
            list.add(counter, remainder);
            integerNumber /= 10;
            counter--;
        }
    }

    public static int getIntegerNumber(LinkedList<Integer> list) {
        StringBuilder num = new StringBuilder();
        for (Integer i : list) {
            num.append(i);
        }
        return Integer.parseInt(num.toString());
    }
}
