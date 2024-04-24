/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.entities.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.AcountClass;

/**
 *
 * @author Student
 */
@Local
public interface AcountFacadeLocal {

    void create(AcountClass acount);

    void edit(AcountClass acount);

    void remove(AcountClass acount);

    AcountClass find(Object id);

    List<AcountClass> findAll();

    List<AcountClass> findRange(int[] range);

    int count();
    
}
