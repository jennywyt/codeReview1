public class Q1 {

    public static int calculateRectArea(int width, int height) {
        int area = width * height;
        return area;
    }

    static int calculateSquare(int side) {
        int squareArea = side * side;
        return squareArea;
    }

    static int calculatesquarePerimeter(int side) {
        int squarePerimeter = side * 4;
        return squarePerimeter;

    }

    public static void main(String[] args) {

        double wide = 5;
        double length = 2;
        double area = wide * length;
        System.out.println(area);

        int[][] rectangles = {
                {20, 30}, {40, 50}, {80, 40}, {88, 5}, {100, 9}

        };

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle with width of " + rectangles[i][0] + " and the length of " + rectangles[i][1] + ":");
            System.out.println("The rectangle area is " + calculateRectArea(rectangles[i][0], rectangles[i][1]));
        }

        int[][] square = {
                {4}, {80}, {66}, {1000}, {42}, {588}
        };

        for (int i = 0; i < square.length; i++) {
            System.out.println("Square with width of " + square[i][0] +":");
            System.out.println("The square perimeter is " + calculatesquarePerimeter(square[i][0]));
            System.out.println("The square area is " + calculateSquare(square[i][0]));
        }
    }
}
