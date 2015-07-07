package praktik.model;

import javafx.beans.property.SimpleStringProperty;

import java.io.*;

public class Company implements Externalizable {
    private final SimpleStringProperty companyName = new SimpleStringProperty();
    private final SimpleStringProperty activities = new SimpleStringProperty();
    private final SimpleStringProperty phone = new SimpleStringProperty();
    private final SimpleStringProperty mail = new SimpleStringProperty();
    private final SimpleStringProperty website = new SimpleStringProperty();
    private final SimpleStringProperty street_address = new SimpleStringProperty();
    private final SimpleStringProperty city = new SimpleStringProperty();
    private final SimpleStringProperty province = new SimpleStringProperty();
    private final SimpleStringProperty zip_code = new SimpleStringProperty();
    private final SimpleStringProperty country = new SimpleStringProperty();
    private final SimpleStringProperty state = new SimpleStringProperty();

    private final SimpleStringProperty additional1 = new SimpleStringProperty();
    private final SimpleStringProperty additional2 = new SimpleStringProperty();
    private final SimpleStringProperty additional3 = new SimpleStringProperty();
    private final SimpleStringProperty additional4 = new SimpleStringProperty();
    private final SimpleStringProperty additional5 = new SimpleStringProperty();

    public Company() {
        this("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "");
    }

    public Company(String companyName, String activities, String phone, String mail, String website, String street, String city, String province, String zip, String country, String state, String add1, String add2, String add3, String add4, String add5) {
        this.companyName.set(companyName);
        this.activities.set(activities);
        this.phone.set(phone);
        this.mail.set(mail);
        this.website.set(website);
        this.street_address.set(street);
        this.city.set(city);
        this.province.set(province);
        this.zip_code.set(zip);
        this.country.set(country);
        this.state.set(state);

        this.additional1.set(add1);
        this.additional2.set(add2);
        this.additional3.set(add3);
        this.additional4.set(add4);
        this.additional5.set(add5);
    }

    public String getCompanyName() {
        return companyName.get();
    }

    public SimpleStringProperty companyNameProperty() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName.set(companyName);
    }

    public String getActivities() {
        return activities.get();
    }

    public SimpleStringProperty activitiesProperty() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities.set(activities);
    }

    public String getPhone() {
        return phone.get();
    }

    public SimpleStringProperty phoneProperty() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone.set(phone);
    }

    public String getMail() {
        return mail.get();
    }

    public SimpleStringProperty mailProperty() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail.set(mail);
    }

    public String getWebsite() {
        return website.get();
    }

    public SimpleStringProperty websiteProperty() {
        return website;
    }

    public void setWebsite(String website) {
        this.website.set(website);
    }

    public String getState() {
        return state.get();
    }

    public SimpleStringProperty stateProperty() {
        return state;
    }

    public void setState(String state) {
        this.state.set(state);
    }

    public String getStreet_address() {
        return street_address.get();
    }

    public SimpleStringProperty street_addressProperty() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address.set(street_address);
    }

    public String getCity() {
        return city.get();
    }

    public SimpleStringProperty cityProperty() {
        return city;
    }

    public void setCity(String city) {
        this.city.set(city);
    }

    public String getProvince() {
        return province.get();
    }

    public SimpleStringProperty provinceProperty() {
        return province;
    }

    public void setProvince(String province) {
        this.province.set(province);
    }

    public String getZip_code() {
        return zip_code.get();
    }

    public SimpleStringProperty zip_codeProperty() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code.set(zip_code);
    }

    public String getCountry() {
        return country.get();
    }

    public SimpleStringProperty countryProperty() {
        return country;
    }

    public void setCountry(String country) {
        this.country.set(country);
    }

    public String getAdditional1() {
        return additional1.get();
    }

    public SimpleStringProperty additional1Property() {
        return additional1;
    }

    public void setAdditional1(String additional1) {
        this.additional1.set(additional1);
    }

    public String getAdditional2() {
        return additional2.get();
    }

    public SimpleStringProperty additional2Property() {
        return additional2;
    }

    public void setAdditional2(String additional2) {
        this.additional2.set(additional2);
    }

    public String getAdditional3() {
        return additional3.get();
    }

    public SimpleStringProperty additional3Property() {
        return additional3;
    }

    public void setAdditional3(String additional3) {
        this.additional3.set(additional3);
    }

    public String getAdditional4() {
        return additional4.get();
    }

    public SimpleStringProperty additional4Property() {
        return additional4;
    }

    public void setAdditional4(String additional4) {
        this.additional4.set(additional4);
    }

    public String getAdditional5() {
        return additional5.get();
    }

    public SimpleStringProperty additional5Property() {
        return additional5;
    }

    public void setAdditional5(String additional5) {
        this.additional5.set(additional5);
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName=" + companyName +
                ", activities=" + activities +
                ", phone=" + phone +
                ", mail=" + mail +
                ", website=" + website +
                ", street_address=" + street_address +
                ", city=" + city +
                ", province=" + province +
                ", zip code=" + zip_code +
                ", country=" + country +
                ", state=" + state +
                "==========" +
                ", additional1=" + additional1 +
                ", additional2=" + additional2 +
                ", additional3=" + additional3 +
                ", additional4=" + additional4 +
                ", additional5=" + additional5 +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(getCompanyName());
        out.writeObject(getActivities());
        out.writeObject(getPhone());
        out.writeObject(getMail());
        out.writeObject(getWebsite());
        out.writeObject(getState());
        out.writeObject(getStreet_address());
        out.writeObject(getCity());
        out.writeObject(getProvince());
        out.writeObject(getZip_code());
        out.writeObject(getCountry());
        out.writeObject(getAdditional1());
        out.writeObject(getAdditional2());
        out.writeObject(getAdditional3());
        out.writeObject(getAdditional4());
        out.writeObject(getAdditional5());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setCompanyName((String)in.readObject());
        setActivities((String) in.readObject());
        setPhone((String) in.readObject());
        setMail((String) in.readObject());
        setWebsite((String) in.readObject());
        setState((String) in.readObject());
        setStreet_address((String) in.readObject());
        setCity((String) in.readObject());
        setProvince((String) in.readObject());
        setZip_code((String) in.readObject());
        setCountry((String) in.readObject());
        setAdditional1((String)in.readObject());
        setAdditional2((String)in.readObject());
        setAdditional3((String)in.readObject());
        setAdditional4((String)in.readObject());
        setAdditional5((String)in.readObject());
    }
}
