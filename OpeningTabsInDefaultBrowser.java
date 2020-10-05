
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class OpenTabs {
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
        urls.add(preprocessor+"gmail.com");
        urls.add(preprocessor+"crio.do");
        urls.add(preprocessor+"github.com");
        urls.add(preprocessor+"google.com");
        return urls.toArray(new String[urls.size()]);
    }
}
