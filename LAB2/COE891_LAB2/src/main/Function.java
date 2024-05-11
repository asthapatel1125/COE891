package main;

public class Function {

	public int func(int a, int b) {
		if (b > a) {
			b = b - a;
			return b; }
		else if (a > b){
			b = a - b;
			return b; }
		else
			return 0;}
}
