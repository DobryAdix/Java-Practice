public class Main {
    public static void main(String[] args) {

        // // Exercise 1: Inheritance and Polymorphism with Messages

        // Tablica obiektów Message
        Message[] messages = new Message[] {
                new PushNotification("Marta", "System"),
                new WhatsAppMessage("Ryszard", "Marta", "Hello Ryszard!")
        };

        // Przechodzenie przez tablicę i wywoływanie sendMessage()
        for (Message message : messages) {
            message.sendMessage();
        }

    }
}