package vendas;

public class ClienteAtacado {
	
	private String razaoSocial;
	private String cnpj;
	private String cep;
	private String endereço;
	private int numero;
	private String bairro;
	private String telefone;
	private String email;
	private boolean ativo;
	
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	public void dadosAtacado() {
		System.out.println("CLIENTE ATACADO: ");
		System.out.println("\nRazao Social: " + this.getRazaoSocial());
		System.out.println("CNPJ: " + this.getCnpj());
		System.out.println("CEP: " + this.getCep());
		System.out.println("Endereço: " + this.getEndereço());
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Bairro: " + this.getBairro());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Status do cliente: " + isAtivo());
	}
	
}
