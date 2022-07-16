package creationalPatterns.prototypePattern.cloneableExample;

public class CloneableStudent implements Cloneable {
    String name;
    int id;

    public CloneableStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // overriding clone method by simply calling object class's clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

