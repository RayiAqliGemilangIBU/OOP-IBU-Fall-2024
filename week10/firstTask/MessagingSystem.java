package week10.firstTask;

public class MessagingSystem {

    @CanSendMessage
    @RequiresPermission(2)
    public void sendMessage(Admin user, String message) {
        System.out.println("Message sent by user " + user.getUsername() + ": " + message);
    }

    public void sendMessage(User user, String message) {
        System.out.println("Restricted");
    }

    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();

        User regularUser = new User("Ucok");
        Admin privilegedUser = new Admin ("Axel");

        messagingSystem.sendMessage(regularUser, "Hello!");
        messagingSystem.sendMessage(privilegedUser, "Hi there!");
    }
}
