package Interview;

import Interview.ObjectsTemp.Vehicle;

import java.util.HashMap;

public class StreamsMap {

    public static void main(String[] args) {

        HashMap<Integer, Vehicle> vehicleMap=new HashMap<>();
        vehicleMap.put(1,new Vehicle(1,"abc1234",24));
        vehicleMap.put(2,new Vehicle(2,"axyz676",5));
        vehicleMap.put(3,new Vehicle(111,"uyt",45));

        vehicleMap.entrySet().stream().map(e->e.getValue()).filter(p->p.getAge()>5).forEach(x-> System.out.println(x.getVehicleNumber()));

    }


}
