package test;

import java.sql.Date;

import br.com.JavaCRUD.domain.Plant;
import br.com.JavaCRUD.domain.PlantService;
import junit.framework.TestCase;

public class MyTest extends TestCase {
	
	private PlantService plantService = new PlantService();
	
	public void testCreateObject() {
		Plant p = new Plant();
		p.setPlants("Pé de Café");
		//p.setId(2L);
		@SuppressWarnings("deprecation")
		Date date = new Date(1986,31,5);
		p.setDate(date);
		byte b = 1;
		p.setSun(b);
		p.setWaterTimes(4);
		p.setWaterUnity("a week");
		
		assertEquals(p.getPlants(), "Pé de Café");
		
		System.out.println(plantService.getPlant(1L).toString());	
		
	}
	
	

}
