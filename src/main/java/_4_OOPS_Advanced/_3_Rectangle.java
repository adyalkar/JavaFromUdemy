package _4_OOPS_Advanced;

public class _3_Rectangle {
	
	//state 
	private int length;
	private int width ;
	
	//constructor
	public _3_Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int area () {
		return length * width;
	}
	
	public int perimeter () {
		return 2*(length + width);
	}
	
	public String toString() {
		return String.format("length is %d , width is %d ,  area is %d ,perimeter is %d", length,width,area(),perimeter());
	}
	
	

}
