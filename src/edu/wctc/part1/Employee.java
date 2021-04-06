package edu.wctc.part1;

import com.sun.jdi.LocalVariable;

import java.time.LocalDate;

/**
 * Fix the code in this class to do PROPERTY encapsulation correctly. Also
 * consider if any of the properties should be mandatory and use a constructor
 * to enforce that. Review the tips in the document Encapsulation Checklist if
 * needed.
 */
public class Employee {

    public static final int SSN_LENGTH = 9;

    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private LocalDate orientationDate;

    public Employee()
    {

    }

    public Employee(String _firstName, String _lastName, String _ssn, String _cubeId, LocalDate _orientationDate, boolean metWithHr, boolean metDeptStaff, boolean reviewedDeptPolicies, boolean movedIn)
    {
        setFirstName(_firstName);
        setLastName(_lastName);
        setSSN(_ssn);
        setCubeId(_cubeId);
        setOrientationDate(_orientationDate);
        this.metWithHr = metWithHr;
        this.metDeptStaff = metDeptStaff;
        this.reviewedDeptPolicies = reviewedDeptPolicies;
        this.movedIn = movedIn;
    }

    public void setFirstName(String _first)
    {
        if(_first.length() > 0 || lastName != null)
        {
            firstName = _first;
        }else
        {
            throw new IllegalArgumentException("Invalid Entry.");
        }
    }

    public void setLastName(String _last)
    {
        if(_last.length() > 0 || lastName != null)
        {
            lastName = _last;
        }else
        {
            throw new IllegalArgumentException("Invalid Entry.");
        }
    }

    public void setSSN(String _ssn)
    {
        if(_ssn.length() == SSN_LENGTH || lastName != null)
        {
            ssn = _ssn;
        }else
        {
            throw new IllegalArgumentException("Invalid Entry.");
        }
    }

    public void setCubeId(String _cubeId)
    {
        if(_cubeId.length() > 0 || lastName != null)
        {
            cubeId = _cubeId;
        }else
        {
            throw new IllegalArgumentException("Invalid Entry.");
        }
    }

    public void setOrientationDate(LocalDate _date)
    {
        if(_date.isAfter(LocalDate.now()))
        {
            orientationDate = _date;
        }else
        {
            throw new IllegalArgumentException("Invalid Entry.");
        }
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

    public void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    public void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    public void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
    }

}
