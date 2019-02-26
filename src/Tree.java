public class Tree {

    private boolean evergreen;
    private int height;
    private String sectionOfATree;

    Tree(boolean evergreen, int height, String sectionOfATree) {
        setSectionOfATree(sectionOfATree);
        setEvergreen(evergreen);
        setHeight(height);
    }

    int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    String getSectionOfATree() {
        return sectionOfATree;
    }

    private void setSectionOfATree(String sectionOfATree) {
        this.sectionOfATree = sectionOfATree;
    }

    boolean isEvergreen() {
        return evergreen;
    }

    private void setEvergreen(boolean evergreen) {
        this.evergreen = evergreen;
    }

    @Override
    public String toString() {
        return "Height of tree = \t" + getHeight() + "\t section of a tree: \t" + getSectionOfATree() + "\t evergreen?: \t" + isEvergreen() +"\t";
    }
}
