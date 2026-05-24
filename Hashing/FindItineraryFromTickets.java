package Hashing;

import java.util.HashMap;

/*
"Chennai" -> "Bengaluru"
"Mumbai" -> "Delhi"
"Goa" -> "Chennai"
"Delhi" -> "Goa"

Output - "Mumbai" -> "Delhi" -> "Goa" -> "Chennai" -> "Bengaluru"
*/
public class FindItineraryFromTickets {

    public static String getStart(HashMap<String, String> map) {
        /*HashMap<String, String> revMap = new HashMap<>();

        for (String key : map.keySet()) {
            revMap.put(map.get(key),key);
        }*/

        for (String key : map.keySet()) {
            if(!map.containsValue(key)){
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String>  tickets = new HashMap<String, String>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while(start != null){
            System.out.print(start);

            if(tickets.containsKey(start)) {
                System.out.print("->");
            }

            start = tickets.get(start);
        }
    }
}