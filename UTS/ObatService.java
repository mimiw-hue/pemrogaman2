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

public class ObatService extends AbstractService {
   
    @Override
    public void tambahObat(Obat obat) {
        dataObat.add(obat);
    }

    @Override
    public boolean updateObat(String kodeObat, Obat obatBaru) {
        for (Obat o : dataObat) {
            if (o.getKodeObat().equalsIgnoreCase(kodeObat)) {
                o.setNamaObat(obatBaru.getNamaObat());
                o.setIdKategori(obatBaru.getIdKategori());
                o.setKodeSatuan(obatBaru.getKodeSatuan());
                return true;
            }
        }
        return false;
    }

    public List<Obat> getAll() {
        return dataObat;
    }
}

