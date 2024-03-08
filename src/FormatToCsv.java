
public class FormatToCsv implements CsvFormatter {

    public String formatToCsvForContact(Contact contact) {
        return "Objet, Email, Message" + "\n" +
                contact.getObjet() +
                "," +
                contact.getEmail() +
                "," +
                contact.getMessage() +
                "\n";

    }

    public String formatToCsvForRegister(Register register) {
        return "Pseudo, Email, Mot de Passe" + "\n" +
                register.getPseudo() +
                "," +
                register.getEmail() +
                "," +
                register.getPassword() +
                "\n";

    }

}

