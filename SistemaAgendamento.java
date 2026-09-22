import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaAgendamento {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Servico> servicos = new ArrayList<>();
    private List<Agendamento> agendamentos = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public void adicionarAgendamento(Agendamento agendamento) {

        for (Agendamento existente : agendamentos) {

            if (existente.getData().trim().equalsIgnoreCase(agendamento.getData().trim())
                    && existente.getHorario().trim().equalsIgnoreCase(agendamento.getHorario().trim())) {

                System.out.println("Horário já está ocupado!");
                return;
            }
        }

        agendamentos.add(agendamento);
        System.out.println("Agendamento realizado com sucesso!");
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Servico> getServicos() {
        return servicos;
    }

    public void listarClientes() {
        System.out.println("\n--- CLIENTES ---");

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        for (Cliente cliente : clientes) {

            Pessoa pessoa = cliente;
            pessoa.exibirDados();

            System.out.println();
        }
    }

    public void listarServicos() {
        System.out.println("\n--- SERVIÇOS ---");

        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço cadastrado.");
            return;
        }

        for (Servico servico : servicos) {
            servico.exibirServico();
            System.out.println();
        }
    }

    public void listarAgendamentos() {
        System.out.println("\n--- AGENDAMENTOS ---");

        if (agendamentos.isEmpty()) {
            System.out.println("Nenhum agendamento cadastrado.");
            return;
        }

        for (int i = 0; i < agendamentos.size(); i++) {
            System.out.println("Agendamento " + (i + 1));
            agendamentos.get(i).exibirAgendamento();
            System.out.println();
        }
    }

    public void cancelarAgendamento() {

        if (agendamentos.isEmpty()) {
            System.out.println("Não existem agendamentos para cancelar.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        listarAgendamentos();

        System.out.print("Digite o número do agendamento que deseja cancelar: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= agendamentos.size()) {
            agendamentos.remove(numero - 1);
            System.out.println("Agendamento cancelado com sucesso!");
        } else {
            System.out.println("Número de agendamento inválido.");
        }
    }

    public void consultarHorarios(String data) {

        System.out.println("\n--- HORÁRIOS PARA " + data + " ---");

        String[] horarios = {
                "09:00",
                "10:00",
                "11:00",
                "12:00",
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00"
        };

        for (String horario : horarios) {

            boolean ocupado = false;

            for (Agendamento agendamento : agendamentos) {

                if (agendamento.getData().trim().equalsIgnoreCase(data.trim())
                        && agendamento.getHorario().trim().equalsIgnoreCase(horario.trim())) {

                    ocupado = true;
                    break;
                }
            }

            if (ocupado) {
                System.out.println(horario + " - Ocupado");
            } else {
                System.out.println(horario + " - Disponível");
            }
        }
    }
}