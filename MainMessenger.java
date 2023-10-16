//task-7
interface Messenger {
    void sendMessage(String message);
}

class EmailMessenger implements Messenger {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSMessenger implements Messenger {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class MessageSender {
    private Messenger messenger;

    public MessageSender(Messenger messenger) {
        this.messenger = messenger;
    }

    public void send(String message) {
        messenger.sendMessage(message);
    }
}

public class MainMessenger {
    public static void main(String[] args) {
        Messenger emailMessenger = new EmailMessenger();
        MessageSender emailSender = new MessageSender(emailMessenger);

        Messenger smsMessenger = new SMSMessenger();
        MessageSender smsSender = new MessageSender(smsMessenger);

        emailSender.send("Hello, this is an email!");
        smsSender.send("Hello, this is an SMS!");
    }
}
