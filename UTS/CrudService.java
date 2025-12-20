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
public interface CrudService {

    void tambahObat(Obat obat);

    boolean updateObat(String kodeObat, Obat obatBaru);
}
