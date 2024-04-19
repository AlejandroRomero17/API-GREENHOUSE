package uxtj.apiinvernadero.apiinvernadero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uxtj.apiinvernadero.apiinvernadero.models.Control;
import uxtj.apiinvernadero.apiinvernadero.service.ControlService;

import java.util.List;

@RestController
@RequestMapping("/api/greenhousecontrol/v1/control")
public class ControlController {

    @Autowired
    private ControlService controlService;

    // GET 
    @GetMapping
    public List<Control> getAllControls() {
        return controlService.getAllControls();
    }

    //  POST para agregar un nuevo control
    @PostMapping
    public Control addControl(@RequestBody Control control) {
        return controlService.saveControl(control);
    }

    // Método PUT para actualizar un control existente
    @PutMapping("/{controlID}")
    public Control updateControl(@PathVariable Long controlID, @RequestBody Control updatedControl) {
        return controlService.updateControl(controlID, updatedControl);
    }

    // Método DELETE para eliminar un control por su ID
    @DeleteMapping("/{controlID}")
    public void deleteControl(@PathVariable Long controlID) {
        controlService.deleteControl(controlID);
    }
}
