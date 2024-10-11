import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;

record Pessoas(String nome, int idade, String cidade){
}

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
         String jsonPessoa = "{\"nome\": \"Rodrigo\",\"cidade\":\"Brasília\"}";

        Gson gson = new Gson();
        Pessoas pessoa = gson.fromJson(jsonPessoa, Pessoas.class);

        System.out.println("Objeto Pessoa: " + pessoa);


    }
}
