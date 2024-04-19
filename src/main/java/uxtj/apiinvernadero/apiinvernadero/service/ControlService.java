package uxtj.apiinvernadero.apiinvernadero.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uxtj.apiinvernadero.apiinvernadero.models.Control;
import uxtj.apiinvernadero.apiinvernadero.repository.ControlRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ControlService {

    @Autowired
    private ControlRepository ControlRepository;

    public List<Control> getAllControls() {
        return ControlRepository.findAll();
    }

    public Optional<Control> getControlById(Long id) {
        return ControlRepository.findById(id);
    }

    public Control saveControl(Control control) {
        return ControlRepository.save(control);
    }

    public Control updateControl(Long id, Control newControl) {
        Optional<Control> optionalControl = ControlRepository.findById(id);
        if (optionalControl.isPresent()) {
            Control control = optionalControl.get();
            control.setDate(newControl.getDate());
            control.setTime(newControl.getTime());
            control.setHumidity_sensor(newControl.getHumidity_sensor());
            control.setTemperature_sensor(newControl.getTemperature_sensor());
            control.setVentilation(newControl.isVentilation());
            return ControlRepository.save(control);
        } else {
            return null;
        }
    }

    public void deleteControl(Long id) {
        ControlRepository.deleteById(id);
    }
}
