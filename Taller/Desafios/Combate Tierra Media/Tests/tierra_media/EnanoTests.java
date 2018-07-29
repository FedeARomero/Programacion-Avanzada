package tierra_media;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EnanoTests {

	private Personaje enano;

	@Before
	public void inicio() {
		enano = new Enano();
	}

	@Test
	public void testEnanoContraElfo() {
		Personaje elfo = new Elfo();
		
		Assert.assertEquals(100, enano.salud());

		elfo.atacar(enano); /* 0 ataques recibidos */
		enano.atacar(elfo); /* 0 ataques dados */

		Assert.assertEquals(95, enano.salud());
		Assert.assertEquals(90, elfo.salud());

		elfo.atacar(enano); /* 1 ataques recibidos */
		enano.atacar(elfo); /* 1 ataques dados */

		Assert.assertEquals(88, enano.salud());
		Assert.assertEquals(78, elfo.salud());

		elfo.atacar(enano); /* 2 ataques recibidos */
		enano.atacar(elfo); /* 2 ataques dados */

		Assert.assertEquals(79, enano.salud());
		Assert.assertEquals(64, elfo.salud());

		elfo.atacar(enano); /* 3 ataques recibidos */
		enano.atacar(elfo); /* 3 ataques dados */

		Assert.assertEquals(66, enano.salud());
		Assert.assertEquals(48, elfo.salud());

		elfo.atacar(enano); /* 4 ataques recibidos */
		enano.atacar(elfo); /* 4 ataques dados */

		Assert.assertEquals(45, enano.salud());
		Assert.assertEquals(30, elfo.salud());

		elfo.atacar(enano); /* 5 ataques recibidos */
		enano.atacar(elfo); /* 5 ataques dados */

		Assert.assertEquals(8, enano.salud());
		Assert.assertEquals(10, elfo.salud());

		elfo.atacar(enano); /* 6 ataques recibidos */
		enano.atacar(elfo); /* 6 ataques dados */

		Assert.assertEquals(0, enano.salud());
		Assert.assertEquals(0, elfo.salud());
	}

	@Test
	public void testEnanoContraGoblin() {
		Personaje goblin = new Goblin();

		Assert.assertEquals(100, enano.salud());

		/* 0 ataques dados */
		for (int i = 0; i < 10; i++)
			enano.atacar(goblin); 
		goblin.atacar(enano);

		Assert.assertEquals(72, goblin.salud());
		Assert.assertEquals(97, enano.salud());

		/* 10 ataques dados */
		for (int i = 0; i <= 10; i++)
			enano.atacar(goblin); 
		goblin.atacar(enano);

		Assert.assertEquals(24, goblin.salud());
		Assert.assertEquals(94, enano.salud());
	
		/* 20 ataques daos */
		for (int i = 0; i <= 10; i++)
			enano.atacar(goblin); 
		goblin.atacar(enano);

		Assert.assertEquals(0, goblin.salud());
		Assert.assertEquals(91, enano.salud());
	}

	@Test
	public void testEnanoContraHumano() {
		Personaje humano = new Humano();

		Assert.assertEquals(100, enano.salud());

		humano.atacar(enano); /* fuerza 10 */
		enano.atacar(humano); /* 0 ataques dados */

		Assert.assertEquals(90, enano.salud());
		Assert.assertEquals(90, humano.salud());

		humano.atacar(enano); /* fuerza 8 */
		enano.atacar(humano); /* 1 ataques dados */

		Assert.assertEquals(82, enano.salud());
		Assert.assertEquals(78, humano.salud());

		humano.atacar(enano); /* fuerza 6 */
		enano.atacar(humano); /* 2 ataques dados */

		Assert.assertEquals(76, enano.salud());
		Assert.assertEquals(64, humano.salud());

		humano.atacar(enano); /* fuerza 4 */
		enano.atacar(humano); /* 3 ataques dados */

		Assert.assertEquals(72, enano.salud());
		Assert.assertEquals(48, humano.salud());

		humano.atacar(enano); /* fuerza 2 */
		enano.atacar(humano); /* 4 ataques dados */

		Assert.assertEquals(70, enano.salud());
		Assert.assertEquals(30, humano.salud());

		humano.atacar(enano); /* fuerza 0 */
		enano.atacar(humano); /* 5 ataques dados */

		Assert.assertEquals(70, enano.salud());
		Assert.assertEquals(10, humano.salud());

		humano.descansar();
		humano.atacar(enano); /* fuerza 10 */
		enano.atacar(humano); /* 6 ataques dados */

		Assert.assertEquals(60, enano.salud());
		Assert.assertEquals(0, humano.salud());
	}
	
	@Test
	public void testEnanoContraOrco() {
		Personaje orco = new Orco();

		Assert.assertEquals(100, enano.salud());

		enano.atacar(orco); /* 0 ataques dados */
		orco.atacar(enano);

		Assert.assertEquals(98, orco.salud());
		Assert.assertEquals(85, enano.salud());

		enano.atacar(orco); /* 1 ataques dados */
		orco.atacar(enano);

		Assert.assertEquals(95, orco.salud());
		Assert.assertEquals(70, enano.salud());

		enano.atacar(orco); /* 2 ataques dados */
		orco.atacar(enano);

		Assert.assertEquals(92, orco.salud());
		Assert.assertEquals(55, enano.salud());

		enano.atacar(orco); /* 3 ataques dados */
		orco.atacar(enano);

		Assert.assertEquals(88, orco.salud());
		Assert.assertEquals(40, enano.salud());

		enano.atacar(orco); /* 4 ataques dados */
		orco.atacar(enano);

		Assert.assertEquals(84, orco.salud());
		Assert.assertEquals(25, enano.salud());

		enano.atacar(orco); /* 5 ataques dados */
		orco.atacar(enano);

		Assert.assertEquals(79, orco.salud());
		Assert.assertEquals(10, enano.salud());

		enano.atacar(orco); /* 6 ataques dados */
		orco.atacar(enano);

		Assert.assertEquals(74, orco.salud());
		Assert.assertEquals(0, enano.salud());
	}
	
	@Test
	public void testEnanoContraTroll() {
		Personaje troll = new Troll();

		Assert.assertEquals(100, enano.salud());

		enano.atacar(troll); /* 0 ataques dados */
		troll.atacar(enano); /* 0 ataques dados */
		troll.atacar(enano); /* 1 ataques dados */
		troll.atacar(enano); /* 2 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, enano.salud());

		enano.atacar(troll); /* 1 ataques dados */
		troll.atacar(enano); /* 3 ataques dados */
		troll.atacar(enano); /* 4 ataques dados */
		troll.atacar(enano); /* 5 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, enano.salud());

		enano.atacar(troll); /* 2 ataques dados */
		troll.atacar(enano); /* 6 ataques dados */
		troll.atacar(enano); /* 7 ataques dados */
		troll.atacar(enano); /* 8 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(10, enano.salud());
		
		troll.descansar();
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		troll.atacar(enano);
		
		Assert.assertEquals(10, enano.salud());
	}
}
