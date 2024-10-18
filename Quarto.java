package sistemaHotel;

public class Quarto {
	
	private String numero; 
	private String tipo; 
	private double preco; 
	private boolean disponivel;
	
	public Quarto(String numero, String tipo, double preco, boolean disponivel) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.preco = preco;
		this.disponivel = disponivel;
	}

	 public String getNumero() {
	        return numero;
	    }

	    public boolean isDisponivel() {
	        return disponivel;
	    }

	    public void setDisponivel(boolean disponivel) {
	        this.disponivel = disponivel;
	    }

	    public String getTipo() {
	        return tipo;
	    }
	
}
