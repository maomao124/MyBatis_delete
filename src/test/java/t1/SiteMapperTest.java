package t1;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：MyBatis_delete
 * Package(包名): t1
 * Class(测试类名): SiteMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/13
 * Time(创建时间)： 12:51
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */
class SiteMapperTest
{

    /**
     * Delete site.
     *
     * @throws IOException the io exception
     */
    @Test
    void deleteSite() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        Site site = new Site();
        site.setId(9);

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        int i = siteMapper.deleteSite(site);

        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * Delete site 1.
     *
     * @throws IOException the io exception
     */
    @Test
    void deleteSite1() throws IOException
    {
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream("mybatis-config.xml");
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SiteMapper siteMapper = sqlSession.getMapper(SiteMapper.class);
        int i = siteMapper.deleteSite1(8);

        System.out.println(i);

        sqlSession.commit();
        sqlSession.close();
    }
}