package e04_access;

public class Triangle {
	private int width;
	private int height;
	
	private Triangle(int height, int width) {
		this.width = width;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public double area() {
		return height * width / 2.0;
	}

	@Override
	public String toString() {
		return "높이 : " + height + " / 가로 : " + width + " / 넓이 : " + area();
	}

}
