package entity;

import event.Type.ElemType;

public class Ataque {

	private String nome;
	private boolean especial;
	private int dano;
	private ElemType tipo;
	
	public String print() {
		String str = nome;
		if (especial) str += "(ESPECIAL)";
		return str;
	}
	
	public int getDano() {
		return this.dano;
	}
	
	public ElemType getTipo() {
		return this.tipo;
	}
	
	public boolean isEspecial() {
		return this.especial;
	}
}
