package e01_object;

public class Circle implements Cloneable{
	private Point pos;
	private int r;
	public Circle(Point pos, int r) {
		super();
		this.pos = pos;
		this.r = r;
	}
	public Point getPos() {
		return pos;
	}
	public void setPos(Point pos) {
		this.pos = pos;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	
	@Override
	public String toString() {
		return "Circle [pos=" + pos + ", r=" + r + "]";
	}
	
	public Circle clone() {
			Point p = pos.clone();//참조형 데이터도 복제
			return new Circle(p, r);
	}
	
}
