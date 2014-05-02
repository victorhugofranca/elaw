package br.com.sigen.elaw.cliente;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.sigen.elaw.entity.Municipio;
import br.com.sigen.elaw.entity.UF;

@XmlRootElement
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String codigo;
	private String nome;

	private UF uf;
	private Municipio municipio;

	private String pastaCliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPastaCliente() {
		return pastaCliente;
	}

	public void setPastaCliente(String pastaCliente) {
		this.pastaCliente = pastaCliente;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

}
