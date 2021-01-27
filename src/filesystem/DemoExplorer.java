package filesystem;

public class DemoExplorer {
    public static void main(String[] args) {

        File textFile1 = new File("textdatei1", "txt", 100);
        File textFile2 = new File("textdatei2", "txt", 50);
        File textFile3 = new File("txtdatei3", "txt", 75);
        File pictureFile1 = new File("demobild", "png", 753);
        File pictureFile2 = new File("demobild1", "png", 1502);
        File pictureFile3 = new File("demobild2", "png", 347);

        Folder root = new Folder("root");
        Folder subdir1 = new Folder("subdir1");
        Folder subdir2 = new Folder("subdir2");
        Folder subdir1_sub = new Folder("subdir1-sub");

        /*
        root
         + subdir1
            + subdir1_sub
              textFile3
              pictureFile3
            textFile2
            textFile1
         + subdir2
            pictureFile1
            pictureFile2
         */

        subdir2.addEntry(pictureFile1);
        subdir2.addEntry(pictureFile2);
        subdir1_sub.addEntry(textFile3);
        subdir1_sub.addEntry(pictureFile3);
        subdir1.addEntry(subdir1_sub);
        subdir1.addEntry(textFile2);
        subdir1.addEntry(textFile3);
        root.addEntry(subdir1);
        root.addEntry(subdir2);




    }
}
