import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

// Задача 3. В калькулятор добавьте возможность отменить последнюю операцию.

public class Zadacha_3 {
    public static void delete() throws IOException {
        Scanner log = new Scanner(new File("../Seminar_4/log_calc.txt"));
        ArrayList<String> data = new ArrayList<>();
        String my_line;
        while (log.hasNextLine()) {
            my_line = log.nextLine();
            data.add(my_line);
        }
        PrintWriter out = new PrintWriter(new FileWriter("../Seminar_4/log_calc.txt", false));
        for (int i = 0; i < data.size() - 1; i++) {
            out.println(data.get(i));
        }
        log.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        double num1;
        double num2;
        double result;
        char op;
        Scanner reader = new Scanner(System.in);
        System.out.print("Введите последовательно два числа:\n");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print(
                "\nВведите математическую оперцию с указанными числами (+, -, *, /) или отмену предыдущей операции (C): ");
        op = reader.next().charAt(0);
        switch (op) {
            case 'C':
                delete();
                result = 0;
                reader.close();
                return;
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Введена некорректная операция, попробуйте снова");
                reader.close();
                return;
        }

        System.out.print("\nРезультат:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + result);
        try (FileWriter my_log = new FileWriter("../Seminar_4/log_calc.txt", true)) {
            my_log.write(num1 + " " + op + " " + num2 + " = " + result + "\n");
            my_log.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        reader.close();
    }
}
