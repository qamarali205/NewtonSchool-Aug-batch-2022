// your class code goes here
class VipCustomer{
    public double creditLimit=10;
    public String email="xyz@abc.com";
    public String name="XYZ";

    public VipCustomer() {
        this("XYZ", 10, "xyz@abc.com");
    }
    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit,"xyz@abc.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}