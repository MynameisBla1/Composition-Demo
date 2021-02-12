public class Main(){

    public static void main(String[] args) {

        //initializing dimensions
        Dimensions dimensions = new Dimensions(20, 20, 5);

        //initializing a new instance of case, notice how we needed dimensions because theCase is composed of dimensions
        Case theCase = new Case("2240", "Dell", "240", dimensions);


        //Initializing the monitor, notice hwo this time while passing the constructor arguments, we also created a new resultion and passed those arguments.
        //Monitor is composed of resolution
        Monitor theMonitor = new Monitor("19 Inch", "Asus", 27, new Resolution(2540, 1440));

        //initializing the motherboard
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        //The PC is composed of the case, the monitor, and the motherboard all three must be initialized correctly before we can create the PC
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Microsoft Word");
        thePC.getTheCase().pressPowerButton();
    }
}