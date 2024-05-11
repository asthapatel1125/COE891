package main;

public class TriClass {

	public static String classify(int x, int y, int z)
	{

		if ( !(x + y > z) || !(y + z > x) || !(z + x > y)) {
			return "Invalid";
		}
		if (x == y && y == z) {
			return "Equilateral";
		} else if ((x == y && y != z && x != z) || (y == z && z != x && x != y) || (z == x && x != y && y != z)){
			return "Isoceles";
		} else if (x != y && y != z && x != z) {
			return "Scalene";
		} else {
			return "Invalid";
		}
		
	}
	
	/*public static void main(String[] args)
	{
		TriClass tri = new TriClass();
		
		System.out.println(tri.classify(3,3,3));
		System.out.println(tri.classify(3,4,4));
		System.out.println(tri.classify(7,4,6));
		System.out.println(tri.classify(1,2,-5));
		
	}*/
}
