package compositeDesignPattern.AnotherExample;

/**
 * Created by vipuljain on 27/05/17.
 */
public class CompositeTest {

    public static void main(String[] args)
    {

        Section s1, s2, s3, s11, s12, s13, s21, s22, s23, s31, s32, s33;

        Section title = new Section("Peeling Design Patterns", 2);
        title.add(s1=new Section("UML Basics", 1));
        title.add(s2=new Section("UML Diagrams", 1));
        title.add(s3=new Section("UML Notations", 1));
        s1.add(s11=new Section("Definition and History", 1));
        s1.add(s12=new Section("The Pattern Concept", 2));
        s2.add(s21=new Section("Introduction to UML Diagrams", 10));
        s2.add(s22=new Section("Singleton", 1));
        s2.add(s23=new Section("Factory Method", 1));
        s3.add(s31=new Section("Introduction",1));
        int ap = s21.getAllPages();
        System.out.println(s21.getTitle() + " has " + ap + " pages");
    }
}
