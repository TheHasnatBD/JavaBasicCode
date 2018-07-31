package association;

public class StudentAddress {

    private String houseNo;
    private String road;
    private String city;
    private int zipCode;

    public StudentAddress(String houseNo, String road, String city, int zipCode) {
        this.houseNo = houseNo;
        this.road = road;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "StudentAddress {" +
                "houseNo='" + houseNo + '\'' +
                ", road='" + road + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
