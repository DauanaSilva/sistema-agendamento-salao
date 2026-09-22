public class Servico {

    private String nome;
    private double preco;
    private int duracao;

    public Servico(String nome, double preco, int duracao) {
        this.nome = nome;
        this.preco = preco;
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibirServico() {
        System.out.println("Serviço: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Duração: " + duracao + " minutos");
    }
}