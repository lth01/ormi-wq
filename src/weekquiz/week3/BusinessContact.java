package weekquiz.week3;

public class BusinessContact extends Contact{
    private String company;

    public BusinessContact(String name, String phoneNumber, String comName){
        super.setName(name);
        super.setPhoneNumber(phoneNumber);
        this.setCompany(comName);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String showContact() {
        String formattedContact = String.format("이름: %s, 전화번호: %s, 회사명: %s\n",this.getName(), this.getPhoneNumber(), this.getCompany());

        return formattedContact;
    }
}
