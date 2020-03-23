

public class Robot {
	private Position position;
	private Direction direction;
	
	
	
	public Robot(Position p, Direction d) {
		this.position=p;
		this.direction=d;
	}

	public Direction getDirection() {
		return this.direction;
	}
	
	public Position getPosition() {
		return this.position;
	}
	
	public void tourne(float x) {
		
		direction.setI(x);
	}

	public void avance() {
		// TODO Auto-generated method stub
		
	}

		
	

}
