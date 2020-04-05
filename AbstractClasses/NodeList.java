package AbstractClasses;

public interface NodeList {

    ItemsList getRoot();
    boolean addItem(ItemsList item);
    boolean removeItem(ItemsList item);
    void traverse(ItemsList root);
}
