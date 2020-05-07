package webclasses;

import data.Customer;
import data.PowerRecord;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.util.List;
import java.util.Map;

@ViewScoped
@ManagedBean(name = "PowerRecordsView")
public class PowerRecordsView {
    private List<PowerRecord> powerRecords;
    int id;

    @PostConstruct
    public void init(){
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String carId = paramMap.get("id");
        try {
            id = Integer.parseInt(carId);
        }
        catch (Exception e) {
            id = -1;
        }
        if (id != -1) {
            Customer customerType = Controller.getCustomer(id);
            if (customerType != null){
                powerRecords = Controller.getPowerRecords(id).getPowerRecord();
                System.out.println(powerRecords.get(1).getId());
            }
        }
    }

    public List<PowerRecord> getPowerRecords() {
        return powerRecords;
    }

    public void setPowerRecords(List<PowerRecord> powerRecords) {
        this.powerRecords = powerRecords;
    }
}
