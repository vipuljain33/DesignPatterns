package compositeDesignPattern;

/**
 * Created by vipuljain on 27/05/17.
 */
public class CompositeDemo {


    public static void main(String[] args)
    {


        //System.out.println("Hello World");
        Directory one = new Directory("test123");
        Directory two = new Directory("test456");
        Directory three= new Directory("test789");

        LeafFile a = new LeafFile("a.txt");
        LeafFile b = new LeafFile("b.txt");
        LeafFile c = new LeafFile("c.txt");
        LeafFile d = new LeafFile("d.txt");
        LeafFile e = new LeafFile("e.txt");

        one.add(a);
        one.add(two);
        one.add(b);
        two.add(c);
        two.add(d);
        two.add(three);
        three.add(e);
        one.printName();

        System.out.println("Since it is printing names of the files recursively, that is why b.txt is printed last");
    }
}
