package vendas;

public class ClienteVarejo {
	
	private String nomeCompleto;
	private String cpf;
	private String dataNascimento;
	private String cep;
	private String endereço;
	private int numero;
	private String bairro;
	private String telefone;
	private String email;
	private boolean ativado;
	private boolean desativado;
	
	
	public ClienteVarejo(String nomeCompleto, String cpf, String dataNascimento, String cep, String endereço,
			int numero, String bairro, String telefone, String email) {
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.cep = cep;
		this.endereço = endereço;
		this.numero = numero;
		this.bairro = bairro;
		this.telefone = telefone;
		this.email = email;
	}
	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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
	
	public boolean isAtivado() {
		return ativado;
	}
	public void setAtivado(boolean ativado) {
		this.ativado = ativado;
	}

	public boolean isDesativado() {
		return desativado;
	}
	public void setDesativado(boolean desativado) {
		this.desativado = desativado;
	}


	public void dadosVarejo() {
		System.out.println("CLIENTE VAREJO: ");
		System.out.println("\nNome completo: " + this.getNomeCompleto());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Data de Nascimento: " + this.getDataNascimento());
		System.out.println("CEP: " + this.getCep());
		System.out.println("Endereço: " + this.getEndereço());
		System.out.println("Numero: " + this.getNumero());
		System.out.println("Bairro: " + this.getBairro());
		System.out.println("Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
	}
	
	public void ativar() {
		this.isAtivado();
	}
	
	public void desativar() {
		this.isDesativado();
	}

}
