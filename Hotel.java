package sistemaHotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
	
	private List<Quarto> quartos;
	private List<Reserva> reservas; 
	
	public Hotel(){
		quartos = new ArrayList<>();
		reservas = new ArrayList<>();
	}
	
	public void cadastrarQuarto(String numero, String tipo, double preco) {
        Quarto novoQuarto = new Quarto(numero, tipo, preco, false);
        quartos.add(novoQuarto);
    }
	
	public void cadastrarReserva(String nomeHospede, String checkIn, String checkOut, String tipoQuarto, int numQuartos) {
		Hospede hospede = new Hospede(nomeHospede);
		Reserva novaReserva = new Reserva(hospede, checkIn, checkOut, tipoQuarto, numQuartos);
		reservas.add(novaReserva);
		hospede.adicionarReserva(novaReserva);
		}
	
	public String checkIn(String numeroQuarto) {
		for (Quarto quarto : quartos) {
			if(quarto.getNumero().equals(numeroQuarto)) {
				quarto.setDisponivel(false);
				return "Check-in realizado no quarto = " + numeroQuarto + ".";
			}
		}
		return "Quarto não encontrado"; 
	}
	
	
	public List<String> relatorioOcupacao(){
		List<String> ocupacao = new ArrayList<>();
		for (Quarto quarto : quartos) {
			if (!quarto.isDisponivel()) {
				ocupacao.add("Numero do quarto: " +quarto.getNumero()+ ", Tipo do quarto: " +quarto.getTipo());
			}
		}
		return ocupacao;
	}
	
	public List<String> historicoReserva(){
		List<String> historico = new ArrayList<>();
		for (Reserva reserva : reservas) {
			historico.add("Hóspede: " +reserva.getHospede().getNome()+
						  ", Data de Reserva: " +reserva.getTipoQuarto()+
						  ", N° de Quartos: " +reserva.getNumQuartos()+
						  ", Tipo de Quarto: " +reserva.getCheckin());
		}
		return historico;
	}
	
}
