public enum TipiPokemonEnum {
	MEGAEVOLUTO("MegaEvoluto"),
	SHINY("Shiny"),
	NORMALE("Normale");

	private final String tipoPokemon;

	TipiPokemonEnum(String tipoPokemon) {
		this.tipoPokemon = tipoPokemon;
	}

	public String getTipoPokemon() {
		return tipoPokemon;
	}
}

