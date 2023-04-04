/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alexander
 */
public class Sanitize {
    //Sanitize String
    public static String sanitize(String str) {
        int counter = 0;
        str.trim();
        String[] arr = str.split(" ");
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
            if (arr[i].isBlank()) {continue;}
            counter++;
            arr[i] = getProperStringCasing(arr[i]);
            if (counter == 1) {
                res += arr[i];
                continue;}
            res += (" " + arr[i]);}
        return res;
    }

    //Proper Casing for String
    private static String getProperStringCasing(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
