import java.util.List;
import java.util.ArrayList;
public class Fatura {
    private List<Item> itens;
    private double valorTotal;
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Fatura(){
        this.itens= new ArrayList<>();
        this.valorTotal= 0.0;
    }
    public void adicionarItem(Item item){
        itens.add(item);
        valorTotal += item.getValorTotal();
    }
    public List<Item> getItens(){
        return itens;
    }
   
}
