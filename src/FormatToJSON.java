public class FormatToJSON implements JSONFormatter{
    public String formatToJSONForContact(Contact contact) {
        return  "{" + "\n" +
                "'Objet' : '" +
                contact.getObjet() +
                "',"+ "\n" + "'Email' : '" +
                contact.getEmail() +
                "'," + "\n" + "'Message' : '" +
                contact.getMessage() +
                "'" + "\n" + "}" + "\n";

    }

    public String formatToJSONForRegister(Register register) {
        return  "{" + "\n" +
                "'Objet' : '" +
                register.getPseudo() +
                "',"+ "\n" + "'Email' : '" +
                register.getEmail() +
                "'," + "\n" + "'Message' : '" +
                register.getPassword() +
                "'" + "\n" + "}" + "\n";

    }
}
