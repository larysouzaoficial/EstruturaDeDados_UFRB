import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float altura, peso, IMC;

        System.out.println("Digite a altura em cm: ");
        altura = sc.nextFloat();

        System.out.println("Digite o peso em kg: ");
        peso = sc.nextFloat();

        IMC = peso / (altura * altura) *10000;

        System.out.printf("O IMC é: %.2f / ", IMC);

        if (IMC < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("Obesidade grau II");
        } else if (IMC >= 40) {
            System.out.println("Obesidade grau III (mórbida)");
        }

    }
}
