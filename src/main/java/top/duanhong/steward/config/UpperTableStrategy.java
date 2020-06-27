/*
package top.duanhong.steward.config;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

*/
/**
 * @author duanhong
 * @description jpa配置数据表生成策略表明大写
 * @date 2019/11/16
 *//*

public class UpperTableStrategy extends PhysicalNamingStrategyStandardImpl {
    */
/**
     *
     *//*

    private static final long serialVersionUID = 1L;
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        // 将表名全部转换成大写
        String tableName = name.getText().toUpperCase();

        return name.toIdentifier(tableName);
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        String colnumName = name.getText().toUpperCase();
        return name.toIdentifier(colnumName);
    }
}
*/
