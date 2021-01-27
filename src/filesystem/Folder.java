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
        int sum = 0;
        for (FSEntry entry: entries) {
            sum = sum + entry.getSize();
        }

        return sum;
    }

    @Override
    public void print() {
        System.out.println(getName() + " " + entries.size() + " included entries, total Size: " + getSize()) ;
    }

    public void print(String indent) {
        System.out.println(getName() + " " + entries.size() + " included entries, total Size: " + getSize()) ;
    }
}
