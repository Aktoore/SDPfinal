public class NotificationFacade {
    private EmailService emailService;
    private SMSService smsService;
    private PushNotificationService pushService;

    public NotificationFacade() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
        this.pushService = new PushNotificationService();
    }

    public void notifyRegistration(User user) {
        emailService.sendEmail(user.getEmail(), "Welcome!");
        smsService.sendSMS(user.getPhone(), "Registration successful");
    }
    public void notifyBooking(User user, String vehicleInfo) {
        System.out.println("Debug: User ID = " + user.getId());
        emailService.sendEmail(user.getEmail(), "Booking confirmed: " + vehicleInfo);
        pushService.sendPush(user.getId(), "Your vehicle is ready!");
    }
}
