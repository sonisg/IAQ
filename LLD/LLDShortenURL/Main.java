package LLDShortenURL;

public class Main {

    public static void main(String[] args) {
        ShortenURLController urlShortener = new ShortenURLController();
        String longURL = "https://www.geeksForgeeks.com";
        String shortURL = urlShortener.shortURL(longURL);
        System.out.println("Shortened URL: " + shortURL);
        System.out.println("Original URL: " + urlShortener.redirectURL(shortURL));
    }
}
