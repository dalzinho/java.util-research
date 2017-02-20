import java.util.Locale;
import java.util.Currency;
import java.util.ArrayList;

public class LocalExample{


  static Locale uk = Locale.UK;
  static Console console = new Console();
  static ArrayList<Locale> locales = new ArrayList<Locale>();
  static Currency currency;

  public static void main(String[] args) {
    locales.add(Locale.UK);
    locales.add(Locale.CANADA);
    locales.add(Locale.CHINA);
    locales.add(Locale.FRANCE);
    locales.add(Locale.ITALY);
    locales.add(Locale.JAPAN);


    for(Locale locale : locales){
      currency = Currency.getInstance(locale);
      console.display("Country Name: " + locale.getCountry());
      console.display("Country Display Name: " + locale.getDisplayCountry());
      console.display("Language: " + locale.getDisplayLanguage());
      console.display("Currency: " + currency.getDisplayName());
      console.display("Currency Symbol: " + currency.getSymbol());
      console.display("------------------------------");

    }
  }
}