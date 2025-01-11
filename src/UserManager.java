import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Kullanıcı bildirimleri için somut sınıf
class UserManager extends Notifier {
    private static final UserManager INSTANCE = new UserManager();
    private final List<String> users = new ArrayList<>();

    private UserManager() {}

    public static UserManager getInstance() {
        return INSTANCE;
    }

    public void addUser(Scanner scanner) {
        System.out.print("Kullanıcı adını girin: ");
        String userName = scanner.nextLine().trim();
        if (!userName.isEmpty()) {
            users.add(userName);
            System.out.println("Kullanıcı eklendi: " + userName);
        } else {
            System.out.println("Kullanıcı adı boş olamaz.");
        }
    }

    @Override
    protected void prepareNotification() {
        System.out.println("Kullanıcılara bildirim gönderiliyor...");
    }

    @Override
    protected void sendNotification(String message) {
        for (String user : users) {
            System.out.println(user + " bilgilendirildi: " + message);
        }
    }
}