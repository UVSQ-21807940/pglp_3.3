import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testR {
	
	@Test
	public void tourneTest() {
		Position p=new Position(0,0);
		Direction d =new Direction(0);
		
		Robot r =new Robot(p,d);
		r.tourne(40);
		assertTrue(r.equals(r));
	}
	
	@Test
    public void inRobot(){
        Robot r = new Robot(null, null);
        assertTrue(r != null);
    }

	 @Test
	    public void testM(){
	        RobotMobile r = new RobotMobile(null, null);
	        r.avance();
	    }
	 
	
	 @Test
		public void testRS() {
			Position p = new Position(1,5);
			robostat rs = new robostat(p);
		}
	 
}
