import java.util.Scanner;

public class Calculator
{
    static void project03()
    {
        Scanner keyboard = new Scanner(System.in);


        while(true)
        {
            System.out.println("enter a message");
            String line = keyboard.nextLine();
            System.out.println(line);
            String[] array = line.split("[ |,]");
            String cmd = array[0];

            int a=-1, b=-1;

            if(array.length == 3)
            {
                a = Integer.parseInt(array[1]);
                b = Integer.parseInt(array[2]);
            }

//        if(cmd.equals("add"))
//            System.out.println(a + b);
//        else if(cmd.equals("sub"))
//            System.out.println(a - b);
//        else

            switch (cmd)
            {
                case "add": System.out.println(a+b); break;
                case "sub": System.out.println(a-b); break;
                case "mul": System.out.println(a*b); break;
                case "div": System.out.println(a/b); break;
                case "exit": System.exit(0);
            }
        }
    }

    public static void main(String[] args)
    {
        project03();
    }
}