import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = scanner.next();
            if (operation.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        for (Integer num : list) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}