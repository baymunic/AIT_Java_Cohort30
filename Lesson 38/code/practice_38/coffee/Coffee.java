package practice_38.coffee;

public enum Coffee {
    ESPRESSO_S (3.5, 50),
    ESPRESSO_L (4.0, 150),
    AMERICANO (2.5, 200),
    CAPPUCCINO (4.5, 300),
    LATTE (4.7, 350);

    private double price;
    private int volume;

    Coffee(double price, int volume) {
        this.price = price;
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


}

