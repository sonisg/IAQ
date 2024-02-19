package model;

public class Location {

     private Integer location_id;

     private String location_name;

     private String latitude;

     private String longitude;

     private String zipcode;

     public Location(Integer location_id, String location_name, String latitude, String longitude, String zipcode) {
          this.location_id = location_id;
          this.location_name = location_name;
          this.latitude = latitude;
          this.longitude = longitude;
          this.zipcode = zipcode;
     }

     public Integer getLocation_id() {
          return location_id;
     }

     public void setLocation_id(Integer location_id) {
          this.location_id = location_id;
     }

     public String getLocation_name() {
          return location_name;
     }

     public void setLocation_name(String location_name) {
          this.location_name = location_name;
     }

     public String getLatitude() {
          return latitude;
     }

     public void setLatitude(String latitude) {
          this.latitude = latitude;
     }

     public String getLongitude() {
          return longitude;
     }

     public void setLongitude(String longitude) {
          this.longitude = longitude;
     }

     public String getZipcode() {
          return zipcode;
     }

     public void setZipcode(String zipcode) {
          this.zipcode = zipcode;
     }
}
