package creationalPatterns.prototypePattern.cloneableExample;

public class WithoutCloneableStudent {
    String name = null;
    int id = 0;

    // default constructor
    WithoutCloneableStudent() {}

    // parameterized constructor
    WithoutCloneableStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        // create an instance of WithoutCloneableStudent
        WithoutCloneableStudent s1 = new WithoutCloneableStudent("Aniket", 24);

        // Try to clone s1 & assign the new object to s2
        // following snippet will throw will CloneNotSupportedException
        // WithoutCloneableStudent s2 = s1.clone();
    }
}
