class WhatsAppMessage extends Message {

    private String content; // Treść wiadomości

    public WhatsAppMessage(String recipient, String sender, String content) {
        this.recipient = recipient;
        this.sender = sender;
        this.content = content;
    }

    @Override
    public void sendMessage() {
        System.out.println("WhatsApp Message from: " + sender + " to: " + recipient + ". Content: " + content);
    }

}