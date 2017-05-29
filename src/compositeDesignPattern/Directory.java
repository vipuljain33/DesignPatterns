package compositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vipuljain on 27/05/17.
 */
public class Directory implements FileComponent {

    private String fileName;

    private List files = new ArrayList();

    public Directory(String name)
    {
        this.fileName = name;
    }

    public void add(FileComponent obj)
    {
        files.add(obj);

    }

    @Override
    public void printName() {

        System.out.println("Directory Name : " + fileName);

        for(int i = 0; i < files.size(); i++)
        {

            FileComponent obj = (FileComponent) files.get(i);
            obj.printName();

        }

    }
}
