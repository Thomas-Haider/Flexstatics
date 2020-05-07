package webclasses;

import data.Customer;
import readXML.ReadXML;

import java.math.BigInteger;

public class Controller {
    private static final ReadXML readXML = new ReadXML("F:\\Schule\\5BHIF\\TryTest\\data.xml");

    public static ReadXML getReadXML() {
        return readXML;
    }
    public static void addCustomer(String firstName, String lastName){
        Customer c = new Customer();
        c.setFirstName(firstName);
        c.setLastName(lastName);
        c.setId((readXML.getCustomer().getCustomer().get(readXML.getCustomer().getCustomer().size()-1).getId()).add((new BigInteger("1"))));
        readXML.getCustomer().getCustomer().add(c);
    }

    public static Customer.DataEntries getPowerRecords(int id){
        return readXML.getCustomer().getCustomer().get(id-1).getDataEntries();
    }

    public static Customer getCustomer(int id){
        return readXML.getCustomer().getCustomer().get(id);
    }
}
