import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, opc;
        System.out.println("Ingrese un número");
        num1 = scanner.nextInt();
        System.out.println("Ingrese el otro número");
        num2 = scanner.nextInt();

        do {
                System.out.println("Indique que quiere realizar");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                opc = scanner.nextInt();
            } while (opc < 1 || opc > 5);
            switch (opc) {
                case 1:
                    System.out.println(num1+num2);
                    break;
                case 2:
                    System.out.println(num1-num2);
                    break;
                case 3:
                    System.out.println(num1*num2);
                    break;
                case 4:
                    System.out.println(num1/num2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tenga buen día");
            }


        }
    }
