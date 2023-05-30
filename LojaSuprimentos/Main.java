import java.util.Scanner;
public class Main {
    private static void exibirMenu() {
        System.out.println("Bem vindo ao Menu.");
        System.out.println(" (1)comprar,(2) ver fatura,(3)Encerrar o programa:");
    }

    private static void exibirProdutos(Produto[]produtos){
    
        System.out.println("Produtos disponíveis:");
        for(Produto produto : produtos){
            System.out.println("Código:"+ produto.getCodigo()+", Nome:"+ produto.getNome()+", Preço:"+ produto.getPreco());
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Produto[] produtos={
            new Produto("Picanha", 001, 80.99),
            new Produto("Biscoito", 002, 2.50),
            new Produto("Maionese", 003, 9.99)
       };
    Fatura fatura= new Fatura();
    while(true){
        exibirMenu();
        System.out.println("Digite a operação desejada:");
        String opcao= scanner.nextLine();
        if(opcao.equals("1")){
            exibirProdutos(produtos);
            System.out.println("Digite o código do produto desejado:");
            int codigoDigitado= Integer.parseInt(scanner.nextLine());
            System.out.println("Digite a quantidade:");
            int quantidade=Integer.parseInt(scanner.nextLine());

            Produto produtoSelecionado=null;
            for(Produto produto: produtos){
                if(produto.getCodigo() == codigoDigitado){
                    produtoSelecionado=produto;
                    break;
                }
            }
            if(produtoSelecionado != null){
            Item item=new Item(produtoSelecionado, quantidade, produtoSelecionado.getPreco()* quantidade);
            fatura.adicionarItem(item);
                    System.out.println("Item adicionado à fatura.");
                } else {
                    System.out.println("Código de produto inválido.");
                }
            } else if (opcao.equals("2")) {
                System.out.println("Fatura:");
                for (Item item : fatura.getItens()) {
                    System.out.println("Produto: " + item.getProduto().getNome() +
                            ", Quantidade: " + item.getQuantidade() +
                            ", Valor Total: " + item.getValorTotal());
                }
                System.out.println("Valor Total da Fatura: " + fatura.getValorTotal());
            } else if (opcao.equals("3")) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida. Digite novamente.");
            }
        }
        scanner.close();
    }

    
    }


