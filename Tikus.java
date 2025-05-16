/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mamaliainterface;

/**
 *
 * @author daffa
 */
public class Tikus implements MamaliaInterface2,Perilaku {

    @Override
    public void makan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Tempattinggal() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int JumlahAnak() {
        System.out.println("jumlah anak ada berada :"+2);
        return 2;
      // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
