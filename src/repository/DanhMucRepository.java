package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.DanhMuc;

public class DanhMucRepository {

    public List<DanhMuc> getAll() {
        List<DanhMuc> list = new ArrayList<>();
        String sql = """
                      SELECT id, name from DANHMUC
                      """;

        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DanhMuc danhMuc = new DanhMuc(rs.getString(1), rs.getString(2));
                list.add(danhMuc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public DanhMuc getOne(String id) {
        String sql = """
                      SELECT id, name from DANHMUC
                        WHERE id = ?
                      """;

        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new DanhMuc(rs.getString(1), rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean delete(String id) {
        String sql = """
                     DELETE from DANHMUC
                        WHERE id = ?
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public Boolean update(DanhMuc danhMuc) {
        String sql = """
                     UPDATE DANHMUC SET name = ?
                      WHERE id = ?
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, danhMuc.getName());
            ps.setObject(2, danhMuc.getId());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public Boolean add(DanhMuc danhMuc) {
        String sql = """
                     INSERT INTO DANHMUC
                     (id, name)
                     VALUES (newID(),?)
                     """;
        int check = 0;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);) {
            ps.setObject(1, danhMuc.getName());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check > 0;
    }

    public static void main(String[] args) {
        DanhMucRepository danhMucRepository = new DanhMucRepository();
        danhMucRepository.add(new DanhMuc("Name 1"));
        List<DanhMuc> l = danhMucRepository.getAll();
        for (DanhMuc danhMuc : l) {
            System.out.println(danhMuc);
        }
    }
}
