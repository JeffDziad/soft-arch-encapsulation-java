package edu.wctc.part4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HumanResources {

    private List<Employee> companyEmployees = new ArrayList<>();

    public HumanResources(){}

    public void hireEmployee(String first, String last, String ssn)
    {
        Employee newEmployee = new Employee(first, last, ssn);
        companyEmployees.add(newEmployee);
        employeeOrientation(newEmployee);
    }

    private void employeeOrientation(Employee e)
    {
        Random random = new Random();
        e.doFirstTimeOrientation(String.format("%04d", random.nextInt(10000)));
    }

    public void employeeReport(String ssn)
    {
        for(Employee e : companyEmployees)
        {
            if(e.getSsn().equals(ssn))
            {
                if(e.hasMetWithHr() && e.hasMetDeptStaff() && e.hasReviewedDeptPolicies() && e.hasMovedIn())
                {
                    e.printReport();
                }
                break;
            }
        }
    }

}
