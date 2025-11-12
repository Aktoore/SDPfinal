public class PushNotificationService {
    public void sendPush(String userID, String message){
        System.out.println("Push notification sent to: " + userID);
        System.out.println("Message: " + message);
    }
}
