class Square extends Shape {
    
    int sides;
	
	Square(int sides, String shapeName, String shapeType) {
		super(shapeName , shapeType);
        this.sides = sides;
        
    }
	
	/*Square(int s, String sName, String sType) {
        System.out.println("Square(int)");
        sides = s;
        shapeName = sName;
        shapeType = sType;
    }*/
        
    /*Square(int sides, String shapeName, String shapeType) {
        System.out.println("Square(int)");
        this.sides = sides;
        super.shapeName = shapeName;
        super.shapeType = shapeType;
    }*/

    void calculatePerimeter() {
        int perimeter = 4 * sides;
        System.out.println("calculating perimeter of " + shapeName + " using no. of sides: " + sides);
    }

    void calculateArea() {
        int area = sides * sides;
        System.out.println("calculating area of " + shapeName + " using no. of sides: " + sides);
    }
}