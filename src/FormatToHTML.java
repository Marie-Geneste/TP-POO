public class FormatToHTML implements HTMLFormatter{
    public String formatToHTMLForContact(Contact contact) {
        return "<h1>" +
                contact.getObjet() +
                "</h1>" + "\n" +
                "<p>" +
                contact.getEmail() +
                "</p>" + "\n" +
                "<p>" +
                contact.getMessage() +
                "</p>" + "\n";

    }

    public String formatToHTMLForRegister(Register register) {
        return "<p>" +
                register.getPseudo() +
                "</p>" + "\n" +
                "<p>" +
                register.getEmail() +
                "</p>" + "\n" +
                "<p>" +
                register.getPassword() +
                "</p>" + "\n";

    }
}
