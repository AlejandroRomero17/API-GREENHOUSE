package uxtj.apiinvernadero.apiinvernadero.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "tbb_controls")
public class Control {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long controlID;

    private Date date;
    private String time;
    private float humidity_sensor;
    private float temperature_sensor;
    private boolean ventilation;
}
