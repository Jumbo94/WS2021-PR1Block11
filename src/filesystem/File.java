package filesystem;

public class File extends FSEntry {

    private String extension;
    private int size;

    public File(String name, String extension, int size) {
        super(name);
        this.extension = extension;
        this.size = size;
    }

    @Override
    public String getName() {
        return super.getName() + "." + extension;
//        return name + "." + extension;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + getName() + " : " + size + "kB");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void print() {
        System.out.println(getName() + " : " + size + "kB");
    }
}
