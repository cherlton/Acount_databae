/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

/**
 *
 * @author Student
 */
@Entity
@Table(name="AccountHolder_TBL")
@SecondaryTables({
        @SecondaryTable(name = "Contacts_TBL"),
            @SecondaryTable(name="Address_TBL")
})
public class AcountClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="name",nullable = false , length=50)
    private String name;
    @Column(table = "Address_TBL",name="street",nullable = true,length = 20)
    private String street;
    @Column(table = "Address_TBL",name="city",nullable = true,length = 20)
    private String city;
    @Column(table = "Address_TBL",name="code",nullable = true,length = 20)
    private String code;
     @Column(table = "Contacts_TBL",name="cellNo",nullable = true,length = 20)
     private String cellNo;
     @Column(table = "Contacts_TBL",name="emailAddress",nullable = true,length = 20)
     private String emailAddress;
     @Column(name="balance",nullable = false,length = 20)
     private double balance;

    public AcountClass() {
    }

    public AcountClass(Long id, String name, String street, String city, String code, String cellNo, String emailAddress, double balance) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.city = city;
        this.code = code;
        this.cellNo = cellNo;
        this.emailAddress = emailAddress;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCellNo() {
        return cellNo;
    }

    public void setCellNo(String cellNo) {
        this.cellNo = cellNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcountClass)) {
            return false;
        }
        AcountClass other = (AcountClass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.entities.Acount[ id=" + id + " ]";
    }
    
}
