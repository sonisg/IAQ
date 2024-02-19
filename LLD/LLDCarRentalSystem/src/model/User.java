package model;

public class User {

    private Integer user_id;

    private String name;

    private String phone_no;

    private String email;

    private String drivingLicense;

    private Location location;

    public User(Integer user_id, String name, String phone_no, String email, String drivingLicense, Location location) {
        this.user_id = user_id;
        this.name = name;
        this.phone_no = phone_no;
        this.email = email;
        this.drivingLicense = drivingLicense;
        this.location = location;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
