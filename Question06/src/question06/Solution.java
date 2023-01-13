package question06;


	import java.util.Arrays;
	import java.util.List;
	import java.util.TreeMap;

	public class Solution {

	    public static void main(String[] args) {
//	        TreeMap<Country>

	        Country.listingCountry("India", Arrays.asList("UP","UK","MP","JK"));
	        Country.listingCountry("Country1", Arrays.asList("AA1","AA2","AA3"));
	        Country.listingCountry("Country2",Arrays.asList("AA","BB","CC"));
	        System.out.println(Country.getCountries());
	        System.out.println(Country.getCountry("Country1"));
	        System.out.println(Country.getCountryBefore("Country2"));
	        System.out.println(Country.getCountryAfter("Country2"));
	    }
	}


