import java.util.PriorityQueue;
import java.util.ArrayList;

public class Prioritas {
    private PriorityQueue<Pojo> scheduleQueue;

    public Prioritas() {
        this.scheduleQueue = new PriorityQueue<>();
    }
    
    public void terimaPaket(int id, String name, int date, String type, String alamat) {
        this.scheduleQueue.add(new Pojo(id, type, name, date, alamat));
    }

    public Pojo getNextSchedule() {
        return this.scheduleQueue.poll();
    }
    
    public void listJadwal() {
        ArrayList<Pojo> schedules = new ArrayList<>();

        while (!this.scheduleQueue.isEmpty()) {
            schedules.add(this.scheduleQueue.poll());
        }

        for (Pojo schedule : schedules) {
            System.out.println(schedule);
        }
    }
}
