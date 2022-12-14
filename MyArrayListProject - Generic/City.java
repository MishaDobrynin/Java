/**
 * Write a description of class City here.
 *
 * @author Misha Dobrynin
 * @version Nov 21, 2022
 */
public class City implements Comparable<City>{
    String name;
    int population;
    String country;
    public City(String name, int population, String country){
        this.name = name;
        this.population = population;
        this.country = country;
    }
    public String getName(){
        return name;
    }
    public String toString(){
        String s = "Name: " + this.name;
        s += "\nPopulation: " + this.population;
        s += "\nCountry: " + this.country;
        return s;
    }
    @Override
    public int compareTo(City other){
        //return this.hashCode() - other.hashCode();
        if(this.name.equals(other.name)){
            return country.compareTo(other.country);
        }
        return name.compareTo(other.name);
    }
}