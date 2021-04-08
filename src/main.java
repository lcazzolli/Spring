import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class main {
    public static boolean urlValidator(String url)
    {
        /*validación de url*/
        try {
            new URL(url).toURI();
            return true;
        }
        catch (URISyntaxException exception) {
            return false;
        }
        catch (MalformedURLException exception) {
            return false;
        }
    }
    public static void main(String[] args)
    {
       /* String url = "https://www.javadesdecero.es/";
        /* validar la url
        if (urlValidator(url))
            System.out.print("La url dada " + url + " es válida");
        else
            System.out.print("La url dada " + url + " no es válida");*/

        String price = "$12.000.000";
        int priceInt=0;
        System.out.println(price.substring(1,price.length()));

        priceInt=Integer.parseInt(price.substring(1,price.length()).replace(".",""));

        System.out.println(priceInt);

    }
}
