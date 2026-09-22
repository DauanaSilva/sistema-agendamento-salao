import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaAgendamento sistema = new SistemaAgendamento();

        int opcao = 0;

        while (opcao != 9) {

            System.out.println("\n===== SISTEMA DE AGENDAMENTO =====");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Cadastrar serviço");
            System.out.println("3 - Realizar agendamento");
            System.out.println("4 - Listar clientes");
            System.out.println("5 - Listar serviços");
            System.out.println("6 - Listar agendamentos");
            System.out.println("7 - Cancelar agendamento");
            System.out.println("8 - Consultar horários disponíveis");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();

                    System.out.print("Digite o telefone: ");
                    String telefone = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, telefone);
                    sistema.adicionarCliente(cliente);

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Digite o nome do serviço: ");
                    String nomeServico = scanner.nextLine();

                    System.out.print("Digite o preço do serviço: ");
                    double preco = scanner.nextDouble();

                    System.out.print("Digite a duração em minutos: ");
                    int duracao = scanner.nextInt();
                    scanner.nextLine();

                    Servico servico = new Servico(nomeServico, preco, duracao);
                    sistema.adicionarServico(servico);

                    System.out.println("Serviço cadastrado com sucesso!");
                    break;

                case 3:

                    if (sistema.getClientes().isEmpty()) {
                        System.out.println("Cadastre pelo menos um cliente antes de realizar um agendamento.");
                        break;
                    }

                    if (sistema.getServicos().isEmpty()) {
                        System.out.println("Cadastre pelo menos um serviço antes de realizar um agendamento.");
                        break;
                    }

                    System.out.println("\n--- ESCOLHA O CLIENTE ---");

                    for (int i = 0; i < sistema.getClientes().size(); i++) {
                        System.out.println((i + 1) + " - "
                                + sistema.getClientes().get(i).getNome());
                    }

                    System.out.print("Digite o número do cliente: ");
                    int numeroCliente = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroCliente < 1 || numeroCliente > sistema.getClientes().size()) {
                        System.out.println("Cliente inválido.");
                        break;
                    }

                    Cliente clienteEscolhido =
                            sistema.getClientes().get(numeroCliente - 1);

                    System.out.println("\n--- ESCOLHA O SERVIÇO ---");

                    for (int i = 0; i < sistema.getServicos().size(); i++) {
                        Servico servicoLista = sistema.getServicos().get(i);

                        System.out.println((i + 1) + " - "
                                + servicoLista.getNome()
                                + " | R$ " + servicoLista.getPreco()
                                + " | " + servicoLista.getDuracao() + " minutos");
                    }

                    System.out.print("Digite o número do serviço: ");
                    int numeroServico = scanner.nextInt();
                    scanner.nextLine();

                    if (numeroServico < 1 || numeroServico > sistema.getServicos().size()) {
                        System.out.println("Serviço inválido.");
                        break;
                    }

                    Servico servicoEscolhido =
                            sistema.getServicos().get(numeroServico - 1);

                    System.out.print("Digite a data do agendamento: ");
                    String data = scanner.nextLine();

                    System.out.print("Digite o horário: ");
                    String horario = scanner.nextLine();

                    Agendamento agendamento = new Agendamento(
                            clienteEscolhido,
                            servicoEscolhido,
                            data,
                            horario
                    );

                    sistema.adicionarAgendamento(agendamento);
                    break;

                case 4:
                    sistema.listarClientes();
                    break;

                case 5:
                    sistema.listarServicos();
                    break;

                case 6:
                    sistema.listarAgendamentos();
                    break;

                case 7:
                    sistema.cancelarAgendamento();
                    break;

                case 8:
                    System.out.print("Digite a data que deseja consultar: ");
                    String dataConsulta = scanner.nextLine();

                    sistema.consultarHorarios(dataConsulta);
                    break;

                case 9:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}