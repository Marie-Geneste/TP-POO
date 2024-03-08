import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contact toto = new Contact();
        Register marie = new Register();

        CsvFormatter csvFormatter = new FormatToCsv();
        HTMLFormatter htmlFormatter = new FormatToHTML();
        JSONFormatter jsonFormatter = new FormatToJSON();

        System.out.println(csvFormatter.formatToCsvForContact(toto));
        System.out.println(htmlFormatter.formatToHTMLForContact(toto));
        System.out.println(jsonFormatter.formatToJSONForContact(toto));

        System.out.println(csvFormatter.formatToCsvForRegister(marie));
        System.out.println(htmlFormatter.formatToHTMLForRegister(marie));
        System.out.println(jsonFormatter.formatToJSONForRegister(marie));
    }

}

