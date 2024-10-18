package sistemaHotel;

import java.util.List;
import java.util.Scanner;

public class SistemaHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        	System.out.println("Hotel Balance...");
        	System.out.println("");
        	
        while (true) {
            System.out.println("1. Cadastrar Quarto");
            System.out.println("2. Cadastrar Reserva");
            System.out.println("3. Check-in");
            System.out.println("4. Check-out");
            System.out.println("5. Relatório de Ocupação");
            System.out.println("6. Histórico de Reservas");
            System.out.println("7. Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();
            System.out.println();
            switch (opcao) {
                case "1":
                    System.out.print("Número do quarto: ");
                    String numero = scanner.nextLine();
                    System.out.println("Tipo do quarto:");
                    System.out.println("1. Solteiro");
                    System.out.println("2. Casal");
                    System.out.println("3. Suíte");
                    System.out.print("Escolha uma opção: ");
                    int tipoOpcao = Integer.parseInt(scanner.nextLine());
                    String tipo = "";
                    switch (tipoOpcao) {
                        case 1:
                            tipo = "Solteiro";
                            break;
                        case 2:
                            tipo = "Casal";
                            break;
                        case 3:
                            tipo = "Suíte";
                            break;
                        default:
                            System.out.println("Tipo inválido! Quarto não cadastrado.");
                            continue;
                    }
                    System.out.print("Preço diário: ");
                    double preco = Double.parseDouble(scanner.nextLine());
                    hotel.cadastrarQuarto(numero, tipo, preco);
                    System.out.println();
                    break;

                case "2":
                    System.out.print("Nome do hóspede: ");
                    String nomeHospede = scanner.nextLine();
                    System.out.print("Data de check-in: ");
                    String checkIn = scanner.nextLine();
                    System.out.print("Data de check-out: ");
                    String checkOut = scanner.nextLine();
                    System.out.print("Tipo de quarto reservado: ");
                    String tipoQuarto = scanner.nextLine();
                    System.out.print("Número do quarto que deseja reservar: ");
                    int numQuartos = Integer.parseInt(scanner.nextLine());
                    hotel.cadastrarReserva(nomeHospede, checkIn, checkOut, tipoQuarto, numQuartos);
                    System.out.println();
                    break;
                    

                case "3":
                    System.out.print("Número do quarto para check-in: ");
                    String numeroQuartoCheckIn = scanner.nextLine();
                    System.out.println(hotel.checkIn(numeroQuartoCheckIn));
                    System.out.println();
                    break;

                case "4":
                    System.out.print("Número do quarto para check-out: ");
                    String numeroQuartoCheckOut = scanner.nextLine();
                    System.out.println(hotel.checkIn(numeroQuartoCheckOut));
                    System.out.println();
                    break;

                case "5":
                    System.out.println("Relatório de Ocupação:");
                    List<String> ocupacao = hotel.relatorioOcupacao();
                    ocupacao.forEach(System.out::println);
                    System.out.println();
                    break;

                case "6":
                    System.out.println("Histórico de Reservas:");
                    List<String> historico = hotel.historicoReserva();
                    historico.forEach(System.out::println);
                    System.out.println();
                    break;

                case "7":
                	System.out.println("Sistema finalizado com sucesso!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    System.out.println();
            }
        }
    }
}