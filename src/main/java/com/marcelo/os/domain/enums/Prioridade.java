package com.marcelo.os.domain.enums;

public enum Prioridade {

	BAIXA(0, "Baixa"), 
	MEDIA(1, "Média"),
	ALTA(2, "Alta");
	
	private Integer cod;
	private String descricao;
	
	private Prioridade(Integer cod, String descricao) {
		
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public Integer getCod() {
		
		return this.cod;
	}
	
	public String getDescricao() {
		
		return this.descricao;
	}
	
	public static Prioridade toEnum(Integer cod) {
		
		if(cod == null) {
			
			return null;
		}
		
		for(Prioridade x: Prioridade.values()) {
			
			if(x.getCod() == cod) {
				
				return x;
			}
		}
		
		throw new IllegalArgumentException("Prioridade inválida! " + cod);
	}
}
