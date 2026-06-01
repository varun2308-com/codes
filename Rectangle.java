class Rectangle extends Shape {
    
    int length;
    int breadth;
	
	Rectangle(int length, int breadth, String shapeName, String shapeType) {
        super(shapeName , shapeType);
        this.length = length;
        this.breadth = breadth;
    }
        
    /*Rectangle(int length, int breadth, String shapeName, String shapeType) {
        System.out.println("Rectangle(int)");
        this.length = length;
        this.breadth = breadth;
        super.shapeName = shapeName;
        super.shapeType = shapeType;
    }*/

    void calculatePerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("calculating perimeter of " + shapeName + " using no. of sides: " + perimeter);
    }

    void calculateArea() {
        int area = length * breadth;
        System.out.println("calculate area of " + shapeName + " using no. of sides: " + area);
    }
}