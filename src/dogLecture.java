public class dogLecture {
    public static void bark() {
        System.out.println("woof woof!");
    }

    public static void bark(int weight){
        if (weight < 25) {
            System.out.println("Yip yip");
        } else {
            System.out.println("Woof woof");
        }
    }
    public static void main(String[] args) {
        bark();
        bark(15);
        bark(50);
    }
}
