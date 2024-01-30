import java.util.ArrayList;

public class SquadraPokemon {
	private ArrayList<Pokemon> pokemonList = new ArrayList<>();


	public ArrayList<Pokemon> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(ArrayList<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}

	public void aggiungiPokemonAllaSquadra(Pokemon pokemon){

		if (pokemon.getNome() == null){
			throw new NullPointerException("inserire correttamente un nome");
		}
		if (pokemon.getElemento() == null){
			throw new NullPointerException("il tipo inserito non è valido");
		}
		if (pokemon.getLivelloPotenza() <= 0){
			throw new NullPointerException("livello di potenza negativo");
		}
		this.pokemonList.add(pokemon);
	}
	public void liberaPokemon(Pokemon pokemon){
		pokemonList.remove(pokemon);
	}
	public  void visualizzaSquadra(){
		for (Pokemon pokemon: pokemonList) {
			System.out.println("Visualizza Squadra---------- Nome: " + pokemon.getNome() +
					"--> Tipo: " + pokemon.getElemento() +
					"--> Abilità speciale: " + pokemon.getAbilitaSpeciale() +
					"--> Livello potenza: " + pokemon.getLivelloPotenza() +
					"--> Tipo Pokemon: " + pokemon.getTipoPokemon());
		}
	}
	public int potenzaSquadra() {
		int result = 0;
		for (Pokemon pokemon : getPokemonList()) {
			 result += pokemon.getLivelloPotenza();
		}
		return result;
	}

	@Override
	public String toString() {
		return "Pokedex{" +
				"pokedex=" + pokemonList +
				'}';
	}
}
