package com.alphonsa.school_admission_server.model;

import com.alphonsa.school_admission_server.dao.StudentData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import java.util.Objects;

public class RequestDTO {
    private String regNo;
    private String firstName;
    private String middleName;
    private String lastName;
    private String placeOfBirth;
    private String whatsapp;
    private String caste;
    private String subcaste;
    private String dob; // Consider using LocalDate for date representation
    private String gender;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String sibling1name;
    private String sibling1std;
    private String sibling2name;
    private String sibling2std;

    // Father details
    private String fatherName;
    private int fatherAge;
    private String fatherProfession;
    private String fatherLang;
    private String fatherEducation;
    private String fatherContact;
    private double fatherIncome; // Assuming income is a decimal value
    private String fatherLangKnown;

    // Mother details
    private String motherName;
    private int motherAge;
    private String motherProfession;
    private String motherLang;
    private String motherEducation;
    private String motherContact;
    private double motherIncome; // Assuming income is a decimal value
    private String motherLangKnown;

    // Mentor details
    private String mentorName;
    private String mentorRelation;
    private int mentorAge;
    private String mentorProfession;
    private String mentorLang;
    private String mentorEducation;
    private String mentorContact;
    private double mentorIncome; // Assuming income is a decimal value

    public RequestDTO() {
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getSubcaste() {
        return subcaste;
    }

    public void setSubcaste(String subcaste) {
        this.subcaste = subcaste;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSibling1name() {
        return sibling1name;
    }

    public void setSibling1name(String sibling1name) {
        this.sibling1name = sibling1name;
    }

    public String getSibling1std() {
        return sibling1std;
    }

    public void setSibling1std(String sibling1std) {
        this.sibling1std = sibling1std;
    }

    public String getSibling2name() {
        return sibling2name;
    }

    public void setSibling2name(String sibling2name) {
        this.sibling2name = sibling2name;
    }

    public String getSibling2std() {
        return sibling2std;
    }

    public void setSibling2std(String sibling2std) {
        this.sibling2std = sibling2std;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public int getFatherAge() {
        return fatherAge;
    }

    public void setFatherAge(int fatherAge) {
        this.fatherAge = fatherAge;
    }

    public String getFatherProfession() {
        return fatherProfession;
    }

    public void setFatherProfession(String fatherProfession) {
        this.fatherProfession = fatherProfession;
    }

    public String getFatherLang() {
        return fatherLang;
    }

    public void setFatherLang(String fatherLang) {
        this.fatherLang = fatherLang;
    }

    public String getFatherEducation() {
        return fatherEducation;
    }

    public void setFatherEducation(String fatherEducation) {
        this.fatherEducation = fatherEducation;
    }

    public String getFatherContact() {
        return fatherContact;
    }

    public void setFatherContact(String fatherContact) {
        this.fatherContact = fatherContact;
    }

    public double getFatherIncome() {
        return fatherIncome;
    }

    public void setFatherIncome(double fatherIncome) {
        this.fatherIncome = fatherIncome;
    }

    public String getFatherLangKnown() {
        return fatherLangKnown;
    }

    public void setFatherLangKnown(String fatherLangKnown) {
        this.fatherLangKnown = fatherLangKnown;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getMotherAge() {
        return motherAge;
    }

    public void setMotherAge(int motherAge) {
        this.motherAge = motherAge;
    }

    public String getMotherProfession() {
        return motherProfession;
    }

    public void setMotherProfession(String motherProfession) {
        this.motherProfession = motherProfession;
    }

    public String getMotherLang() {
        return motherLang;
    }

    public void setMotherLang(String motherLang) {
        this.motherLang = motherLang;
    }

    public String getMotherEducation() {
        return motherEducation;
    }

    public void setMotherEducation(String motherEducation) {
        this.motherEducation = motherEducation;
    }

    public String getMotherContact() {
        return motherContact;
    }

    public void setMotherContact(String motherContact) {
        this.motherContact = motherContact;
    }

    public double getMotherIncome() {
        return motherIncome;
    }

    public void setMotherIncome(double motherIncome) {
        this.motherIncome = motherIncome;
    }

    public String getMotherLangKnown() {
        return motherLangKnown;
    }

    public void setMotherLangKnown(String motherLangKnown) {
        this.motherLangKnown = motherLangKnown;
    }

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorRelation() {
        return mentorRelation;
    }

    public void setMentorRelation(String mentorRelation) {
        this.mentorRelation = mentorRelation;
    }

    public int getMentorAge() {
        return mentorAge;
    }

    public void setMentorAge(int mentorAge) {
        this.mentorAge = mentorAge;
    }

    public String getMentorProfession() {
        return mentorProfession;
    }

    public void setMentorProfession(String mentorProfession) {
        this.mentorProfession = mentorProfession;
    }

    public String getMentorLang() {
        return mentorLang;
    }

    public void setMentorLang(String mentorLang) {
        this.mentorLang = mentorLang;
    }

    public String getMentorEducation() {
        return mentorEducation;
    }

    public void setMentorEducation(String mentorEducation) {
        this.mentorEducation = mentorEducation;
    }

    public String getMentorContact() {
        return mentorContact;
    }

    public void setMentorContact(String mentorContact) {
        this.mentorContact = mentorContact;
    }

    public double getMentorIncome() {
        return mentorIncome;
    }

    public void setMentorIncome(double mentorIncome) {
        this.mentorIncome = mentorIncome;
    }
}
