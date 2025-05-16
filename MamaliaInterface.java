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
public class MamaliaInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tikus myT = new Tikus();
        myT.makan();
        myT.Tempattinggal();
        myT.JumlahAnak();
        System.out.println("Jumlah anak tikus: " + myT.JumlahAnak());
    }
    
}
