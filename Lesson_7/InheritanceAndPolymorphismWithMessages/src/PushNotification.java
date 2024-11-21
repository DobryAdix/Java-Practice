class PushNotification extends Message {

    public PushNotification(String recipient, String sender) {
        this.recipient = recipient;
        this.sender = sender;
    }

    @Override
    public void sendMessage() {
        System.out.println("Push Notification from: " + sender + " to: " + recipient);
    }

}