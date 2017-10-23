import static org.junit.Assert.assertNotNull;

import org.junit.Test;




public class VirtualPetTest {
	
//	@Test
//	public void assertThatDogIsAVirtualPet() {
//		VirtualPet  underTest= new Dog("","",1,1,0);  
//		assertNotNull(underTest);
//	}
	@Test
	public void shouldBeAbleToCreateARoboCatObject() {
		RoboCat underTest = new RoboCat("","",0,0,0,0); 
		assertNotNull(underTest);
	}

}
