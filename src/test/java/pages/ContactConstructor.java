package pages;

public class ContactConstructor {
    String Salutation;
    String firstName;
    String lastName;
    String accountName;
    String title;
    String email;
    String phone;
    String mobile;
    String reportsTo;
    String department;
    String fax;
    String mailingStreet;
    String mailingCity;
    String mailingState;
    String postalCode;
    String mailingCountry;

    public ContactConstructor(String salutation, String firstName, String lastName, String accountName, String title, String email, String phone, String mobile, String reportsTo, String department, String fax, String mailingStreet, String mailingCity, String mailingState, String postalCode, String mailingCountry) {
        Salutation = salutation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountName = accountName;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.reportsTo = reportsTo;
        this.department = department;
        this.fax = fax;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingState = mailingState;
        this.postalCode = postalCode;
        this.mailingCountry = mailingCountry;
    }

    public String getSalutation() {
        return Salutation;
    }

    public void setSalutation(String salutation) {
        Salutation = salutation;
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

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(String reportsTo) {
        this.reportsTo = reportsTo;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public void setMailingStreet(String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public void setMailingCity(String mailingCity) {
        this.mailingCity = mailingCity;
    }

    public String getMailingState() {
        return mailingState;
    }

    public void setMailingState(String mailingState) {
        this.mailingState = mailingState;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public void setMailingCountry(String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }
}