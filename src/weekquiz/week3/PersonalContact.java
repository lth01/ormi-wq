package weekquiz.week3;

public class PersonalContact extends Contact{
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super.setName(name);
        super.setPhoneNumber(phoneNumber);
        this.relationship = relationship;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    @Override
    public String showContact() {
        return null;
    }
}
