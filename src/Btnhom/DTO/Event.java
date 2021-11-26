package Btnhom.DTO;

public class Event {
    private int id, discount;
    private String name, start, end;

    public Event(int id, String name, int discount, String start, String end) {
        this.id = id;
        this.discount = discount;
        this.name = name;
        this.start = start;
        this.end = end;
    }
    
    public Event() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    
    
}
