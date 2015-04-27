package entity;

public class Jogador {

	private Pokemon pokemon[];
	private Item mochila[];
	
	public static final int INICIO =  -2;
	public static final int EQUIPAR = -1;
	
	private int currPokemon = INICIO;
	
	public Jogador(Pokemon pokemon[], Item mochila[]) {
		this.pokemon = pokemon;
		this.mochila = mochila;
	}
	
	public void printPokemon() {
		System.out.println("(Opcao)(Pokemon)");
		for (int i = 0; i < pokemon.length; i++) {
			System.out.println(i+": ");
		}
	}
	
	public void printItem() {
		System.out.println("(Opcao)(Item)");
		for (int i = 0; i < mochila.length; i++) {
			System.out.println(i+": ");
		}
	}
	
	public void printAtaques() {
		pokemon[currPokemon].printAtaques();
	}
	public int getPokemon() {
		return currPokemon;
	}
}
