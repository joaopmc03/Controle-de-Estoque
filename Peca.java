package POO;
import java.util.Scanner;

public abstract class Peca {
    private String descricao;
    private int quantidade;
    private int estoqueMinimo;
    private int estoqueMaximo;
    protected Scanner scanner = new Scanner(System.in);

    public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
    }

    public abstract void venda();

    public void reposicaoEstoque() {
        if (quantidade < estoqueMinimo) {
            quantidade = estoqueMaximo;
            System.out.println("Estoque reposto para " + estoqueMaximo + " unidades.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    @Override
    public String toString() {
        return descricao + " - Quantidade: " + quantidade + 
               " (Mín: " + estoqueMinimo + ", Máx: " + estoqueMaximo + ")";
    }
}
