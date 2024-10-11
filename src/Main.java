import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o numero a ser dividido");
        int numero = leitura.nextInt();
        System.out.println("Digite o numero divisor");
        int divisor = leitura.nextInt();

        try{
            double result = numero/ divisor;
            System.out.println("resultado: "+ result);

        }catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não permitida.");
        }

    }
}