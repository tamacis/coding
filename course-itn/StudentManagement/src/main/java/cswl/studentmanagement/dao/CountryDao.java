/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.studentmanagement.dao;

import cswl.studentmanagement.modal.Country;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class CountryDao {
   
    
    public ArrayList<Country> selectAll() {

        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<Country> al = new ArrayList<>();
        
        try {
            conn = DBConnection.getConnection();

            String sql = "select * from country_tbl";

            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                al.add(Country.createFromRS(rs));
            }

        } catch (SQLException ex) {
            Logger.getLogger(CountryDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ps = null;
        }

        return al;
    }

}
