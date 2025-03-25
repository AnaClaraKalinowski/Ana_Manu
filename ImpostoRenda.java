package Exercicios;

public class ImpostoRenda {
	
	

	private String nome;
	private String cpf;
	private String uf;
	private int rendaA;

	public ImpostoRenda(String nome, String cpf, String uf, int rendaA) {
		setNome(nome);
		setCpf(cpf);
		setUf(uf);
		setRendaA(rendaA);
		
	}
	
	
	public double calcularImposto() {
		if(rendaA <= 4000) {
			return 0;
		}
		else if(rendaA >=4001 && rendaA <= 9000) {
			return rendaA*0.058;
		}
		else if(rendaA >= 9001 && rendaA <=25000) {
			return rendaA * 0.15;
		}
		else if(rendaA >= 25001 && rendaA <=35000) {
			return rendaA * 0.275;
		}
		return rendaA * 0.30;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isEmpty() || nome.isBlank()) {
		}
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf == null || cpf.isEmpty() || cpf.isBlank()) {
		}
		this.cpf = cpf;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getRendaA() {
		return rendaA;
	}

	public void setRendaA(int rendaA) {
		if (rendaA <= 0) {
			System.out.println("Salário Inválido");
		} else {
			this.rendaA = rendaA;
		}
	}

}
