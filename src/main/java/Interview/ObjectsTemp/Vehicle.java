package Interview.ObjectsTemp;

public class Vehicle {

    private int Id;
    private String vehicleNumber;
    private int Age;

    public Vehicle(int Id,String vehicleNumber,int Age){
        this.Id=Id;
        this.vehicleNumber=vehicleNumber;
        this.Age=Age;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }




}
