package by.company.kaliaha.task7;

public class Point {
	private int x;
	private int y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public int getX () {
		return x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	public int getY (){
		return y;
	}
	
	@Override
	public boolean equals(Object aThat) {
		if (this == aThat) return true;
		if (!(aThat instanceof Point)) return false;
		Point that = (Point)aThat;
		if (this.x != that.x && this.y != that.y) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override 
	public String toString(){
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName() + " [")
			   .append(x + ", ")
			   .append(y + "]");
		return builder.toString();
	}
}