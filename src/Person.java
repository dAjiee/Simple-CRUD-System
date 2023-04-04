/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alexander
 */
public class Person{
    //Declare Variables
    private String fname, lname, address, position;
    private int id;
    private double allowance;
    
    //Constructor
    Person(String fname, String lname, String address, int id, String position, double allowance){
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.id = id;
        this.position = position;
        this.allowance = allowance;
    }

    //Copy Constructor
    Person(Person P){
        fname = P.fname;
        lname = P.lname;
        address = P.address;
        id = P.id;
        position = P.position;
        allowance = P.allowance;
    }

    //Setters
    public void setFname(String fname){this.fname = fname;}
    public void setLname(String lname){this.lname = lname;}
    public void setAddress(String address){this.address = address;}
    public void setId(int id){this.id = id;}
    public void setPosition(String position){this.position = position;}
    public void setAllowance (double allowance){this.allowance = allowance;}

    //Getters
    public String getFname(){return fname;}
    public String getLname(){return lname;}
    public String getCname(){return fname + " " + lname;}
    public String getAddress(){return address;}
    public int getId(){return id;}
    public String getPosition(){return position;}
    public double getAllowance(){return allowance;}

    //toString
    @Override
    public String toString(){return id + ";" + fname + ";" + lname + ";" + address + ";" + position + ";" + allowance;}

}
