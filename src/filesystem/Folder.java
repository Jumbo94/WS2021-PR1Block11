package filesystem;

import java.util.ArrayList;

public class Folder extends FSEntry {

    private ArrayList<FSEntry> entries = new ArrayList<>();

    public Folder(String name) {
        super(name);
//        entries = new ArrayList<>();
    }

    public void addEntry(FSEntry entry) {
        entries.add(entry);
    }


    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + entries.size() + " included files") ;
    }
}
