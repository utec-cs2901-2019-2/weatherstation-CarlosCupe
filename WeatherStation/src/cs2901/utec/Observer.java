
public interface Observer {
    int id;

    public static void main (int id_t) {
        id = id_t;
    }

    public int getId () {
        return id;
    }

    public void update () {
    }
}
