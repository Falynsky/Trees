public class LeafyTree extends Tree {

    private int shapeOfLeaf;

    LeafyTree(boolean evergreen, int height, String sectionOfATree, int shapeOfLeaf) {
        super(evergreen, height, sectionOfATree);
        setShapeOfLeaf(shapeOfLeaf);
    }

    @Override
    public String toString() {
        return super.toString() + "\tshape of leaf: \t" + getShapeOfLeaf();
    }

    private int getShapeOfLeaf() {
        return shapeOfLeaf;
    }

    private void setShapeOfLeaf(int shapeOfLeaf) {
        this.shapeOfLeaf = shapeOfLeaf;
    }
}
