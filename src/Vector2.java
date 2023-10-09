public class Vector2
{
    int xAxis;
    int yAxis;

    public Vector2(int x, int y)
    {
        xAxis = x;
        yAxis = y;
    }

    public double magnitude()
    {
        return Math.sqrt((xAxis * xAxis) + (yAxis * yAxis));
    }
}
