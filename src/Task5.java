import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static int unableToEat(ArrayList<Integer> students, ArrayList<Integer> samsas) {
        int ind = 0;

        while (ind < samsas.size()) {
            if (students.get(0).equals(samsas.get(0))) {
                students.remove(0);
                samsas.remove(0);
                ind = 0;
                continue;
            }
            if (ind == samsas.size()) {
                break;
            } else {
                students.add(students.remove(0));
                ind++;
            }
        }

        return students.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> students = new ArrayList<>();
        ArrayList<Integer> samsas = new ArrayList<>();

        System.out.println("Enter values for students array:");
        System.out.println("Enter -1 to stop.");

        int studentValue = scanner.nextInt();
        while (studentValue != -1) {
            students.add(studentValue);
            studentValue = scanner.nextInt();
        }

        System.out.println("Enter values for samsas array:");
        System.out.println("Enter -1 to stop.");

        int samsaValue = scanner.nextInt();
        while (samsaValue != -1) {
            samsas.add(samsaValue);
            samsaValue = scanner.nextInt();
        }

        scanner.close();

        System.out.println("Number of students unable to eat all samsas: " + unableToEat(students, samsas));
    }
}

