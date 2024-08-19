package com.hsbc.hospitalmanagement.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder

public class Person {
    protected long perosnId;
    //autowiring at field level
    @Autowired(required = false)
    protected   Fullname fullName;
@Autowired(required = false)
    protected LocalDate dob;

//    public Person() {
//    }
//
//    public Person(long perosnId, FullName fullName, Date dob) {
//        this.perosnId = perosnId;
//        this.fullName = fullName;
//        this.dob = dob;
//    }
//
//    public Person(long perosnId) {
//        this.perosnId = perosnId;
//    }
//
//    public Person(FullName fullName) {
//        this.fullName = fullName;
//    }
//
//    public Person(Date dob) {
//        this.dob = dob;
//    }
//
//    public long getPerosnId() {
//        return perosnId;
//    }
//
//    public void setPerosnId(long perosnId) {
//        this.perosnId = perosnId;
//    }
//
//    public FullName getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(FullName fullName) {
//        this.fullName = fullName;
//    }
//
//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//                "perosnId=" + perosnId +
//                ", fullName=" + fullName +
//                ", dob=" + dob +
//                '}';
//    }
}
