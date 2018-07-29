package tierra_media;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HumanoTest {

	private Personaje humano;
	
	@Before
	public void inicio() {
		humano = new Humano();
	}
	
	@Test
	public void testHumanoContraElfo() {
		Personaje elfo = new Elfo();

		Assert.assertEquals(100, humano.salud());

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
	public void testHumanoContraEnano() {
		Personaje enano = new Enano();

		Assert.assertEquals(100, humano.salud());

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
	public void testHumanoContraGoblin() {
		Personaje goblin = new Goblin();

		Assert.assertEquals(100, humano.salud());

		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano); 

		Assert.assertEquals(99, goblin.salud());
		Assert.assertEquals(97, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano); 

		humano.descansar();
		Assert.assertEquals(98, goblin.salud());
		Assert.assertEquals(94, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(97, goblin.salud());
		Assert.assertEquals(91, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(96, goblin.salud());
		Assert.assertEquals(88, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(95, goblin.salud());
		Assert.assertEquals(85, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(94, goblin.salud());
		Assert.assertEquals(82, humano.salud());

		humano.descansar();
		for (int i = 0; i < 10; i++)
			humano.atacar(goblin);
		goblin.atacar(humano);

		Assert.assertEquals(93, goblin.salud());
		Assert.assertEquals(79, humano.salud());
	}

	@Test
	public void testHumanoContraOrco() {
		Personaje orco = new Orco();

		Assert.assertEquals(100, humano.salud());

		humano.atacar(orco); /* fuerza 10 */
		orco.atacar(humano);

		Assert.assertEquals(98, orco.salud());
		Assert.assertEquals(85, humano.salud());

		humano.atacar(orco); /* fuerza 8 */
		orco.atacar(humano);

		Assert.assertEquals(96, orco.salud());
		Assert.assertEquals(70, humano.salud());

		humano.atacar(orco); /* fuerza 6 */
		orco.atacar(humano);

		Assert.assertEquals(95, orco.salud());
		Assert.assertEquals(55, humano.salud());

		humano.atacar(orco); /* fuerza 4 */
		orco.atacar(humano);

		Assert.assertEquals(94, orco.salud());
		Assert.assertEquals(40, humano.salud());

		humano.atacar(orco); /* fuerza 2 */
		orco.atacar(humano);

		Assert.assertEquals(94, orco.salud());
		Assert.assertEquals(25, humano.salud());

		humano.descansar();
		humano.atacar(orco); /* fuerza 10 */
		orco.atacar(humano);

		Assert.assertEquals(92, orco.salud());
		Assert.assertEquals(10, humano.salud());

		humano.atacar(orco); /* fuerza 8 */
		orco.atacar(humano);

		Assert.assertEquals(90, orco.salud());
		Assert.assertEquals(0, humano.salud());
	} 

	@Test
	public void testHumanoContraTroll() {
		Personaje troll = new Troll();

		Assert.assertEquals(100, humano.salud());

		humano.atacar(troll); /* fuerza 10 */
		troll.atacar(humano); /* 0 ataques dados */
		troll.atacar(humano); /* 1 ataques dados */
		troll.atacar(humano); /* 2 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(70, humano.salud());

		humano.atacar(troll); /* fuerza 6 */
		troll.atacar(humano); /* 3 ataques dados */
		troll.atacar(humano); /* 4 ataques dados */
		troll.atacar(humano); /* 5 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(40, humano.salud());

		humano.atacar(troll); /* fuerza 2 */
		troll.atacar(humano); /* 6 ataques dados */
		troll.atacar(humano); /* 7 ataques dados */
		troll.atacar(humano); /* 8 ataques dados */

		Assert.assertEquals(100, troll.salud());
		Assert.assertEquals(10, humano.salud());
		
		troll.descansar();
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		troll.atacar(humano);
		
		Assert.assertEquals(10, humano.salud());
	}
}
