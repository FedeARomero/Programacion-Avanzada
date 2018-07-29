package tierra_media;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ElfoTest {

	private Personaje elfo;

	@Before
	public void inicio() {
		elfo = new Elfo();
	}

	@Test
	public void testElfoContraEnano() {
		Personaje enano = new Enano();
		
		Assert.assertEquals(100, elfo.salud());

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
	public void testElfoContraGoblin() {
		Personaje goblin = new Goblin();

		Assert.assertEquals(100, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 0 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(95, goblin.salud());
		Assert.assertEquals(97, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 1 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(88, goblin.salud());
		Assert.assertEquals(94, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 2 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(79, goblin.salud());
		Assert.assertEquals(91, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 3 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(66, goblin.salud());
		Assert.assertEquals(88, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 4 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(45, goblin.salud());
		Assert.assertEquals(85, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 5 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(8, goblin.salud());
		Assert.assertEquals(82, elfo.salud());

		for (int i = 0; i < 10; i++)
			elfo.atacar(goblin); /* 6 ataques recibidos */
		goblin.atacar(elfo);

		Assert.assertEquals(0, goblin.salud());
		Assert.assertEquals(79, elfo.salud());
	}

	@Test
	public void testElfoContraHumano() {
		Personaje humano = new Humano();

		Assert.assertEquals(100, elfo.salud());

		humano.atacar(elfo); /* fuerza 10 */
		elfo.atacar(humano); /* 1 ataques recibidos */

		Assert.assertEquals(90, elfo.salud());
		Assert.assertEquals(93, humano.salud());

		humano.atacar(elfo); /* fuerza 8 */
		elfo.atacar(humano); /* 2 ataques recibidos */

		Assert.assertEquals(82, elfo.salud());
		Assert.assertEquals(84, humano.salud());

		humano.atacar(elfo); /* fuerza 6 */
		elfo.atacar(humano); /* 3 ataques recibidos */

		Assert.assertEquals(76, elfo.salud());
		Assert.assertEquals(71, humano.salud());

		humano.atacar(elfo); /* fuerza 4 */
		elfo.atacar(humano); /* 4 ataques recibidos */

		Assert.assertEquals(72, elfo.salud());
		Assert.assertEquals(50, humano.salud());

		humano.atacar(elfo); /* fuerza 2 */
		elfo.atacar(humano); /* 5 ataques recibidos */

		Assert.assertEquals(70, elfo.salud());
		Assert.assertEquals(13, humano.salud());

		humano.atacar(elfo); /* fuerza 0 */
		elfo.atacar(humano); /* 6 ataques recibidos */

		Assert.assertEquals(70, elfo.salud());
		Assert.assertEquals(0, humano.salud());

		humano.descansar();
		humano.atacar(elfo); /* fuerza 10 */
		elfo.atacar(humano); /* 7 ataques recibidos */

		Assert.assertEquals(60, elfo.salud());
		Assert.assertEquals(0, humano.salud());
	}
	
	@Test
	public void testElfoContraOrco() {
		Personaje orco = new Orco();

		Assert.assertEquals(100, elfo.salud());

		elfo.atacar(orco); /* 0 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(99, orco.salud());
		Assert.assertEquals(85, elfo.salud());

		elfo.atacar(orco); /* 1 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(98, orco.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(orco); /* 2 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(96, orco.salud());
		Assert.assertEquals(55, elfo.salud());

		elfo.atacar(orco); /* 3 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(93, orco.salud());
		Assert.assertEquals(40, elfo.salud());

		elfo.atacar(orco); /* 4 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(88, orco.salud());
		Assert.assertEquals(25, elfo.salud());

		elfo.atacar(orco); /* 5 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(79, orco.salud());
		Assert.assertEquals(10, elfo.salud());

		elfo.atacar(orco); /* 6 ataques recibidos */
		orco.atacar(elfo);

		Assert.assertEquals(62, orco.salud());
		Assert.assertEquals(0, elfo.salud());
	}
	
	@Test
	public void testElfoContraTroll() {
		Personaje troll = new Troll();

		Assert.assertEquals(100, elfo.salud());

		elfo.atacar(troll); /* 0 ataques recibidos */
		troll.atacar(elfo); /* 0 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(100, elfo.salud());

		elfo.atacar(troll); /* 1 ataques recibidos */
		troll.atacar(elfo); /* 1 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(100, elfo.salud());

		elfo.atacar(troll); /* 2 ataques recibidos */
		troll.atacar(elfo); /* 2 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(troll); /* 3 ataques recibidos */
		troll.atacar(elfo); /* 3 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(troll); /* 4 ataques recibidos */
		troll.atacar(elfo); /* 4 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, elfo.salud());

		elfo.atacar(troll); /* 5 ataques recibidos */
		troll.atacar(elfo); /* 5 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, elfo.salud());

		elfo.atacar(troll); /* 6 ataques recibidos */
		troll.atacar(elfo); /* 6 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, elfo.salud());
		
		elfo.atacar(troll); /* 7 ataques recibidos */
		troll.atacar(elfo); /* 7 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, elfo.salud());
		
		elfo.atacar(troll); /* 8 ataques recibidos */
		troll.atacar(elfo); /* 8 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(10, elfo.salud());
		
		troll.descansar();
		troll.atacar(elfo);
		troll.atacar(elfo);
		troll.atacar(elfo);
		
		Assert.assertEquals(10, elfo.salud());
	}
}
