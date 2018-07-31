package association;

public class StudentContact {

    private String email, phoneNum;

    public StudentContact(String email) {
        this.email = email;
    }

    public StudentContact(String email, String phoneNum) {
        this.email = email;
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "StudentContact{" +
                "email='" + email + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
