
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Trial {
    public static void main(String[] args) throws IOException {
//        String os = System.getProperty("os.name").toLowerCase();
        Runtime rt = Runtime.getRuntime();
        for(String str : getUrl())
        rt.exec(str);//Execute any command on commandline from here
    }
    public static String[] getUrl() {
        List<String> urls = new ArrayList<>();
        String preprocessor = "xdg-open "; // This is for linux Terminal
        //Add/Delete Any link you want that will be opened in a new Tab in your default browser 
        urls.add(preprocessor+"https://docs.google.com/document/d/1WQI3C5fAJgGeIsWvko2Qj3HHIckhp0EngjU51Rvh6fU/edit?ts=5f7068b1#");
        urls.add(preprocessor+"https://docs.google.com/document/d/1v4IRmZVvyk8cGIcLAB-QEyUs97KLQYYOj7EDg1W5FtM/edit#");
        urls.add(preprocessor+"https://app.bitly.com/Bk718WLeebc/bitlinks/2GmxZSm");
        urls.add(preprocessor+"https://datastudio.google.com/u/0/reporting/701f2d45-eb30-434e-930e-d5c7a8dc22bd/page/ahkcB?s=nensMQ4lBPg");
        urls.add(preprocessor+"https://learn.crio.do/home");
        return urls.toArray(new String[urls.size()]);
    }
}
