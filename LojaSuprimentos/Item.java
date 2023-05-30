public class Item {
    private Produto produto;
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    private int quantidade;
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    private double valorTotal;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Item(Produto produto, int quantidade, double valorTotal){
        this.produto=produto;
        this.quantidade=quantidade;
        this.valorTotal=valorTotal;
    }
} 
