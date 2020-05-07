
package data;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the data package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: data
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnergieDataExport }
     * 
     */
    public EnergieDataExport createEnergieDataExport() {
        return new EnergieDataExport();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link EnergieDataExport.CustomerList }
     * 
     */
    public EnergieDataExport.CustomerList createEnergieDataExportCustomerList() {
        return new EnergieDataExport.CustomerList();
    }

    /**
     * Create an instance of {@link PowerRecord }
     * 
     */
    public PowerRecord createPowerRecord() {
        return new PowerRecord();
    }

    /**
     * Create an instance of {@link Customer.DataEntries }
     * 
     */
    public Customer.DataEntries createCustomerDataEntries() {
        return new Customer.DataEntries();
    }

}
