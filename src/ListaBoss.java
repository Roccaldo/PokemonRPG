import java.util.ArrayList;
public class ListaBoss {
	ArrayList<PokemonLeggendario> pokemonLeggendari = new ArrayList<PokemonLeggendario>();

	public ArrayList<PokemonLeggendario> getPokemonLeggendari() {
		return pokemonLeggendari;
	}

	public void setPokemonLeggendari(ArrayList<PokemonLeggendario> pokemonLeggendari) {
		this.pokemonLeggendari = pokemonLeggendari;
	}

	public void aggiungiBoss(PokemonLeggendario pokemonLeggendario){
		pokemonLeggendari.add(pokemonLeggendario);
	}
	public  void dettagliBoss(PokemonLeggendario pokemonLeggendario){
		System.out.println("dettagli del BOSS---------- Nome: " + pokemonLeggendario.getNome() +
				"--> Tipo: " + pokemonLeggendario.getTipoPokemon() +
				"--> Abilità speciale: " + pokemonLeggendario.getAbilitaSpeciale() +
				"--> Livello potenza: " + pokemonLeggendario.getLivelloPotenza() +
				"--> Tipo Pokemon: " + pokemonLeggendario.getTipoPokemon());
	}

	public void visualizzaBossDisponibili(){
		for (PokemonLeggendario boss: pokemonLeggendari) {
			System.out.println("Boss disponibili: ------------ Nome: " + boss.getNome() +
					"--> Tipo: " + boss.getElemento() +
					"--> Abilità speciale: " + boss.getAbilitaSpeciale() +
					"--> Livello potenza: " + boss.getLivelloPotenza() +
					"--> Tipo Pokemon: " + boss.getTipoPokemon());
		}
	}

	@Override
	public String toString() {
		return "ListaBoss{" +
				"pokemonLeggendari=" + pokemonLeggendari +
				'}';
	}
}
