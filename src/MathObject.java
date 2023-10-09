public abstract class MathObject 
{
    String description;

    public MathObject(){}

    public MathObject(String descript)
    {
        description = descript;
    }

    abstract int getDimensions();
}
