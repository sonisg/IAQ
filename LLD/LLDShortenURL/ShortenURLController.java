package LLDShortenURL;

import java.util.Map;
import java.util.Random;

public class ShortenURLController {

    private static final String CHARACTERS = "abcdefghijkl/mnopqrstuvwxyz/ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int SHORT_URL_LENGTH = 5;

    ShortenURLDB shortenURLDB = new ShortenURLDB();
  public String shortURL(String longUrl){
      if (shortenURLDB.getLongToShortMap().containsKey(longUrl)) {
          return shortenURLDB.getLongToShortMap().get(longUrl);
      }

      String shortURL = generateShortURL();
      shortenURLDB.getLongToShortMap().put(longUrl, shortURL);
      shortenURLDB.getShortToLongMap().put(shortURL, longUrl);
      return shortURL;
  }

    private String generateShortURL() {
      StringBuilder sb = new StringBuilder();
      sb.append("/short/");
        Random random = new Random();
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return sb.toString();
    }

    public String redirectURL(String shortUrl){
      String s = shortenURLDB.getShortToLongMap().get(shortUrl);
      return s;
    }
}
