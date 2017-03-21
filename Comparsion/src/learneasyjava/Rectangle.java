package learneasyjava;

public class Rectangle {
	int length;
	int breadth;
	void calculatearea(int lh,int bh){
		length=lh;
		breadth=bh;
	}
	void displayarea(){
		System.out.println(length*breadth);
	}}