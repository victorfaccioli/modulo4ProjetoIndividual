public class Awards {

    String award;
    int year;

    public Awards(String award, int year) {
        this.award = award;
        this.year = year;
    }

    public String get_award() {
        return award;
    }

    public void set_award(String award) {
        this.award = award;
    }

    public int get_year() {
        return year;
    }

    public void set_year(int year) {
        this.year = year;
    }
}
