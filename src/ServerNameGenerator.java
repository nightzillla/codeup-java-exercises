public class ServerNameGenerator {
//    Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.

    String[] adjectives = {"Charming", "Cruel", "Fantastic", "Genital","Huge","Perfect","Rough","Sharp","Tasty","Zealous"};
    String[] nouns = {"park","country","person","cat","day","city","Japan","Texas","Starbucks","Peter"};

    public String randomElement(){
        int randomAdjectives = (int) (Math.random() * 11);
        int randomNouns = (int) (Math.random() * 11);
        return this.adjectives[randomAdjectives] + " -- " + this.nouns[randomNouns];
        }

    public static void main(String[] args) {
        // this is a instance
        ServerNameGenerator nameGenerator = new ServerNameGenerator();
        System.out.println(nameGenerator.randomElement());
    }

} // end of ServerNameGenerator class
