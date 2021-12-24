/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web.service.tugas_01;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nafi'
 */
@Controller
public class databaseController_json {
    
    @RequestMapping(value="/viewJSON", produces={MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<Datamahasiswa> getDatamhs(){
        
        List<Datamahasiswa> Datamahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try {
            Datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e){}
        
        return Datamahasiswa;
    }
}
