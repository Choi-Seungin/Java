package e02_collection;

import java.util.Objects;

public class Point implements Cloneable, Comparable<Point>{
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode");
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point clone() {
		try {
			return (Point) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//Tree의 경우 compareTo로 비교
	//자신이 작은 경우 음수, 같으면 0, 비교대상값이 크면 양수
	@Override
	public int compareTo(Point o) {
		System.out.println("compareTo");
		if(x != o.x) {
			return x - o.x;
		}
		if(y != o.y) {
			return y - o.y;
		}
		
		return 0;
	}
}