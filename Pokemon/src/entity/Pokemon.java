package entity;

import event.Type.ElemType;

public class Pokemon {
	
	Ataque ataques[];
	String nome;
	ElemType tipo;
	
	
	int vida, ataque, defesa;
	int espAtaque, espDefesa;
	int velocidade;
	
	public void printAtaques() {
		System.out.println("(Opcao)(Ataque)");
		for (int i = 0; i < ataques.length; i++) {
			System.out.println(i+": "+ataques[i].print());
		}
	}
	
	public ElemType getTipo() {
		return this.tipo;
	}
	
	public int getAtaque(int index) {
		if (ataques[index].isEspecial())
			return this.espAtaque;
		else return this.ataque;
	}
	
	public int getDefesa(int index) {
		if (ataques[index].isEspecial())
			return this.espDefesa;
		else return this.defesa;
	}
}
