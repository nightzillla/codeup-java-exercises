public class StringLecture {
    public static void main(String[] args) {
//        String teacher = "teacher";
//        System.out.println(teacher);
//        teacher = "not teacher";
//        System.out.println(teacher);
        String javier = "Javier";

        System.out.println(Integer.toHexString((System.identityHashCode(javier))));

        String alsoJavier = "Javier";
        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

        javier = javier + " Ruedas";
        alsoJavier = javier;
        System.out.println(alsoJavier);
        System.out.println(javier);
        System.out.println(Integer.toHexString((System.identityHashCode(javier))));
        System.out.println(Integer.toHexString((System.identityHashCode(alsoJavier))));

    }
}
