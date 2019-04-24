package dominio;

public class Policial extends Pessoa {
	private String dele;

	public Policial(Integer id, String nome, String email, String delegacia) {
		super(id, nome, email);
		this.dele = delegacia;
		
	}
	
	public String getDele() {
		return dele;
	}
	
	public void setDele(String dele) {
		this.dele = dele;		
	}
}