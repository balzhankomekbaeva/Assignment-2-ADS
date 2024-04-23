import java.util.*;

public class Task4 {
    public static void reverseArray(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the number of an array; ");
        int n = scanner.nextInt();
        System.out.print("Enter values for the array:");

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        reverseArray(arr);
        System.out.println("Reversed array: " + arr);
    }
}