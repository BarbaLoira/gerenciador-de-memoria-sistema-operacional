package gerenciamentoMemoria;

public class Processo {

	private Integer computacao;
	private Integer alocado;
	private Integer visitado;

	Processo(Integer computacao, Integer alocado, Integer visitado) {
		this.computacao = computacao;
		this.alocado = alocado;
		this.visitado = visitado;
	}

	public Integer getComputacao() {
		return computacao;
	}

	public void setComputacao(Integer computacao) {
		this.computacao = computacao;
	}

	public Integer getAlocado() {
		return alocado;
	}

	public void setAlocado(Integer alocado) {
		this.alocado = alocado;
	}

	public Integer getVisitado() {
		return visitado;
	}

	public void setVisitado(Integer visitado) {
		this.visitado = visitado;
	}

}