package DAO;

import Model.Tac_gia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTac_gia {
    private final DB db=new DB();
    public Tac_gia getTen_tg(int id_tg){
        try {
            Statement st=db.getCon().createStatement();
            ResultSet res=st.executeQuery("SELECT * FROM tac_gia WHERE id_tac_gia='"+id_tg+"'");
            while (res.next()){
                int id=res.getInt(1);
                String ten_tg=res.getString(2);
                String diachi=res.getString(3);
                Tac_gia tg=new Tac_gia(id, ten_tg, diachi);
            return tg;
            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return null;
    }
}
