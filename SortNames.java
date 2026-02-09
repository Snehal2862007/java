import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        String[] names = new String[n];

        // Input names
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        // Sort
        Arrays.sort(names);

        // Display
        System.out.println("\nSorted Names:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
