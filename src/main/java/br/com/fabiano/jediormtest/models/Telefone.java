package br.com.fabiano.jediormtest.models;

import jedi.db.models.CharField;
import jedi.db.models.ForeignKeyField;
import jedi.db.models.Manager;
import jedi.db.models.Model;
import jedi.db.models.Table;

@Table(name = "telefones", engine = "InnoDB", charset = "utf8", comment = "Table of telefones")
public class Telefone extends Model {

	private static final long serialVersionUID = -862598038929889258L;
	
	@CharField(max_length=2)
	private String ddd;
	
	@CharField(max_length=10)
	private String numero;
	
	@ForeignKeyField
	private Cliente cliente;

	public static Manager objects = new Manager(Telefone.class);
	
	public Telefone() {
	}

	public Telefone(String ddd, String numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}

	public Telefone(String ddd, String numero, Cliente cliente) {
		this(ddd, numero);
		this.cliente = cliente;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + ", cliente="
				+ cliente + "]";
	}

}
