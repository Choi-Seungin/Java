package e04_access;

public class Square {
	private int width;
	private int height;

	public Square(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//Alt + Shift + s -> r
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int area() {
		return width*height;
	}
	
	@Override
	public String toString() {
		return "가로길이 : " + width + " / 세로길이 : " + height + " / 넓이 : " + area();
	}
	
}
