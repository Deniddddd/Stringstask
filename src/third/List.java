package third;

import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        String[] names = {"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я для пошуку: ");
        String searchName = scanner.nextLine();

        int count = countOccurrences(names, searchName);
        if (count > 0) {
            System.out.println("Ім'я: " + searchName + ", кількість: " + count);
        } else {
            System.out.println("Ім'я " + searchName + " відсутнє у списку.");
        }
    }

    public static int countOccurrences(String[] names, String searchName) {
        int count = 0;
        for (String name : names) {
            if (name.equals(searchName)) {
                count++;
            }
        }
        return count;
    }
}
