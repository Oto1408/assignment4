package ge.tbcit.assignment4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle(20,30);
		Rectangle rec2 = new Rectangle(3,45);
		Rectangle rec3 = new Rectangle (12,17);
		Rectangle rec4 = new Rectangle (60,48);
		Rectangle[] recList = new Rectangle[4];
		recList[0]=rec1;
		recList[1]=rec2;
		recList[2]=rec3;
		recList[3]=rec4;
		Rectangle maxRec = Rectangle.maxArea(recList);
		System.out.println("Max rectangle area: "+maxRec.getArea());
	}

}
