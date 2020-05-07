package webclasses;

import data.Customer;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ViewScoped
@ManagedBean(name = "EnergieBean")
public class CustomerBean {
    private List<Customer> customers;

    @PostConstruct
    public void init(){
        customers = Controller.getReadXML().getCustomer().getCustomer();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
