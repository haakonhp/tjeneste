package no.hiof.softeng2022gruppe23.tjenestedk.classes.users;

import no.hiof.softeng2022gruppe23.tjenestedk.classes.db.JsonFileHandler;

public abstract class User extends JsonFileHandler {

    String firstName;
    String lastName;
    String password;
    String address;
    String email;
    int phoneNumber;
    String profilePicture;

    protected User() {}

    protected User(String firstName, String lastName, String password, String address, String email, int phoneNumber, String profilePicture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profilePicture = profilePicture;

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


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;

    }
}
