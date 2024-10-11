public class Cachorro extends Animal{
    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        System.out.println("Auau!");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
}
