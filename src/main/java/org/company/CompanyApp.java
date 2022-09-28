package org.company;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyApp {

     private final String FILE_TO_UPLOAD = "src/main/resources/employee.csv";

    public List<Person> read2(){
        try{
            CSVReader reader = new CSVReader(new FileReader(FILE_TO_UPLOAD));

            List<Person> employees = reader.readAll().stream().map(file -> {
                Employee employee = new Employee();
                employee.setFirstName(file[0]);
                employee.setLastName(file[1]);
                employee.setSalary(Double.parseDouble(file[2]));
                return employee;
            }).collect(Collectors.toList());
            return employees;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
