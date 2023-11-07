package services;

import java.util.List;
import model.DanhMuc;

public interface DanhMucService {

    public List<DanhMuc> getAll();

    public String add(DanhMuc danhMuc);

    public String update(DanhMuc danhMuc);

    public String delete(String id);
}
