import java.util.Scanner;
public class ConversorDeMetros {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor em metros: ");
        double metros = scanner.nextDouble();
        double centimetros =  metros*100;
        System.out.println("O valor digitado em metros equivale a "+centimetros+" centímetros.");
    }
}
