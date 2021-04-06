package edu.wctc.part4;

public class Company {

    private HumanResources hR;
    private String name;

    public Company(String name)
    {
        hR = new HumanResources();

    }

    public void hireEmployee(String first, String last, String ssn)
    {
        hR.hireEmployee(first, last, ssn);
        hR.employeeReport(ssn);
    }

}
