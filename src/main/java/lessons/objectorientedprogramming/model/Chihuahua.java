package lessons.objectorientedprogramming.model;

// If Dog is final, Chihuahua can not exist
public class Chihuahua extends Dog {
    @Override
    public String doAction() {
        return "Meh!";
    }
}
