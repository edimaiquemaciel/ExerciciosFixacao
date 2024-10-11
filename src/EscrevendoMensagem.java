import java.io.FileWriter;
import java.io.IOException;

public class EscrevendoMensagem {
    public static void main(String[] args)  {
        try {
            FileWriter arquivo = new FileWriter("arquivo.txt");
            arquivo.write("Conteúdo a ser gravado no arquivo.");
            arquivo.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
