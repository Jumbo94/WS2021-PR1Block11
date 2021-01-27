package filesystem;

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
}
