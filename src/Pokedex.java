import java.util.ArrayList;
import java.util.Iterator;

public class Pokedex {
	ArrayList<Pokemon> pokedex = new ArrayList<>();

	public ArrayList<Pokemon> getPokedex() {
		return pokedex;
	}

	public void setPokedex(ArrayList<Pokemon> pokedex) {
		this.pokedex = pokedex;
	}

	public void aggiungiPokemonNelPokedex(Pokemon pokemon) {
		pokedex.add(pokemon);
	}
	public  void visualizzaPokemon(Pokemon pokemon){
		System.out.println("Visualizza Pokemon---------- Nome: " + pokemon.getNome() +
				"--> Tipo: " + pokemon.getElemento() +
				"--> Abilità speciale: " + pokemon.getAbilitaSpeciale() +
				"--> Livello potenza: " + pokemon.getLivelloPotenza() +
				"--> Tipo Pokemon: " + pokemon.getTipoPokemon());
	}
	public  void visualizzaPokedex(){
		for (Pokemon pokemon: pokedex) {
			System.out.println("Visualizza Pokedex---------- Nome: " + pokemon.getNome() +
					"--> Tipo: " + pokemon.getElemento() +
					"--> Abilità speciale: " + pokemon.getAbilitaSpeciale() +
					"--> Livello potenza: " + pokemon.getLivelloPotenza() +
					"--> Tipo Pokemon: " + pokemon.getTipoPokemon());
		}
	}

	public void cercaPokemonPerNome(String nome){
		for (Pokemon pokemon : pokedex) {
			if (pokemon.getNome().equalsIgnoreCase(nome)) {
				System.out.println(" il " + pokemon.getNome() + " è presente nel pokedex");
			}
		}
	}
	public void cercaPokemonPerElemento(String tipo){
		for (Pokemon pokemon : pokedex) {
			if (pokemon.getElemento().equalsIgnoreCase(tipo)) {
				System.out.println(" il " + pokemon.getNome() + " è presente nel pokedex");
			}
		}
	}

	@Override
	public String toString() {
		return "Pokedex{" +
				"pokedex=" + pokedex +
				'}';
	}
}
