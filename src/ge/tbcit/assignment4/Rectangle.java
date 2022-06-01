package ge.tbcit.assignment4;

public class Rectangle {
	private int width;
	private int height;
	
	private static int maxWidth;
	private static int maxHeight;

	static {
		maxWidth = 45;
		maxHeight = 45;
	}
	
	public Rectangle (int width) {
		setWidth(width);		
	}
	
	public Rectangle (int width, int height) {
		setWidth(width);
		setHeight(height);
	}
	
	public Rectangle() {
		setWidth(20);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setWidth(int width) {
		if (width > maxWidth) {
			this.width = maxWidth;
		} else {
			this.width = width;
		}

	}

	public void setHeight(int height) {
		if (height > maxHeight) {
			this.height = maxHeight;
		} else {
			this.height = height;
		}
	}

	public int getPerimeter() {
		return (getHeight() + getWidth()) * 2;
	}

	public int getArea() {
		return getHeight() * getWidth();
	}
	
	public static Rectangle maxArea(Rectangle[] array) {
		int maxArea = 0;
		int index=0;
		for(int i=0; i<array.length; i++) {
			if(array[i].getArea()>maxArea) {
				maxArea = array[i].getArea();
				index=i;
			}
		}
		return array[index];
	}

}
