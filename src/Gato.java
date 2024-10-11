public class Gato extends Animal {
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
        System.out.println("Miau!");
    }

    public void arranharMoveis() {
        System.out.println("Arranahndo os móveis");
    }
}
