public class Main {

    public static void main(String[] args) {

        System.out.println("Sending Email Only");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Meeting at 10 AM");

        System.out.println();

        System.out.println("Sending Email + SMS");
        Notifier smsNotifier =
                new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Meeting at 10 AM");

        System.out.println();

        System.out.println("Sending Email + SMS + Slack");
        Notifier allNotifier =
                new SlackNotifierDecorator(
                        new SMSNotifierDecorator(
                                new EmailNotifier()));

        allNotifier.send("Meeting at 10 AM");

    }

}