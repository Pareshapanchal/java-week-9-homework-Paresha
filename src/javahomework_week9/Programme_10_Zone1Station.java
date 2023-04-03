package javahomework_week9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**10. Write a programme that tells you which line passes through particular stations.
 Just use Zone 1 stations name.
 *
 */
public class Programme_10_Zone1Station {
    //Main method created
    public static void main(String[] args) {
        //HasMap object created called zone1Station
        Map<String, ArrayList<String>> zone1Station = new HashMap<String, ArrayList<String>>();
        String nameOfStation;
// adding multiple values to single key
        zone1Station.put("Aldgate",new ArrayList<String>());
        zone1Station.get("Aldgate").add("Circle Line");
        zone1Station.get("Aldgate").add("Materopolitan Line");
        zone1Station.put("BakerStreet", new ArrayList<String>());
        zone1Station.get("BakerStreet").add("Bakerloo Line");
        zone1Station.get("BakerStreet").add("Circle Line");
        zone1Station.get("BakerStreet").add("Hammersmith and City Line");
        zone1Station.get("BakerStreet").add("Jubilee Line");
        zone1Station.get("BakerStreet").add("Metropolitan line");
        zone1Station.put("BondStreet", new ArrayList<String>());
        zone1Station.get("BondStreet").add("Central Line");
        zone1Station.get("BondStreet").add("Elixabeth Line");
        zone1Station.get("BondStreet").add("Jubilee Line");
        zone1Station.put("EustonStation",new ArrayList<String>());
        zone1Station.get("EustonStation").add("Northen Line");
        zone1Station.get("EustonStation").add("Victoria Line");
        zone1Station.get("EustonStation").add("London OverGround");


        System.out.println("Zone 1 Station List: Aldgate , BakerStreet, BondStreet, EustonStation");
        System.out.println("-----------------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);// scanner objcet created
        System.out.print("Enter Station: ");// read the particular station form zone1
          nameOfStation = scanner.next();
        // containskey will find the station from key set and print multiple values from that key
          if(zone1Station.containsKey(nameOfStation)) {
              System.out.println("Passing line " + zone1Station.get(nameOfStation));
          }
          else {
              System.out.println("This station is not in zone1");
          }
        scanner.close();

    }
}
