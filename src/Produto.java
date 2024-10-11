public class Produto {
    private String nome;
    private double preco;
    private int quantidade;


    public double getPreco() {
        return preco;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return """
                Nome: %s
                Preço: %.2f
                Quantidade: %d
                """.formatted(this.nome, this.preco, this.quantidade);
    }
}
