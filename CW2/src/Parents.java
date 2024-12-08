abstract class Parents {
    protected String Name;
    protected int Age;

    public Parents(String name, int age) {
        Name = name;
        Age = age;
    }
    public abstract void DisplayInfo();
    public abstract void PerformAction();
}
