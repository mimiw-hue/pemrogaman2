/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.semester.pkg3;

/**
 *
 * @author MSI
 */
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractService implements CrudService {

    protected List<Obat> dataObat = new ArrayList<>();
}
