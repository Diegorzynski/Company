package org.company;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private final CompanyApp app = new CompanyApp();
    private final List<Person> employeeList = new ArrayList<>();

    public void add(){
        employeeList.addAll(app.read());
    }

    public void getInfo(){
        employeeList.forEach(System.out::println);
    }
}
