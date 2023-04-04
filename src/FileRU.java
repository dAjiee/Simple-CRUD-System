/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alexander
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FileRU {
    private String filename;

    FileRU(String filename){
        this.filename = filename;
    }
    //reader
    public void read(PersonCRUD person){
        try (BufferedReader bufferedreader = new BufferedReader(new FileReader(filename))){
            String line;
            while((line = bufferedreader.readLine()) != null){
                if(line.isEmpty() || line.isBlank() || line.charAt(0) == ';'){continue;}
                String[] arr = line.split(";");
                int id = Integer.parseInt(arr[0]);
                String FName = Sanitize.sanitize(arr[1]);
                String LName = Sanitize.sanitize(arr[2]);
                String Address = Sanitize.sanitize(arr[3]);
                String position = Sanitize.sanitize(arr[4]);
                double allowance = Double.parseDouble(arr[5]);
                person.create(FName, LName, Address, id, position, allowance);
            }
        }
        catch(IOException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error Reading File!", "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }

    //writer
    public void write(PersonCRUD person){
        try (FileWriter filewriter = new FileWriter(filename)) {
            for(Person list : person.getList()){
                filewriter.write(list.getId() + ";" + list.getFname() + ";" + list.getLname() + ";" + list.getAddress() + ";" + list.getPosition() + ";" + list.getAllowance() + System.lineSeparator());}
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error Updating File!", "Error!", JOptionPane.ERROR_MESSAGE);
            System.exit(0);}
    }
}

