package vn.edu.hcmuaf.bean;

public class RegisterFormValue {
    String fullName,
            birthDate,
            sex,
            address,
            phoneNumber,
            email,
            username,
            password,
            confirmPassword,
            agreeToTerms;

    public RegisterFormValue(String fullName, String birthDate, String sex, String address, String phoneNumber, String email, String username, String password, String confirmPassword, String agreeToTerms) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.sex = sex;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.agreeToTerms = agreeToTerms;
    }

    public RegisterFormValue() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getAgreeToTerms() {
        return agreeToTerms;
    }

    public void setAgreeToTerms(String agreeToTerms) {
        this.agreeToTerms = agreeToTerms;
    }
}