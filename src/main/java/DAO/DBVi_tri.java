package DAO;


import Model.Vi_tri;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBVi_tri {
    private final DB db=new DB();
    public Vi_tri getVi_tri(int id_vt){
        try {
            Statement st=db.getCon().createStatement();
            ResultSet res=st.executeQuery("SELECT * from vi_tri where id_vt='"+id_vt+"'");
            while (res.next()){
                int id=res.getInt(1);
                String ten_vt=res.getString(2);
                Vi_tri vt=new Vi_tri(id, ten_vt);
                return vt;
            }
            return null;
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
