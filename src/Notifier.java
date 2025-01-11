// Template Method Deseni: Kullanıcı bildirimleri için
abstract class Notifier {
    public final void notifyAllUsers(String message) {
        prepareNotification();
        sendNotification(message);
        cleanupNotification();
    }

    // Bildirim hazırlığı
    protected abstract void prepareNotification();

    // Bildirim gönderme
    protected abstract void sendNotification(String message);

    // Bildirim sonrası işlem
    protected void cleanupNotification() {
        System.out.println("Bildirim işlemi tamamlandı.");
    }
}