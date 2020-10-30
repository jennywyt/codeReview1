public class Q1 {

    public static void calculateRectArea(int width, int height) {
        int area = width * height;
        System.out.println("The rectangle area is "+ area);
    }

    static void calculateSquare(int side) {
        int squareArea = side * side;
        System.out.println("The square area is " + squareArea);
    }

    static void calculatesquarePerimeter(int side) {
        int squarePerimeter = side * 4;
        System.out.println("The square perimeter is "+ squarePerimeter);
    }

    public static void main(String[] args) {

        double wide = 5;
        double length = 2;
        double area = wide * length;
        System.out.println(area);

        int[][] rectangles = {
                {20,30},{40,50},{80,40},{88,5},{100,9}

        };

        for(int i =0; i < rectangles.length; i++){
            calculateRectArea(rectangles[i][0],rectangles[i][1]);
        }

        int [][]square = {
                {4},{80},{66},{1000},{42},{588}
        };

        for(int i =0; i<square.length;i++){
            calculatesquarePerimeter(square[i][0]);
            calculateSquare(square[i][0]);
        };


    }
}
