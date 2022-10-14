package problem_3;

public class Area extends Shape{

    @Override
    public int rectangleArea(int length, int breadth) {
        // TODO Auto-generated method stub
        int RectangleArea=length*breadth;
        return RectangleArea;
    }

    @Override
    public int squareArea(int side) {
        // TODO Auto-generated method stub
        int SquareArea=side*side;
        return SquareArea;
    }

    @Override
    public int circleArea(int radius) {
        // TODO Auto-generated method stub
        float CircleArea=(float)(3.14)*(radius*radius);
        return (int)CircleArea;
    }
}
