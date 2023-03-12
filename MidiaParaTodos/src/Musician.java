public class Musician extends Artist  {
    String actuation;

    public Musician(String name, String date_of_birth, Awards awards, String gender, String actuation) {
        super(name, date_of_birth, awards, gender);
        this.actuation = actuation;
    }

    public String get_actuation() {
        return actuation;
    }

    public void set_actuation(String actuation) {
        this.actuation = actuation;
    }
}
