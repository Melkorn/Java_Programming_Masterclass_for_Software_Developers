package AbstractClasses;

public class MyLinkList implements NodeList {

    private ItemsList root = null;

    public MyLinkList(ItemsList root) {
        this.root = root;
    }

    @Override
    public ItemsList getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ItemsList newItem) {
        if(this.root == null){
            // The list is empty, item becomes head of the list
            this.root = newItem;
            return true;
        }

        ItemsList currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0){
                // newItem is greater, move right if possible
                if(currentItem.nextItem() != null){
                    currentItem = currentItem.nextItem();

                } else {
                    // there is no next, so insert at the end of list
                    currentItem.setNextItem(newItem);
                    newItem.setNextItem(currentItem);
                    return true;
                }
            } else if(comparison > 0){
                // newItem is less, insert before
                if(currentItem.previousItem() != null){
                    currentItem.previousItem().setNextItem(newItem);
                    newItem.setPreviousItem(currentItem.previousItem());
                    newItem.setNextItem(currentItem);
                    currentItem.setPreviousItem(newItem);
                }
            }
        }
    }

    @Override
    public boolean removeItem(ItemsList item) {
        return false;
    }

    @Override
    public void traverse(ItemsList root) {

    }
}
