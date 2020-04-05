package AbstractClasses;

public class Node extends ItemsList {
    public Node(Object value) {
        super(value);
    }

    @Override
    ItemsList nextItem() {
        return this.rightLink;
    }

    @Override
    ItemsList setNextItem(ItemsList item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    ItemsList previousItem() {
        return rightLink;
    }

    @Override
    ItemsList setPreviousItem(ItemsList item) {
        this.leftLink = item;
        return this.leftLink;
    }

    @Override
    int compareTo(ItemsList item) {
        if(item != null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else{
            return -1;
        }
    }

}
