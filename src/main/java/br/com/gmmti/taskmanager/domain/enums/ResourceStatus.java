package br.com.gmmti.taskmanager.domain.enums;

public enum ResourceStatus {

	ATIVO(1, "Ativo"), INATIVO(2, "Inativo");

	private int cod;
	private String descricao;

	private ResourceStatus(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static ResourceStatus enums(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (ResourceStatus x : ResourceStatus.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido");
	}

}
