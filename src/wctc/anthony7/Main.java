package wctc.anthony7;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here.
        ArrayList<String> fName = new ArrayList<>();
        ArrayList<String> lName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int number = 7;
        int ageNum = 0;
        String name = null;
        String name2 = null;
        Persons person = new Persons();

        int count = 0;
        while(count < 7){
            System.out.println("Enter the first name: ");
            try {
                name = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            fName.add(name);

            System.out.println("Enter the last name: ");
            try {
                name2 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            lName.add(name2);

            System.out.println("Enter an age: ");
            try {
                ageNum = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            age.add(ageNum);
        }
        person = new Persons(name, name2, Integer.parseInt(String.valueOf(age)));
        //Now write a for-loop to iterate over that array and output the full name and age of each of the Person objects stored in that array.
    }
}
