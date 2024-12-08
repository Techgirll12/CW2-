public class Mother extends Parents{
    private int Phone;

    public Mother(String name, int age, int phone) {
        super(name, age);
        this.Phone = phone;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Mother Name: " +Name + ",Age: " + Age + ",Phone: "+ Phone);
    }

    @Override
    public void PerformAction() {
      int result = Age* Phone;
        System.out.println("Mother action result (Age * Pnone) : " + result);
    }
}
