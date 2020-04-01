/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.DAO;

import eu.ensup.BO.EtudiantBO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 *
 * @author lorris
 */
public interface IEtudiantDAO extends JpaRepository<EtudiantBO, Integer>{
    
//    public void createStudent(EtudiantBO eleve);
//    public EtudiantBO getEleveById(int id);
//    public void delete(EtudiantBO eleve);
//    public List<EtudiantBO> getAll();
    
    
    
}
