abstract public class Message {

    // https://www.w3schools.com/java/java_abstract.asp

    protected String recipient; // Odbiorca wiadomości
    protected String sender;    // Nadawca wiadomości

    // Metoda abstrakcyjna do wysyłania wiadomości
    public abstract void sendMessage();

}
