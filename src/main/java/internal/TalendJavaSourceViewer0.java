package internal;

import routines.DataOperation;
import routines.Mathematical;
import routines.Numeric;
import routines.Relational;
import routines.StringHandling;
import routines.TalendDataGenerator;
import routines.TalendDate;
import routines.TalendStringUtil;
import routines.TalendString;
import routines.system.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

@SuppressWarnings("unused")

public class TalendJavaSourceViewer0 {
	private static java.util.Properties context = new java.util.Properties();
	private static final java.util.Map<String, Object> globalMap = new java.util.HashMap<String, Object>();
	public void myFunction(){
	  if( 

 String jdbcUrl = "jdbc:jtds:sqlserver://localhost:1433/mabd";
        String username = "sa";
        String password = "root";
             try (Connection connection = DriverManager.getConnection(jdbcUrl,username,password);
             Statement statement = connection.createStatement()) {
            Liquibase li=new Liquibase("changelog.xml",new ClassLoaderResourceAccessor(), DatabaseFactory.getInstance().findCorrectDatabaseImplementation(new JdbcConnection(connection)));
            li.update();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
){
	}
	
}
}