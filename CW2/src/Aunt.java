public class Aunt extends Parents {
    private int Id;

    public Aunt(String name, int age, int id) {
        super(name, age);
        this.Id = id;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Aunt Name: " +Name + ",Age: " + Age + ",id: "+ Id);

    }

    @Override
    public void PerformAction() {
        System.out.println("Aunt Performs a specific action based on her attribue: "+ Id);


    }
}
