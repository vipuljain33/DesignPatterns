package compositeDesignPattern;

/**
 * Created by vipuljain on 27/05/17.
 */
public class LeafFile implements FileComponent {

    private String fileName;

    public LeafFile(String name){


        this.fileName = name;
    }


    @Override
    public void printName() {
        System.out.println("File Name : " + fileName) ;
    }
}
