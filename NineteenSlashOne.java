class Point{
	private int xPos;
	private int yPos;
	public Point(int x, int y){
		xPos=x;
		yPos=y;
	}
	@Override
	public boolean equals(Object obj){
		if(this.xPos ==  (((Point)obj).xPos) && this.yPos ==  (((Point)obj).yPos))
			return true;
		else
			return false;
	}
}

class Rectangle{
	private Point upperLeft;
	private Point lowerRight;
	public Rectangle(int x1, int y1, int x2, int y2){
		upperLeft = new Point(x1, y1);	
		lowerRight=  new Point(x2,y2);
	}
	@Override
	public boolean equals(Object obj){
		if(this.upperLeft.equals(((Rectangle)obj).upperLeft) && this.lowerRight.equals(((Rectangle)obj).lowerRight))
			return true;
		else
			return false;
	}

}

class NineteenSlashOne{
	public static void main(String[] args){
		Rectangle r1 = new Rectangle(1,2,3,4);
		Rectangle r2 = new Rectangle(2,3,4,5);
		Rectangle r3 = new Rectangle(1,2,3,4);
		
		if(r1.equals(r2))
			System.out.println("r1 and r2 same");
		if(r1.equals(r3))
			System.out.println("r1 and r3 same");
	}
}
		