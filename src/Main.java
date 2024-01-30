public class Main {
	public static void main(String[] args) {
		//creazione del pokedex che contiene i pokemon
		Pokedex pokedex = new Pokedex();

		//creazione dei pokemon (mostri)
		Pokemon blastoise = new Pokemon("Blastoise", "Acqua", "Idropulsar", 500, TipiPokemonEnum.MEGAEVOLUTO);
		Pokemon venusaur = new Pokemon("Venusaur", "Erba", "FoglieLama", 600, TipiPokemonEnum.SHINY);
		Pokemon pikachu = new Pokemon("Pikachu", "Elettro", "Fulmine", 350, TipiPokemonEnum.NORMALE);
		Pokemon serperior = new Pokemon("Serperior", "Erba", "TagliaLegna", 600, TipiPokemonEnum.SHINY);

		//creazione lista boss disponibili
		ListaBoss listaBoss = new ListaBoss();

		//creazione dei boss
		PokemonLeggendario charizard = new PokemonLeggendario("Charizard", "Fuoco", "LanciaFiamme", 800, TipiPokemonEnum.SHINY);
		PokemonLeggendario mewTwo = new PokemonLeggendario("MewTwo", "Psico", "Telecinesi", 1500, TipiPokemonEnum.MEGAEVOLUTO);
		PokemonLeggendario gyrados = new PokemonLeggendario("Gyrados", "Acqua", "Idropompa", 1200, TipiPokemonEnum.MEGAEVOLUTO);

		//aggiungi boss alla lista
		listaBoss.aggiungiBoss(charizard);
		listaBoss.aggiungiBoss(mewTwo);
		listaBoss.aggiungiBoss(gyrados);

		//Creazione Squdra
		SquadraPokemon squadraPokemon = new SquadraPokemon();

		//aggiungi pokemon alla squadra
		squadraPokemon.aggiungiPokemonAllaSquadra(blastoise);
		squadraPokemon.aggiungiPokemonAllaSquadra(venusaur);
		squadraPokemon.aggiungiPokemonAllaSquadra(pikachu);
		squadraPokemon.aggiungiPokemonAllaSquadra(serperior);

		//aggiungi pokemon alPokedex
		pokedex.aggiungiPokemonNelPokedex(blastoise);
		pokedex.aggiungiPokemonNelPokedex(venusaur);
		pokedex.aggiungiPokemonNelPokedex(pikachu);
		pokedex.aggiungiPokemonNelPokedex(serperior);

		//visualizza pokedex
		pokedex.visualizzaPokedex();

		//visualizza singolo pokemon
		pokedex.visualizzaPokemon(blastoise);

		//visualizza squadra
		squadraPokemon.visualizzaSquadra();

		//sfida un boss
		mewTwo.sfidaPokemonLeggendario(squadraPokemon);

		//visualizza boss disponibili
		listaBoss.visualizzaBossDisponibili();

		//dettagli boss
		listaBoss.dettagliBoss(mewTwo);

		//cerca pokemon per nome
		pokedex.cercaPokemonPerNome("blastoise");

		//cerca pokemon per tipo
		pokedex.cercaPokemonPerElemento("erba"); //output: due pokemon di tipo erba
	}
}