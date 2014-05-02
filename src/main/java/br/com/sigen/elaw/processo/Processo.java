package br.com.sigen.elaw.processo;

import java.io.Serializable;

public class Processo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String pastaProcesso;

	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPastaProcesso() {
		return pastaProcesso;
	}

	public void setPastaProcesso(String pastaProcesso) {
		this.pastaProcesso = pastaProcesso;
	}

}
