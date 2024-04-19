package uxtj.apiinvernadero.apiinvernadero.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uxtj.apiinvernadero.apiinvernadero.models.Control;


@Repository
public interface ControlRepository extends JpaRepository<Control, Long>{

    
}