public class Artist {

    String name;
    String date_of_birth;
    Awards awards ;
    String gender;

    public Artist(String name, String date_of_birth, Awards awards, String gender) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.awards = awards;
        this.gender = gender;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_date_of_birth() {
        return date_of_birth;
    }

    public void set_date_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Awards get_awards() {
        return awards;
    }

    public void set_awards(Awards awards) {
        this.awards = awards;
    }

    public String get_gender() {
        return gender;
    }

    public void set_gender(String gender) {
        this.gender = gender;
    }

}
