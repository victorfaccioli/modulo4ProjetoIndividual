public class Actor extends Artist {

    String formation;

    public Actor(String name, String date_of_birth, Awards awards, String gender, String formation) {
        super(name, date_of_birth, awards, gender);
        this.formation = formation;
    }

    public String get_formation() {
        return formation;
    }

    public void set_formation(String formation) {
        this.formation = formation;
    }
}

