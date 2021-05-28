import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class ktkytu {
    static void loaikytu(String str1) {
        {
            char[] str;
            str = new char[str1.length()];
            str = str1.toCharArray();
            int index = 0;
            for (int i = 0; i < str1.length(); i++) {
                int j;
                for (j = 0; j < i; j++) {
                    if (str[i] == str[j]) {
                        break;
                    }
                }
                if (j == i) {
                    str[index++] = str[i];
                }
            }
            System.out.println(String.valueOf(Arrays.copyOf(str, index)));
        }
    }
}





