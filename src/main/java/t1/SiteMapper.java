package t1;

import org.apache.ibatis.annotations.Param;

/**
 * Project name(项目名称)：MyBatis_delete
 * Package(包名): t1
 * Interface(接口名): SiteMapper
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/13
 * Time(创建时间)： 12:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */
public interface SiteMapper
{
    /**
     * Delete site int.
     *
     * @param site the site
     * @return the int
     */
    public int deleteSite(Site site);

    /**
     * Delete site 1 int.
     *
     * @param id the id
     * @return the int
     */
    public int deleteSite1(@Param("id") Integer id);
}
