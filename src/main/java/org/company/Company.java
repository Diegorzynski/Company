package org.company;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private CompanyApp app = new CompanyApp();
    private List<Person> employeeList = new ArrayList<>();

    public void add(){
        app.read2().stream().forEach(employeeList::add);
    }

    public void getInfo(){
        employeeList.stream().forEach(System.out::println);
    }

}
