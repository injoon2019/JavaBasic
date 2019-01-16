class Triangle{
	int bottom;
	int height;
	
	public Triangle(int bot, int hei){
		bottom=bot;
		height=hei;
	}	
	public void triChange(int bot, int hei){
		bottom=bot;
		height=hei;
	}
	
	public int triWidth(){
		return bottom*height;
	}
	
	public void showTriangle(){
		System.out.println(bottom+" "+height);
	}
}
class SevenSlashOne{

	public static void main(String[] args){
		Triangle tri=new Triangle(30,40);
		tri.showTriangle();
		tri.triChange(50,40);
		tri.showTriangle();
	}
}
		