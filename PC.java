public class PC {
    //notice how these fields are referring to classes? This how composition works
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;
    private int i;

   //this constructor is treating these classes like fields in a normal class.
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}