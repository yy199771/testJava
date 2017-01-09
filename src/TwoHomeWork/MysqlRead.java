package TwoHomeWork;

import org.apache.commons.lang3.StringUtils;
import java.sql.*;
import java.text.MessageFormat;


/**
 * Created by yy on 17/1/9.
 */

public class test {

    public final String[] table_headers = new String[]{"表名:", "| 字段名称  | 数据类型 | 默认值  | 允许非空 |自动自增  |字段备注", "|  :-----: | :----: | :---: |:---: |:---: |:---: |"};

    public final String messageFormat = "|{0}|{1}|{2}|{3}|{4}|{5}";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://IP:PORT/DB_NAME?useUnicode=true&amp;characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull";
            String user = "xxxxxx";
            String pass = "xxxxxx";
            conn = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void brn() {
        System.out.println("-----------------");
    }

    public void dealTableHeader(String tableName) {
        System.out.println(table_headers[0] + "<b>" + tableName);
        brn();
        System.out.println(table_headers[1]);
        System.out.println(table_headers[2]);

    }

    public void Table2MD() {

        Connection conn = getConnection();
        ResultSet rest = null;
        try {

            DatabaseMetaData dbmd = conn.getMetaData();
            rest = dbmd.getTables("DB_NAME", null, null, new String[]{"TABLE"});
            while (rest.next()) {
                String tableName = rest.getString("TABLE_NAME");
                if (StringUtils.startsWith(tableName, "frm_")) //过滤系统表
                    continue;
                dealTableHeader(tableName);
                ResultSet columnSet = dbmd.getColumns(null, "%", tableName, "%");
                while (columnSet.next()) {
                    String columnName = columnSet.getString("COLUMN_NAME");
                    String type = columnSet.getString("TYPE_NAME");
                    String defaultValue = columnSet.getString("COLUMN_DEF");
                    int nullAB = columnSet.getInt("NULLABLE");
                    String autoCr = "N";
                    if ("id".equals(columnName))
                        autoCr = "Y";
                    String columnComment = columnSet.getString("REMARKS");
                    columnComment = StringUtils.replace(columnComment, "\r\n", "<br>");
                    Object[] arr = {columnName, type, defaultValue, nullAB == 1 ? "Y" : "N", autoCr, columnComment};
                    System.out.println(MessageFormat.format(messageFormat, arr));
                }
            }
            rest.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
        } finally {
            try {
                if (null != rest) {
                    System.out.print("close");
                    rest.close();
                }
                if (null != conn) {
                    System.out.print("close");
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("关闭异常");
            }
        }

    }

    public static void main(String[] args) {
        new MySqlRead().Table2MD();
    }
}
