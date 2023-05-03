package topic6;

public class Main {
    public static void main(String[] args) throws Exception {

        PersonAccount anna = new PersonAccount(1,"Anna",28384);
        PersonAccount vasea = new PersonAccount(2,"Vasea",10);

        anna.transferToPerson(vasea,50000);
        anna.withdrawFromPerson(50000);

        System.out.println(vasea.getPersonFunds());
        System.out.println(anna.getPersonFunds());

    }

}
