public class Vector2
{
    int xAxis;
    int yAxis;

    public Vector2(int x, int y)
    {
        xAxis = x;
        yAxis = y;
    }

    public int getX()
    {
        return xAxis;
    }

    public int getY()
    {
        return yAxis;
    }

    public double magnitude()
    {
        return Math.sqrt((xAxis * xAxis) + (yAxis * yAxis));
    }

    public boolean isEquals(Vector2 other)
    {
        if((this.getX() == other.getX()) && (this.getY() == other.getY()))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public String toString()
    {
        return "X Axis is " + xAxis + " and Y Axis is " + yAxis;
    }
}
