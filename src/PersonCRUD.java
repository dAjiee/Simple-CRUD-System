/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alexander
 */
import java.util.ArrayList;

public class PersonCRUD {
    //Create ArrayList
    private ArrayList<Person> list;

    //Constructor
    PersonCRUD(){list = new ArrayList<>();}

    //Create
    public Person create(String fname, String lname, String address, int id, String position, double allowance){
        Person person = new Person(fname, lname, address, id, position, allowance);
        list.add(person);
        return person;
    }

    //Read
    public Person read(int id){
        for(Person person : list)
            if(person.getId() == id) return person;
        return null;
    }

    //Update
    public Person update(int id, int choice, String newFname, String newLname, String newAddress, int newID, String newPosition, double newAllowance){
        Person person = read(id);
        if(person != null){
            switch(choice){
                case 0:
                    person.setFname(newFname);
                    break;
                case 1:
                    person.setLname(newLname);
                    break;
                case 2:
                    person.setAddress(newAddress);
                    break;
                case 3:
                    person.setId(newID);
                    break;
                case 4:
                    person.setPosition(newPosition);
                case 5:
                    person.setAllowance(newAllowance);
                case 6:
                    Person temp = new Person(newFname, newLname, newAddress, newID, newPosition, newAllowance);
                    person = new Person(temp);
                    break;
            }
        return person;
        }
        return null;
    }

    //Delete
    public Person delete(int id){
        Person person = read(id);
        if(person != null){
            list.remove(person);
            return person;}
        return null;
    }

    //Getter
    public ArrayList<Person> getList(){return list;}
}

