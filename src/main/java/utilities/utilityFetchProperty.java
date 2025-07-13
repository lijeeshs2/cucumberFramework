package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static constants.constant.CONFIG_PROPERTIES_DIRECTORY;

public class utilityFetchProperty
{
    public static String fetchPropertyValue(String key) throws IOException {
        FileInputStream file=new FileInputStream(CONFIG_PROPERTIES_DIRECTORY);
        Properties property=new Properties();
        property.load(file);
        return property.get(key).toString();
    }
}
