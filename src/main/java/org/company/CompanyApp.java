package org.company;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class CompanyApp {

    private final String FILE_TO_UPLOAD = "src/main/resources/employee.csv";

    public List<Person> read(){
        try{
            CSVReader reader = new CSVReader(new FileReader(FILE_TO_UPLOAD));

            List<Person> employees = reader.readAll().stream().map(emplList -> {
                Employee employee = new Employee();
                employee.setFirstName(emplList[0]);
                employee.setLastName(emplList[1]);
                employee.setSalary(Double.parseDouble(emplList[2]));
                return employee;
            }).collect(Collectors.toList());
            return employees;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
