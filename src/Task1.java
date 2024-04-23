import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                array.add(scanner.nextInt());
            }
            arrays.add(array);
        }

        System.out.println("\n");

        int queries = scanner.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x <= arrays.size() && y <= arrays.get(x - 1).size()) {
                System.out.println(arrays.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}