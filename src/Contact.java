import java.util.HashMap;

public class Contact {
    private String objet;
    private String email;
    private String message;

    public Contact(){
        this.objet = "Candidature";
        this.email = "toto@toto.fr";
        this.message = "Bonjour, blabla ! Cordialement.";
    }

    public String getObjet() {
        return objet;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }
}
