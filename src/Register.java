public class Register {
    private String pseudo;
    private String email;
    private String password;

    public Register(){
        this.pseudo = "Marie";
        this.email = "marie@marie.fr";
        this.password = "password";
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
