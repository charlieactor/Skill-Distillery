package examples;

import java.util.List;

public class PrintDistantPlanets {
	public static void main(String[] args) {
		List<Planet> planets = PlanetUtilities.getPlanets();
		planets = PlanetUtilities.filterPlanets(planets, (p) -> p.getOrbit() < 200_000_000);
		for (Planet planet : planets) {
			System.out.println(planet);
		}
		
	}
}
