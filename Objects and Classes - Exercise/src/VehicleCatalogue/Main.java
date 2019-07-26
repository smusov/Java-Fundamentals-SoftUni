package VehicleCatalogue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

       String input;

       List<Vehicle> vehicles = new ArrayList<>();

       while (!"End".equals(input= read.readLine())){
           String[] data = input.split("\\s+");

           String model = data[0].substring(0,1).toUpperCase()+data[0].substring(1);

           Vehicle vehicle = new Vehicle(model,data[1],data[2],Integer.parseInt(data[3]));
           vehicles.add(vehicle);
       }

       while (!"Close the Catalogue".equals(input=read.readLine())){

           for (Vehicle vehicle : vehicles) {
               if (input.equals(vehicle.getModel())) {
                   System.out.println(vehicle.toString());
                   break;
               }
           }
       }

       Vehicle vehicle = new Vehicle();

       System.out.printf("Cars have average horsepower of: %.2f.\n",vehicle.getAveragePower("Car",vehicles));
       System.out.printf("Trucks have average horsepower of: %.2f.\n",vehicle.getAveragePower("Truck",vehicles));
   }
}
