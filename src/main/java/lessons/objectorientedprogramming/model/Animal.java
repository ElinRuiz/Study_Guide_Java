package lessons.objectorientedprogramming.model;

public interface Animal {
    public String doAction();
    default public String whatAmI() {
        return this.getClass().getSimpleName();
    }
}
