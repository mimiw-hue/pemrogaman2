/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

/**
 *
 * @author MSI
 */
import java.sql.Statement;
import javax.swing.JOptionPane;
public class insert {
    koneksi konek = new koneksi();
   

    public void insert(int nim, String nama, String alamat, String jk) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();
         //   String sql = "insert into identitas (nim, nama, alamat, jeniskelamin)" + "values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
              String sql = "insert into datamahasiswa values('" + nim + "','" + nama + "','" + alamat + "','" + jk + "')";
            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public static void main(String[] args) {
    insert tambah = new insert ();
    tambah.insert(1023, "M Ilham Asrofi", "Desa Pagergung,DSN Tanggung", "L");
    }
}
