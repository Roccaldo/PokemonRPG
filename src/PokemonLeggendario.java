import java.util.ArrayList;
public class PokemonLeggendario {
	private String nome;
	private String elemento;
	private String abilitaSpeciale;
	private int livelloPotenza;
	private final TipiPokemonEnum tipoPokemon;

	public PokemonLeggendario(String nome, String elemento, String abilitaSpeciale, int livelloPotenza, TipiPokemonEnum tipoPokemon) {
		this.nome = nome;
		this.elemento = elemento;
		this.abilitaSpeciale = abilitaSpeciale;
		this.livelloPotenza = livelloPotenza;
		this.tipoPokemon = tipoPokemon;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getElemento() {
		return elemento;
	}

	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	public String getAbilitaSpeciale() {
		return abilitaSpeciale;
	}

	public void setAbilitaSpeciale(String abilitaSpeciale) {
		this.abilitaSpeciale = abilitaSpeciale;
	}

	public int getLivelloPotenza() {
		return livelloPotenza;
	}

	public void setLivelloPotenza(int livelloPotenza) {
		this.livelloPotenza = livelloPotenza;
	}

	public TipiPokemonEnum getTipoPokemon() {
		return tipoPokemon;
	}
	public  void dettagliBoss(PokemonLeggendario pokemon){
		System.out.println("Nome: " + pokemon.getNome() +
				"--> Tipo: " + pokemon.getTipoPokemon() +
				"--> Abilità speciale: " + pokemon.getAbilitaSpeciale() +
				"--> Livello potenza: " + pokemon.getLivelloPotenza() +
				"--> Tipo Pokemon: " + pokemon.getTipoPokemon());
	}
	public void sfidaPokemonLeggendario(SquadraPokemon squadraPokemon){
		System.out.println("E' apparso " + getNome()  + " preparati a combattere!");
		if (squadraPokemon.potenzaSquadra() > getLivelloPotenza()) {
			System.out.println("hai vinto! congratulations");
		} else {
			System.out.println("Hai perso, mi dispiace");
		}
	}

	@Override
	public String toString() {
		return "PokemonLeggendario{" +
				"nome='" + nome + '\'' +
				", elemento='" + elemento + '\'' +
				", abilitaSpeciale='" + abilitaSpeciale + '\'' +
				", livelloPotenza=" + livelloPotenza +
				", tipoPokemon=" + tipoPokemon +
				'}';
	}
}
