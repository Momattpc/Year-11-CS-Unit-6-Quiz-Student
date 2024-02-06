public class Address {
    private String district;
    private String street;
    private int streetNumber;

    public Address (String district, String street, int streetNumber){
        this.district = district;
        this.street = street;
        this.streetNumber = streetNumber;
    }
    public String getDistrict(){
        return district;
    }
    public String getStreet(){
        return street;
    }
    public int getStreetNumber(){
        return streetNumber;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setStreetNumber(int StreetNumber){
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString(){
        return getStreetNumber() + " " + getStreet() + ", " + getDistrict();
    }

}
