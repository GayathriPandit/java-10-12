
public class A2 {
void sum(int x, int y) {
	System.out.println("sum of 2 numbers: " +(x+y));
}
void sum(int y,int x) {
	System.out.println("sum of 3 numbers: " +(x+y));
}
public static void main(String[] args) {
	A2 a= new A2();
	a.sum(20,30);
}
}
