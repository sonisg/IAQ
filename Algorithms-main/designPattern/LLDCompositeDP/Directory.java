package LLDCompositeDP;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String name;
    private List<FileSystem> components;

    public Directory(String name) {
        this.name = name;
        components = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public void addComponent(FileSystem component) {
        components.add(component);
    }
    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileSystem component : components) {
            totalSize += component.getSize();
        }
        return totalSize;
    }

    @Override
    public void delete() {
        System.out.println("Deleting directory: " + name);
        for (FileSystem component : components) {
            component.delete();
        }
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + getName());
        for (FileSystem component : components) {
            component.ls();
        }
    }
}
