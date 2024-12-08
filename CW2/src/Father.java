public class Father extends Parents {
    private String NickName;

    public Father(String name, int age, String nickName) {
        super(name, age);
        NickName = nickName;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("Father- Name:"  +Name+ ", Age:" + Age +", NickName:" +NickName);
    }
    @Override
    public void PerformAction() {

        System.out.println("Father Performs a specific action base on his attribue: "+ NickName);
    }
}
