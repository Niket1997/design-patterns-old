package creationalPatterns.prototypePattern.cloneableExample;

public class TestCloneableStudent {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneableStudent s1 = new CloneableStudent("Aniket", 26);

        CloneableStudent s2 = (CloneableStudent) s1.clone();

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
