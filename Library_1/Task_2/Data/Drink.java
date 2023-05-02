package Library_1.Task_2.Data;

public class Drink {

    private String name;
    private Double volume;
    private Double temperature;
    private Integer price;

    public Drink(String name, Double volume, Double temperature, Integer price) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Наименование позиции: %s %nОбъем: %.2f %nТемпература: %.2f %nЦена: %d %n",  name, volume, temperature, price);
    }
    
}
