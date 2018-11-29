package cswl.studentmanagement.modal;

import java.sql.ResultSet;
import java.sql.SQLException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cswl
 */
@NoArgsConstructor
@AllArgsConstructor
public @Data
class Country {

    private int id;
    private String cname;
    private String code;

    public static Country createFromRS(ResultSet rs) throws SQLException {
        return new Country(rs.getInt("id"),
                rs.getString("cname"),
                rs.getString("code")
        );
    }
}
