import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Statement; 
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class MysqlJava{
	private static final String CONNECTION = "jdbc:mariadb://localhost:3306/db_name";
	Connection conn = null;
	PreparedStatement statement = null;  
	public void connSQL() {  
        try {  
        	Properties p = new Properties();
		    p.put("user","root");
		    p.put("password","");
		    Class.forName("org.mariadb.jdbc.Driver");
		    conn = DriverManager.getConnection(CONNECTION,p);  
		    System.out.println("mysql link success!");
		} catch (ClassNotFoundException e) {  
		    System.err.println("装载 JDBC/ODBC 驱动程序失败。");
		    e.printStackTrace();  
		} catch (SQLException e){
			System.err.println("无法连接数据库");
			e.printStackTrace();
		}
    }  

    ResultSet selectSQL(String sql){
    	ResultSet rs = null;
    	try{
    		statement = conn.prepareStatement(sql);
    		rs = statement.executeQuery();
    	} catch(SQLException e){
    		e.printStackTrace();
    	}
    	return rs;
    }

    boolean innertSQL(String sql){
    	try{
	    	statement = conn.prepareStatement(sql);
	    	long iDate = System.currentTimeMillis();
	    	String salt = Math.random()+"";
			salt = salt.substring(2,10);
			statement.setString(1, "zhangsan"+salt);
			statement.setString(2, "222222");
			statement.setString(3, "zhangsan"+salt+"@qq.com");
			statement.setTimestamp(4, new Timestamp(iDate));
	    	statement.executeUpdate();
	    	return true;
	    } catch (SQLException e){
	    	System.err.println("插入数据库时出错！");
	    	e.printStackTrace();
	    } catch (Exception e){
	    	System.err.println("插入时出错！");
	    	e.printStackTrace();
	    }
	    return false;
    }

    boolean updateSQL(String sql) {  
        try {  
            statement = conn.prepareStatement(sql);  
            statement.executeUpdate();  
            return true;  
        } catch (SQLException e) {  
            System.out.println("插入数据库时出错：");  
            e.printStackTrace();  
        } catch (Exception e) {  
            System.out.println("插入时出错：");  
            e.printStackTrace();  
        }  
        return false;  
    }  

    boolean deleteSQL(String sql) {  
        try {  
            statement = conn.prepareStatement(sql);  
            statement.executeUpdate();  
            return true;  
        } catch (SQLException e) {  
            System.out.println("插入数据库时出错：");  
            e.printStackTrace();  
        } catch (Exception e) {  
            System.out.println("插入时出错：");  
            e.printStackTrace();  
        }  
        return false;  
    }  

    public void layoutStyle(ResultSet rs){
    	System.out.println("------------------------------------------------------------------------------------");  
        System.out.println("ID"+"\t\t"+"用户名" + "\t\t\t\t" + "密码" + "\t\t" + "邮箱"+ "\t\t\t\t" + "注册日期");  
        System.out.println("------------------------------------------------------------------------------------");  

		try {  
            while (rs.next()) {  
                System.out.println(rs.getString("id") + "\t\t" 
                	    + rs.getString("username") + "\t\t"  
                        + rs.getString("password") + "\t\t"  
                        + rs.getString("email")  + "\t\t"
                        + rs.getString("regdate"));  
            }  
        } catch (SQLException e) {  
            System.out.println("显示时数据库出错。");  
            e.printStackTrace();  
        } catch (Exception e) {  
            System.out.println("显示出错。");  
            e.printStackTrace();  
        }  
    }
    /*public void layoutStyle2(ResultSet rs){
    	ResultSetMetaData meta = rs.getMetaData();
		int columnCount = meta.getColumnCount();

		while (rs.next()) {
			for (int i = 1; i <= columnCount; i++) {
				String colName = meta.getColumnLabel(i);
				System.out.println(colName + ":" + rs.getObject(i));
			}
		}
    }*/
    // disconnect to MySQL  
    void deconnSQL() {  
        try {  
            if (conn != null)  
                conn.close();  
        } catch (Exception e) {  
            System.out.println("关闭数据库问题 ：");  
            e.printStackTrace();  
        }  
    }  

	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		MysqlJava m = new MysqlJava();  
		m.connSQL();  

		String id = args.length>0 ? args[0] : "1";
		System.out.println(id);
		String selectSql = "select * from user order by regdate asc";
		String insertSql = "INSERT INTO user (username,password,email,regdate) VALUES (?,?,?,?)";
		String updateSql = "update user set password = '123123' where id="+id; 
        String deleteSql = "delete from user where id="+id; 
		
		if(m.innertSQL(insertSql)==true){
			System.out.println("insert success");
		}
		
		if(m.updateSQL(updateSql)==true){
			System.out.println("update success");
		}
		if(m.deleteSQL(deleteSql)==true){
			System.out.println("delete success");
			
		}
		ResultSet resultSet = m.selectSQL(selectSql);
		m.layoutStyle(resultSet);
    	m.deconnSQL();
	}
}
