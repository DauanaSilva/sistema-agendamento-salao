public class Agendamento {

    private Cliente cliente;
    private Servico servico;
    private String data;
    private String horario;

    public Agendamento(Cliente cliente, Servico servico, String data, String horario) {
        this.cliente = cliente;
        this.servico = servico;
        this.data = data;
        this.horario = horario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public String getData() {
        return data;
    }

    public String getHorario() {
        return horario;
    }

    public void exibirAgendamento() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Serviço: " + servico.getNome());
        System.out.println("Data: " + data);
        System.out.println("Horário: " + horario);
    }
}
