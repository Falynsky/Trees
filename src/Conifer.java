public class Conifer extends Tree {

    private int numberOfneedles;
    private double theLengthOfTheCone;

    Conifer(boolean evergreen, int height, String sectionOfATree, int numberOfNeedles, double theLengthOfTheCone) {
        super(evergreen, height, sectionOfATree);
        setNumberOfneedles(numberOfNeedles);
        setTheLengthOfTheCone(theLengthOfTheCone);
    }

    private void setNumberOfneedles(int numberOfneedles) {
        this.numberOfneedles = numberOfneedles;
    }

    private void setTheLengthOfTheCone(double theLengthOfTheCone) {
        this.theLengthOfTheCone = theLengthOfTheCone;
    }

    private double getTheLengthOfTheCone() {
        return theLengthOfTheCone;
    }

    private int getNumberOfneedles() {
        return numberOfneedles;
    }

    @Override
    public String toString() {
        return super.toString() + "\tnumber of Needles: \t" + getNumberOfneedles() + "\tthe Length of the cone: \t" + getTheLengthOfTheCone();
    }
}
