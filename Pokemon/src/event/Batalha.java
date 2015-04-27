package event;

import java.util.Scanner;

import entity.Jogador;
import eventHandler.Event;

public class Batalha extends Event {

	Jogador a, b;
	
	public Batalha(Jogador a, Jogador b) {
		super(0);
		this.a = a;
		this.b = b;
	}

	@Override
	public void action() {
		
		Scanner scan = new Scanner(System.in);
		
		if(a.getPokemon() == Jogador.INICIO) {
			System.out.println("Jogador 1, eh a sua vez! Escolha um pokemon:");
			
		}
		
		scan.close();
	}

	@Override
	public String description() {
		
		return "Batalha.java: Fim do turno!";
	}
}
