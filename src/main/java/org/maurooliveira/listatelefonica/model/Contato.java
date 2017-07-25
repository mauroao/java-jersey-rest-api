package org.maurooliveira.listatelefonica.model;

import java.util.Date;

public class Contato {
	
	  private int serial;
	  public int getSerial() { return this.serial; }
	  public void setSerial(int serial) { this.serial = serial; }

	  private String nome;
	  public String getNome() { return this.nome; }
	  public void setNome(String nome) { this.nome = nome; }

	  private String telefone;
	  public String getTelefone() { return this.telefone; }
	  public void setTelefone(String telefone) { this.telefone = telefone; }

	  private Date data;
	  public Date getdata() { return this.data; }
	  public void setdata(Date data) { this.data = data; }

	  private Operadora operadora;
	  public Operadora getOperadora() { return this.operadora; }
	  public void setOperadora(Operadora operadora) { this.operadora = operadora; }
	  
	  public Contato() {}
	  
	  public Contato(int serial, String nome, String telefone, Date data, Operadora operadora) {
		  this.serial = serial;
		  this.nome = nome;
		  this.telefone = telefone;
		  this.data = data;
		  this.operadora = operadora;
	  }
}
