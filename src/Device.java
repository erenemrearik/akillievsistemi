// Akıllı cihaz sınıfı
class Device {
    private final String name;
    private boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false; // Varsayılan durum kapalı
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void toggle() {
        isOn = !isOn; // Cihaz durumunu değiştir
    }

    public void turnOff() {
        isOn = false; // Cihazı kapat
    }
}