package filesystem;

import java.util.ArrayList;

public abstract class FSEntry {
    protected String name;

    public FSEntry(String name) {
        this.name = name;
    }

    public abstract int getSize() ;

    public abstract void print() ;

    public String getName() {
        return name;
    }

    public abstract void print(String indent);

    public abstract ArrayList<FSEntry> findEntries(String name);
}
