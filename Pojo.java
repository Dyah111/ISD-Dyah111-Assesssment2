public class Pojo implements Comparable<Pojo> {

    private int id;
    private String type;
    private String name;
    private int date;
    private String alamat;

    public Pojo(int id, String type, String name, int date, String alamat) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.date = date;
        this.alamat = alamat; 
    }
    public int durasi() {
        switch (type) {
            case "Biasa":
            return 4;
            case "Express":
            return 3;
            case "Kilat":
            return 2;
            case "Same Day":
            return 1;
            default:
            return 0;
        }
    }

    public void getId(int id) {
        this.id = id;
    }
    public void getType(String type) {
        this.type = type;
    }
    public void getName(String name) {
        this.name = name;
    }
    public void getDate(int date) {
        this.date = date;
    }
    public void getAlamat(String alamat) {
        this.alamat = alamat;
    }
    @Override 
    public String toString() {
        return "ID paket: " + id + " " + "Nama pelanggan: " + name + " " + "Alamat pelanggan: " + alamat;
    }
    @Override
    public int compareTo(Pojo other) {
        int result = this.durasi() + this.date;
        int otherResult = other.durasi() + other.date;

        if (result < otherResult) {
            return -1;
        } else if (result > otherResult) {
            return 1;
        } else {
            return 0;
        }
    }
}