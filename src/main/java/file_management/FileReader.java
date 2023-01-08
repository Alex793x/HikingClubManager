package file_management;

import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {

    public void readMembershipFile() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("membershipfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readPersonFile() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("personfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readEmployeeFile() {
        try (BufferedReader reader = new BufferedReader(new java.io.FileReader("employee.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
