public class Auto {
    private int id;

    public Auto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                '}';
    }
}
