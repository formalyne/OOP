package topic6;

public class PersonAccount {

    private String personName;
    private double personFunds;
    private int id;

    public PersonAccount(int id,String personName,double personFunds){
        this.id = id;
        this.personName = personName;
        this.personFunds = personFunds;
    }

    public void transferToPerson(PersonAccount to,double howMuch) throws Exception {
        try {
            setPersonFunds(this.personFunds-howMuch);
            to.setPersonFunds(to.getPersonFunds()+howMuch);
        }catch (Exception e){
            System.out.println("Tried to transfer " + howMuch + " when balance is "+ this.personFunds);
            System.out.println(e.toString());
        }
    }
    public void withdrawFromPerson(double howMuch) throws Exception {
        try {
            setPersonFunds(this.personFunds-howMuch);
        }catch (Exception e){
            System.out.println("Tried to withdraw " + howMuch + " when balance is "+ this.personFunds);
            System.out.println(e.toString());
        }

    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getPersonFunds() {
        return personFunds;
    }

    public void setPersonFunds(double personFunds) throws Exception {
        if (personFunds<0){
            throw new Exception("Person funds can't be less than 0");
        }
        this.personFunds = personFunds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
