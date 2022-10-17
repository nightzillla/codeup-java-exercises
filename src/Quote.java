
public class Quote {
//    Create a Quote class with a RandomQuote method. The method should generate a random number from 1 to 4. Depending on the result, the method should return a different quote. Now edit your animal class from the previous exercise so instead of an appropriate animal noise it makes a random quote. Test your animal class and verify that it now emits a random quote instead of an animal-appropriate noise.
    public static String randomQuote(){
        int randomNumber = (int) (Math.random() * 4) + 1;
        switch (randomNumber){
            case 1 : return "Time is money";
            case 2 : return "Pura vida";
            case 3 : return "Knowledge is power";
            case 4 : return "With great power comes great responsibility";
            default: return " When torrential water tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is because timing. Thus the momentum of one skilled in war is overwhelming, their attack precisely regulated. Their potential is that of a fully draw crossbow; their timing, the release of the trigger.";
        }
    }
}
