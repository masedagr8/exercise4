import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 0;
        String city = "job";
        ArrayList<String> cities = new ArrayList<>();
        ArrayList<Double> averagesList = new ArrayList<>();
        while (!(city.equals("END"))) {

            Scanner myObj = new Scanner(System.in);
            System.out.println("what is the city");
            city = myObj.nextLine();
            cities.add(city);
            num++;
        }
        cities.remove("END");
        num=num-1;

        //ArrayList<Double> averagesList = new ArrayList<>();
        int nums = 0;

        while (nums != num){
            int o = 0;
            ArrayList<Double> temperature = new ArrayList<>();
            while (o != 5) {

                Scanner myObj = new Scanner(System.in);
                System.out.println("what is the temperature of " + cities.get(nums));
                Double temp = Double.valueOf(myObj.nextLine());
                temperature.add(temp);
                o++;
            }
            double aver = temperature.get(0) + temperature.get(1) + temperature.get(2) + temperature.get(3) + temperature.get(4);
            double average = aver / 5;
            System.out.println(average);
            averagesList.add(average);
            nums++;
        }
        System.out.println(cities);
        System.out.println(averagesList);
        Map<ArrayList<String>, ArrayList<Double>> capitalCities = new HashMap<>();
        capitalCities.put(cities,averagesList);
        System.out.println(capitalCities);








    }




}