package sistemaHotel;

import java.util.ArrayList;
import java.util.List;

public class Hospede {

	private String nome; 
	private List<Reserva> historicoReservas;
	
	public Hospede(String nome) {
		super();
		this.nome = nome;
		this.historicoReservas = new ArrayList<>();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionarReserva(Reserva reserva) {
		historicoReservas.add(reserva);
	}
	
	public List<Reserva> getHistoricoReservas(){
		return historicoReservas;
	}
	

}
