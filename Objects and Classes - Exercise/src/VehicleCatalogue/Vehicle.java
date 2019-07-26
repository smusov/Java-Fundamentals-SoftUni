package VehicleCatalogue;

import java.util.List;

public class Vehicle {
private String type;
private String model;
private String color;
private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public Vehicle() {
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getAveragePower(String type , List<Vehicle>vehicles){
        int count = 0;
        double sum = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.type.equals(type)){
                count++;
                sum+=vehicle.horsepower;
            }
        }

        if (sum!=0){
            sum/=count;
        }

        return sum;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\nModel: %s\nColor: %s\nHorsepower: %d",type,model,color,horsepower);
    }
}
