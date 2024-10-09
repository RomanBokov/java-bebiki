package org.example.Homework1.Car;

public class Car implements Drivable{
    private String marka;
    private String model;
    private int year;
    private int distanceall =0;
    private boolean status=false;


    public void setYear(int year) {
        this.year = year;
    }


    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getMarka() {
        return marka;
    }

    public int getDistanceall(){
        return this.distanceall;
    }


    @Override
    public void start() {
        this.status = true;
    }

    @Override
    public void stop() {
        this.status = false;

    }

    @Override
    public void drive(int distance) {
        if (status){

            this.distanceall = this.distanceall + distance;
        }
        else {
            System.out.println("Машина выключена , движение не возможно");
        }
    }
}
