import java.util.ArrayList;
import java.util.Scanner;

public class NumberList {
    public static void main(String[] args) {
       
        ArrayList<Integer> numberList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            numberList.add(i);
        }

        
        primeP(numberList);

      
        umf(numberList);
        System.out.println("After updating multiples of 5: " + numberList);

        rmi(numberList);
        System.out.println("Final ArrayList: " + numberList);
    }

  
    public static void primeP(ArrayList<Integer> list) {
        System.out.print("Prime numbers in the list: ");
        for (int num : list) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void umf(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 5 == 0) {
                list.set(i, list.get(i) + 10);
            }
        }
    }

    public static void rmi(ArrayList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0 to " + (list.size() - 1) + "): ");
        int index = scanner.nextInt();
        if (index >= 0 && index < list.size()) {
            list.remove(index);
            System.out.println("Element removed at index " + index);
        } else {
            System.out.println("Invalid index!");
        }
        scanner.close();
    }
}
