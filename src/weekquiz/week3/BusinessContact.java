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
        return null;
    }
}
