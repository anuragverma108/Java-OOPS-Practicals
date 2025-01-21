// File Name: CitySearch.java

import java.util.HashSet;

public class CitySearch {

    public static void main(String[] args) {
        // Set of cities
        HashSet<String> cities = new HashSet<>();
        cities.add("Kolkata");
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");

        // Check if "Kolkata" exists in the set
        try {
            searchCity(cities, "Kolkata");
            searchCity(cities, "Kochi");  // Example for non-existent city
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method to search for a city in the set
    public static void searchCity(HashSet<String> cities, String cityName) throws NoMatchFoundException {
        // If the city is not found in the set, throw the custom exception
        if (!cities.contains(cityName)) {
            throw new NoMatchFoundException(cityName + " not found in the list of cities.");
        } else {
            System.out.println(cityName + " found in the list.");
        }
    }
}


//javac NoMatchFoundException.java
//javac CitySearch.java

//java CitySearch

