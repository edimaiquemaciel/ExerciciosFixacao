import java.util.Scanner;

public class SenhaUsuario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite sua senha");
        String senha = leitura.next();

        try{
            verificarSenha(senha);
            System.out.println("A usa senha é: "+ senha);

        }catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }

    }

    private static void verificarSenha(String senha){
        if (senha.length() < 8){
            throw new SenhaInvalidaException("Sua senha deve conter no mínimo 8 caracteres. Tente novamente.");
        }
    }


}
