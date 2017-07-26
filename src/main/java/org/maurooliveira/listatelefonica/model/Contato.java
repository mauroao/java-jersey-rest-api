package org.maurooliveira.listatelefonica.model;

import java.util.Date;

public class Contato {
	
	  private int serial;
	  public int getserial() { return this.serial; }
	  public void setserial(int serial) { this.serial = serial; }

	  private String nome;
	  public String getnome() { return this.nome; }
	  public void setnome(String nome) { this.nome = nome; }

	  private String telefone;
	  public String gettelefone() { return this.telefone; }
	  public void settelefone(String telefone) { this.telefone = telefone; }

	  private Date data;
	  public Date getdata() { return this.data; }
	  public void setdata(Date data) { this.data = data; }

	  private Operadora operadora;
	  public Operadora getoperadora() { return this.operadora; }
	  public void setoperadora(Operadora operadora) { this.operadora = operadora; }
	  
	  public Contato() {}
	  
	  public Contato(int serial, String nome, String telefone, Date data, Operadora operadora) {
		  this.serial = serial;
		  this.nome = nome;
		  this.telefone = telefone;
		  this.data = data;
		  this.operadora = operadora;
	  }
}
