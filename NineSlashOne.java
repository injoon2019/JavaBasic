class Point{
	int xPos,yPos;
	public Point(int x, int y){
		xPos=x;
		yPos=y;
	}
	public void showPointInfo(){
		System.out.println("[" + xPos+", "+yPos+"]");
	}
	public void setxPos(int x){
		xPos=x;
	}
	public int getxPos(){
		return xPos;
	}
	public void setyPos(int y){
		yPos=y;
	}
	public int getyPos(){
		return yPos;
	}

}
class Circle{
	Point po;
	int rad;
	public Circle(int x, int y, int r){
		po= new Point(x,y);
		rad=r;
	}
	public void showCircleInfo(){
			System.out.println("[" + po.getxPos()+", "+po.getyPos()+"]"+"¹ÝÁö¸§: "+rad);
	}
}	
class NineSlashOne{
	public static void main(String[] args){
		Circle c= new Circle(2,2,4);
		c.showCircleInfo();
	}
}