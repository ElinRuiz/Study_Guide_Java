package lessons.objectorientedprogramming.model;

public /*final*/ class Dog implements Animal {
    @Override
    public String doAction() {
        return "Woof";
    }
}
