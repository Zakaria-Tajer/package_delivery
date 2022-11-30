import com.example.package_delivery.Dao.AdminDao;
import com.example.package_delivery.Entities.AdminEntity;

public class Main {
    public static void main(String[] args) throws Exception {

        AdminDao adminDao = new AdminDao();
        AdminEntity admin = new AdminEntity();
        admin.setEmail("zk@zk.com");
        admin.setPassword("life");
        admin.setFirstName("zk");
        admin.setLastName("kz");
        adminDao.createAdmin(admin);
    }
}

