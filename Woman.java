public class Woman extends Person {
    private boolean hasLongHair;
    private String maidenName;
    private boolean isMarried;

    public Woman(String firstName, String lastName, int age, boolean hasLongHair) {
        super(firstName, lastName, age);
        this.hasLongHair = hasLongHair;
        this.maidenName = lastName;
        this.isMarried = false;
    }

    public boolean hasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void retire() {
        System.out.println(getFirstName() + " " + getLastName() + " is retiring and enjoying her life!");
    }

    public void changeLastNameAfterMarriage(String husbandLastName) {
        if (!isMarried) {
            this.setLastName(husbandLastName);
            this.isMarried = true;
            System.out.println(getFirstName() + " got married to Mr. " + husbandLastName + "!");
        } else {
            System.out.println(getFirstName() + " is already married!");
        }
    }

}
