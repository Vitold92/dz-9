
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        if (this instanceof Man) {
            return age >= 65;
        } else if (this instanceof Woman) {
            return age >= 60;
        }
        return false;
    }

    public void registerPartnership(Person partner) {
        this.partner = partner;
        if (this instanceof Man && partner instanceof Woman) {
            partner.setLastName(this.getLastName());
        }
    }

    public void deregisterPartnership(boolean isReturningToMaidenName) {
        if (this.partner != null) {
            if (this instanceof Man && this.partner instanceof Woman) {
                if (isReturningToMaidenName) {
                    this.partner.setLastName(((Woman) this.partner).getMaidenName());
                }
                this.partner = null;
            } else if (this instanceof Woman && this.partner instanceof Man) {
                if (isReturningToMaidenName) {
                    this.setLastName(((Woman) this).getMaidenName());
                }
                this.partner = null;
            }
        }
    }

}

