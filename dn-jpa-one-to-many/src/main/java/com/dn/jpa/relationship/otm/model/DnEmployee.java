package com.dn.jpa.relationship.otm.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "dn_employees")
public class DnEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "first_name")
    @Size(max = 65)
    private String firstName;

    @NotNull
    @Column(name = "last_name")
    @Size(max = 65)
    private String lastName;

    @Column(name = "salary")
    private Double salary;

    @Temporal(TemporalType.DATE)
    @Column(name = "doj")
    private Date dateOfJoin;

    @Temporal(TemporalType.DATE)
    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "city")
    private String city;

    @Column(name = "description")
    private String description;

    public DnEmployee() {
    }

    public DnEmployee(String firstName,String lastName, Double salary, Date dateOfJoin, Date dateOfBirth, String city, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.dateOfJoin = dateOfJoin;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.description = description;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
