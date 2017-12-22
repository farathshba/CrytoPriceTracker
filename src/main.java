import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main
{
    public static void getbitfinexupdate(String url)
    {
        try
        {
            URL _url = new URL(url);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(_url.openStream(), "UTF-8"))) {
                for (String line; (line = reader.readLine()) != null;)
                {
                    System.out.println(line);
                }
            }
        }
        catch(Exception error)
        {

        }
    }

    public static void main(String args[])
    {
        //  Last Price, Volume and Time
        //  All coins on BitThumb
        getbitfinexupdate("https://api.bitfinex.com/v1/pubticker/btcusd");

    }
}
