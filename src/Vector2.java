public class Vector2 extends MathObject implements Cloneable
{
    int xAxis;
    int yAxis;

    public Vector2(int x, int y)
    {
        super();
        xAxis = x;
        yAxis = y;
    }

    public Vector2(int x, int y, String descript)
    {
        super(descript);
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

    public String getDescription()
    {
        return super.description;
    }

    public double magnitude()
    {
        return Math.sqrt((xAxis * xAxis) + (yAxis * yAxis));
    }

    public boolean isEquals(Vector2 other)
    {
        if (!(this.getDescription().equals(null)) && !(other.getDescription().equals(null)))
        {
            if((this.getX() == other.getX()) && (this.getY() == other.getY()) && (this.getDescription().equals(other.getDescription())))
        {
            return true;
        }
        else 
        {
            return false;
        }
        }  
        else
        return false;
    }

    public Vector2 combine(Vector2 other)
    {
        int newX = this.getX() + other.getX();
        int newY = this.getY() + other.getY();

        return new Vector2(newX, newY);
    }

    public String toString()
    {
        return "X Axis is " + xAxis + " and Y Axis is " + yAxis;
    }

    int getDimensions()
    {
        return 2;
    }

    public Vector2 clone()
    {
        return this;
    }
}
