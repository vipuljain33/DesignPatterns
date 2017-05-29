package compositeDesignPattern.AnotherExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vipuljain on 27/05/17.
 */
public class Section {

    String title;
    int pages;
    List subsections;


    public Section(String title, int pages)
    {
        this.title = title;
        this.pages = pages;
        subsections = new ArrayList();

    }

    public int getAllPages()
    {
        int p = pages;
        Section s;
        for(int i = 0; i < subsections.size(); i++)
        {

            s = (Section) subsections.get(i);
            p += s.getAllPages();
        }

        return p;


    }

    public String getTitle()
    {
        return title;
    }

    public int getPages()
    {
        return pages;
    }

    public void add(Section s)
    {
        subsections.add(s);
    }

    public void remove(Section s)
    {
        subsections.remove(s);
    }
}
