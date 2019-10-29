package bin.test;

import bin.utils.DBTools;
import org.apache.ibatis.session.SqlSession;

public class MyBatisTest {
    public void test01 () {
//        System.out.println ("hello JUnit");
        SqlSession session = DBTools.getSession ();
    }
}
