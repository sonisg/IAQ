package LLDCompositeDP;

public interface FileSystem {

    String getName();
    long getSize();
    void delete();

    void ls();
}
