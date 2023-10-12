class Rectangle{
    protected int width, height;
    
    public Rectangle(){}

    public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}


    // Don't use setter for width and height because it'll break business logic later. Use constructor arguments
	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return width * height;
	}
}


class Square extends Rectangle{
    public Square(){}

    public Square(int side){
        // this.setWidth(side);
        // this.setHeight(side);
        width = height = side;
    }

    // @Override
	// public void setWidth(int width) {
	// 	super.setWidth(width);
	// 	super.setHeight(width);
	// }

	// @Override
	// public void setHeight(int height) {
	// 	super.setHeight(height);
	// 	super.setWidth(height);
	// }
}







public class LiskovSubstitution{


    static void getAreaTest(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }
    public static void main(String[] args){

        Rectangle rc = new Rectangle(2,3);
        getAreaTest(rc);


        Rectangle sq = new Square(5);
        // sq.setWidth(5);
        getAreaTest(sq);

    }
}