public class FruitTree extends LeafyTree {
    private String fruitName;

    FruitTree(boolean evergreen, int height, String sectionOfATree, int shapeOfLeaf, String fruitName) {
        super(evergreen, height, sectionOfATree, shapeOfLeaf);
        setFruitName(fruitName);
    }

    private void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    private String getFruitName() {
        return fruitName;
    }

    @Override
    public String toString(){
        return super.toString() + "\t name of fruit: \t" + getFruitName();
    }
}
