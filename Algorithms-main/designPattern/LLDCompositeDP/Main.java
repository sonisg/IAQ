package LLDCompositeDP;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        File textFile1 = new File("example1.txt", 100);
        File textFile2 = new File("example2.txt", 150);

        root.addComponent(documents);
        root.addComponent(textFile1);
        documents.addComponent(textFile2);

        root.ls();
        documents.ls();

        documents.delete();
    }
}
//root -> documents -> textFile2
//     -> textFile1