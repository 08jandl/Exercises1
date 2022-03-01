package fh.campus02;

public class Rectangle {
    public static void main(String[] args) {

        int length = 3;
        int breadth = 4;
        int circumference = 2*(length+breadth);
        int area = length*breadth;

        System.out.println("The circumference of the rectangle is " + circumference);
        System.out.println("The area of the rectangle is " + area);
    }
}
