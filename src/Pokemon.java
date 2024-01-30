public class Pokemon {
	private String nome;
	private String elemento;
	private String abilitaSpeciale;
	private int livelloPotenza;
	private final TipiPokemonEnum tipoPokemon;
	public Pokemon(String nome, String elemento, String abilitaSpeciale, int livelloPotenza, TipiPokemonEnum tipoPokemon) {
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


	@Override
	public String toString() {
		return "Pokemon{" +
				"nome='" + nome + '\'' +
				", tipo='" + elemento + '\'' +
				", abilitaSpeciale='" + abilitaSpeciale + '\'' +
				", livelloPotenza=" + livelloPotenza +
				'}';
	}
}