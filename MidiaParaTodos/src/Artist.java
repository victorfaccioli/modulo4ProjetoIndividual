public class Artist {

    String name;
    String date_of_birth;
    String awards;
    String gender;

    public Artist(String name, String date_of_birth, String awards, String gender) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.awards = awards;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAwards() {
        return awards;
    }

    public void setAwards(String awards) {
        this.awards = awards;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
