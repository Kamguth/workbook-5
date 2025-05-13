package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset{
    private String makeModel;
   private int year, odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
  public double getValue() {
        int currentYear = Year.now().getValue();
        int age = currentYear - year;
        double value;


      if (age <= 3) {
          value = getOriginalCost() - (getOriginalCost() * 0.03 * age);
      } else if (age <= 6) {
          value = getOriginalCost() - (getOriginalCost() * 0.06 * age);
      } else if (age <= 10) {
          value = getOriginalCost() - (getOriginalCost() * 0.08 * age);
      } else {
          value = 1000.0;
      }

      if (odometer > 100000 &&
              !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
          value *= 0.75;
      }

      return value;
        }

  }


