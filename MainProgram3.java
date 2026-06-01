class MainProgram3 {
public static void main(String args[]) {
Maths maths_1 = new Maths(10, 2);
System.out.println(maths_1.add());
System.out.println(maths_1.divide());
System.out.println(maths_1.multiply());
System.out.println(maths_1.subtract());

Maths maths_2 = new Maths(20, 4);
System.out.println(maths_2.add());
System.out.println(maths_2.divide());
System.out.println(maths_2.multiply());
System.out.println(maths_2.subtract());

Maths maths_3 = new Maths(30, 6);
System.out.println(maths_3.add());
System.out.println(maths_3.divide());
System.out.println(maths_3.multiply());
System.out.println(maths_3.subtract());
}
}