public class Man extends Person {
    private String facialHairType;
    private boolean isMarried;

    public Man(String firstName, String lastName, int age, String facialHairType) {
        super(firstName, lastName, age);
        this.facialHairType = facialHairType;
        this.isMarried = false;
    }

    public String getFacialHairType() {
        return facialHairType;
    }

    public void setFacialHairType(String facialHairType) {
        this.facialHairType = facialHairType;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }


    public void retire() {
        System.out.println(getFirstName() + " " + getLastName() + " is retiring and enjoying his life!");
    }

}
