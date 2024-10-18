package sistemaHotel;

public class Reserva {

	private Hospede hospede; 
	private String checkIn; 
	private String checkOut;
	private String tipoQuarto; 
	private int numQuartos;
	
	public Reserva(Hospede hospede, String checkIn, String checkOut, String tipoQuarto, int numQuartos) {
		super();
		this.hospede = hospede;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.tipoQuarto = tipoQuarto;
		this.numQuartos = numQuartos;
	}
	
	public Hospede getHospede() {
		return hospede;
	}
	
	public String getCheckOut() {
		return checkOut;
	}
	
	public String getCheckin() {
		return tipoQuarto;
	}
	
	public String getTipoQuarto() {
		return checkIn;
	}
	
	public int getNumQuartos() {
		return numQuartos;
	}
}
