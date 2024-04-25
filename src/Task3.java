import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> liniya = new ArrayList<>();

        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int q = input.nextInt();
            if (q == 1) {
                int disk = input.nextInt();
                liniya.add(0, disk);  // add left
            } else if (q == 2) {
                int disk = input.nextInt();
                liniya.add(disk);  // add right
            } else if (q == 3) {
                System.out.print(liniya.remove(0) + " ");  // minus left and print
            } else if (q == 4) {
                System.out.print(liniya.remove(liniya.size() - 1) + " ");  // minus right and print
            } else {
                // error print
                System.out.println("Invalid operation");
            }
        }
    }
}
