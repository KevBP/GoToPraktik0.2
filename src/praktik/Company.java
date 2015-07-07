package praktik;

import javafx.beans.property.SimpleStringProperty;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Company implements Externalizable {
    private final SimpleStringProperty companyName = new SimpleStringProperty();
    private final SimpleStringProperty activities = new SimpleStringProperty();
    private final SimpleStringProperty phone = new SimpleStringProperty();
    private final SimpleStringProperty mail = new SimpleStringProperty();
    private final SimpleStringProperty website = new SimpleStringProperty();
    private final SimpleStringProperty state = new SimpleStringProperty();

    public Company() {
        this("", "", "", "", "", "");
    }

    public Company(String companyName, String activities, String phone, String mail, String website, String state) {
        this.companyName.set(companyName);
        this.activities.set(activities);
        this.phone.set(phone);
        this.mail.set(mail);
        this.website.set(website);
        this.state.set(state);
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

    @Override
    public String toString() {
        return "praktik.Company{" +
                "companyName=" + companyName +
                ", activities=" + activities +
                ", phone=" + phone +
                ", mail=" + mail +
                ", website=" + website +
                ", state=" + state +
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
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setCompanyName((String)in.readObject());
        setActivities((String) in.readObject());
        setPhone((String) in.readObject());
        setMail((String) in.readObject());
        setWebsite((String) in.readObject());
        setState((String) in.readObject());
    }
}
