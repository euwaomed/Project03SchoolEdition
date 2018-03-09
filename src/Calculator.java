import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

            /*while (keyboard.hasNextLine()) {
               // System.out.println("enter a message");
                String line = keyboard.nextLine();
                // System.out.println(line);
                String[] array = line.split(" ");
                String cmd = array[0]; */

        while (keyboard.hasNextLine()) {
            String line = keyboard.nextLine();
            String[] array = line.split(" ");
            String cmd = array[0];

                int a = -1, b = -1;

                if (array.length == 3) {
                    a = Integer.parseInt(array[1]);
                    b = Integer.parseInt(array[2]);

                    switch (cmd) {
                        case "add":
                            System.out.println(a + b);
                            break;
                        case "sub":
                            System.out.println(a - b);
                            break;
                        case "mul":
                            System.out.println(a * b);
                            break;
                        case "div":
                            System.out.println(a / b);
                            break;
                        case "exit":
                            System.exit(0);
                    }
                }
            }
        }
    }
