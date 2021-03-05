/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import org.json.simple.JSONArray;

/**
 *
 * @author Trevor Parlee
 */
public class JsonConnection {
    
     public void postRequest(JSONArray listArray) throws Exception {
       URL obj = new URL("http://backendowner-env.eba-mhuzfgmk.us-east-2.elasticbeanstalk.com/plc/list");
        //URL obj = new URL("http://backendowner-env-2.eba-dimrmggm.us-west-2.elasticbeanstalk.com/plc");
        //URL obj = new URL(null,"http://backendowner-env-2.eba-dimrmggm.us-west-2.elasticbeanstalk.com/plc",new sun.net.www.protocol.https.Handler());
        //URL obj = new URL(null,"http://backendowner-env-2.eba-dimrmggm.us-west-2.elasticbeanstalk.com/plc/list",new sun.net.www.protocol.https.Handler());
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        con.setRequestMethod("POST");

        String urlParameters = "?user=root&password=password";

        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        
        //String inputLine = listArray.toJSONString();
        String inputLine;
        StringBuffer res = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
        res.append(inputLine);
        }
        in.close();
        }
     
     public void getRequest(JSONArray listArray) throws Exception {
     
     URL url = new URL("http://backendowner-env.eba-mhuzfgmk.us-east-2.elasticbeanstalk.com/plc?user=root&password=password");
        HttpURLConnection c = (HttpURLConnection)url.openConnection();  //connecting to url
        c.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(c.getInputStream()));  //stream to resource
        String str;
        String responsestring = null;
        while ((str = in.readLine()) != null)   //reading data
        responsestring += str+"\n";//process the response and save it in some string or so
        in.close();  //closing stream
     
     }
     

}
