package util;

public class InputTest {
    // this is a instance variable
    public Input ipnt = new Input();


    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1, 100));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(1,100));
        System.out.println(input.getDouble());
        System.out.println(input.getString("Enter your next item:"));

    }

}
