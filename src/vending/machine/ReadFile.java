package vending.machine;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    private String tempPass;

    public void setTempPass(String chestie) {
        this.tempPass = chestie;
    }

    public String getTempPass() {
        return this.tempPass;
    }

    public boolean read(TextField nume, PasswordField pass) {
        try {
            File myObj = new File("@adminaccounts.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (nume.getText().equals(data)) {
                    String data2 = myReader.nextLine();
                    if (pass.getText().equals(data2)) {
                        return true;
                    }
                }
            }
            myReader.close();
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean readPass(PasswordField pass) {
        try {
            File myObj1 = new File("@adminaccounts.txt");
            Scanner myReader2 = new Scanner(myObj1);
            while (myReader2.hasNextLine()) {
                String data = myReader2.nextLine();
                if (pass.getText().equals(data)) {
                    return true;
                }
            }

            myReader2.close();
            return false;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public static void addUser(String a, String b) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("@adminaccounts.txt", true)  //Set true for append mode
        );
        writer.newLine();   //Add new line
        writer.write(a);
        writer.newLine();
        writer.write(b);
        writer.close();
    }
    public static void addData() throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("@DataOutput.txt", true)
        );
        writer.newLine();   //Add new line
        writer.write("Data to be downloaded.");
        writer.newLine();
        writer.write("Work in progress...");
        writer.close();
    }

}