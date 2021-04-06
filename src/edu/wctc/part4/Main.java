package edu.wctc.part4;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the startup class for the program. But together with the other
 * classes provided it is not a particularly good simulation of the real world.
 * Employees don't just hire themselves and them tell themselves to go through
 * orientation. There's usually a company and a HR person involved.
 *
 * Refer to the Employee class for further directions.
 */
public class Main {

    private static List<Company> companies = new ArrayList<>();

    public static void main(String[] args) {
        Company company = new Company("Jeff Inc.");
        company.hireEmployee("Jeff", "Dziadulewicz", "999-999-9999");

        companies.add(company);
    }

}
