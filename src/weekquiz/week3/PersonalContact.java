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
        String formattedContact = String.format("이름: %s, 전화번호: %s, 회사명: %s\n",this.getName(), this.getPhoneNumber(), this.getRelationship());

        return formattedContact;
    }
}
