package com.github.addressbook.test;

public class ContactData {
    // Class variables:
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String homePhone;
    private final String mobilePhone;
    private final String workPhone;
    private final String fax;
    private final String firstEmail;
    private final String secondEmail;
    private final String thirdEmail;
    private final String homePage;
    private final String day;
    private final String month;
    private final String year;
    private final String anniversaryDay;
    private final String anniversaryMonth;
    private final String anniversaryYear;
    private final String secondAddress;
    private final String secondPhone;
    private final String notes;

    // Class constructor:
    public ContactData(
            String firstName,
            String middleName,
            String lastName,
            String nickName,
            String title,
            String company,
            String address,
            String homePhone,
            String mobilePhone,
            String workPhone,
            String fax,
            String firstEmail,
            String secondEmail,
            String thirdEmail,
            String homePage,
            String day,
            String month,
            String year,
            String anniversaryDay,
            String anniversaryMonth,
            String anniversaryYear,
            String secondAddress,
            String secondPhone,
            String notes
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.workPhone = workPhone;
        this.fax = fax;
        this.firstEmail = firstEmail;
        this.secondEmail = secondEmail;
        this.thirdEmail = thirdEmail;
        this.homePage = homePage;
        this.day = day;
        this.month = month;
        this.year = year;
        this.anniversaryDay = anniversaryDay;
        this.anniversaryMonth = anniversaryMonth;
        this.anniversaryYear = anniversaryYear;
        this.secondAddress = secondAddress;
        this.secondPhone = secondPhone;
        this.notes = notes;
    }

    // Class methods:
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public String getFax() {
        return fax;
    }

    public String getFirstEmail() {
        return firstEmail;
    }

    public String getSecondEmail() {
        return secondEmail;
    }

    public String getThirdEmail() {
        return thirdEmail;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

    public String getAnniversaryDay() {
        return anniversaryDay;
    }

    public String getAnniversaryMonth() {
        return anniversaryMonth;
    }

    public String getAnniversaryYear() {
        return anniversaryYear;
    }

    public String getSecondAddress() {
        return secondAddress;
    }

    public String getSecondPhone() {
        return secondPhone;
    }

    public String getNotes() {
        return notes;
    }
}
