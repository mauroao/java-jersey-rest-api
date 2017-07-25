package org.maurooliveira.listatelefonica.model;

public class Operadora {
	
	  private String nome;
	  public String getnome() { return this.nome; }
	  public void setnome(String nome) { this.nome = nome; }

	  private int codigo;
	  public int getcodigo() { return this.codigo; }
	  public void setcodigo(int codigo) { this.codigo = codigo; }
	  
	  private String categoria;
	  public String getcategoria() { return this.categoria; }
	  public void setcategoria(String categoria) { this.categoria = categoria; }

	  private double preco;
	  public double getpreco() { return this.preco; }
	  public void setpreco(double preco) { this.preco = preco; }
	  
	  public Operadora() {}
	  
	  public Operadora(String nome, int codigo, String categoria, double preco) {
		  this.categoria = categoria;
		  this.preco = preco;
		  this.codigo = codigo;
		  this.nome = nome;
	  }
}
