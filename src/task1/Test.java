package task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Выберите дейтсвие:\s
                    1. Add Task\s
                    2. Display list task
                    3. Delete Task
                    0. Exit""");
            String message = scanner.nextLine();

            switch (Integer.parseInt(message)) {
                case 1 -> {
                    System.out.println("Enter the task:");
                    String task = scanner.nextLine();
                    result.add(task);
                }
                case 2 -> {
                    System.out.println("List Task:");
                    int counter = 0;
                    for (String task : result) {
                        counter++;
                        System.out.println(counter + ". " + task);
                    }
                }
                case 3 -> {
                    while (true) {
                        System.out.println("Select the task to delete or enter finish:");
                        String index = scanner.nextLine();
                        if (index.equalsIgnoreCase("finish")) {
                            break;
                        }
                        result.remove(Integer.parseInt(index) - 1);
                    }
                }
            }
            if (Integer.parseInt(message) == 0) {
                break;
            }
        }
    }
}