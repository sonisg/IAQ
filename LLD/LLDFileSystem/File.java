package LLDCompositeDP;

public class File implements FileSystem{

    String name;

    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + name);
    }

    @Override
    public void ls() {
        System.out.println("File: " + getName());
    }
}
