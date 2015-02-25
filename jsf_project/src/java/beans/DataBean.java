/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author janes.thomas
 */

@ManagedBean
@SessionScoped
public class DataBean {
    
    private PieChartModel pieModel;
    
    @PostConstruct
    public void init() {
        createPieModel();
    }
 
    
    private void createPieModel(){
        
        pieModel = new PieChartModel();
        
        pieModel.set("Erstens", 123);
        pieModel.set("Zweitens", 123);
        
        pieModel.setTitle("Sample Pie");
        pieModel.setLegendPosition("w");
    }

    /**
     * @return the pieModel
     */
    public PieChartModel getPieModel() {
        return pieModel;
    }

    /**
     * @param pieModel the pieModel to set
     */
    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
}
