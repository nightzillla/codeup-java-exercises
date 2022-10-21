package Animals;

public class Parrot extends Bird {

    public final static String order = "Psittaciformes";


//    public static void makeNoise(){
//        super.makeNoise();
//        System.out.println("When torrential water tosses boulders, it is because of its momentum; when the strike of a hawk breaks the body of its prey, it is because timing. Thus the momentum of one skilled in war is overwhelming, their attack precisely regulated. Their potential is that of a fully draw crossbow; their timing, the release of the trigger.");
//    }
    public void echo(String input){
        System.out.println(input);
    }


    public Parrot(){
        System.out.println("A new parrot just got constructed");
    }

}
