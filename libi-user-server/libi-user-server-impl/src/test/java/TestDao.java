import org.junit.Test;
import org.junit.runner.RunWith;
import org.libi.user.impl.UserApplication;
import org.libi.user.impl.dao.UserDao;
import org.libi.user.impl.entity.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/10/22 11:52 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class TestDao {
    @Autowired
    private UserDao userDao;

    @Test
    public void testUserDao() {
        UserDo userDo = userDao.selectById("123");
    }
}
