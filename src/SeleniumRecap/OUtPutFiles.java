package SeleniumRecap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class OUtPutFiles {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\chris\\eclipse-workspace\\JavaBatch8\\src\\com\\syntax\\class34\\Credentials.properties";

        FileInputStream fileInputStream = new FileInputStream ( path );
        Properties properties = new Properties ( );

        properties.setProperty ( "Number", "111111" );

}}