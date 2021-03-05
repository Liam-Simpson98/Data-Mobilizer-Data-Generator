package managers;

import dataAccess.JsonConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.TestVector;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class generateExcel{
    // fillTime is 1hr and 20 min in seconds

    int fillTime = 20;
    int count = 0;

    // all my random generators
    Random random = new Random();
    double lowTimeStamp = (Math.round((Math.random() * 70000.000 + 1.000) * 10000.0000) / 10000.0000);
    double flowRate = 0;
    double range = (Math.round((Math.random() * (4000 - 3500) + 3500) * 10.0) / 10.0);
    double temp = (Math.round((Math.random() * (25 - 10) + 10) * 1000.000) / 1000.000);
    double density = (Math.round((Math.random() * (935.00 - 933.00) + 933) * 100.00) / 100.00);
    double grossLiters = (Math.round(((Math.random() * (92000 - 90000) + 90000) / 4500) * 1000000.000000)
            / 1000000.000000);
    double grossLiters2;
    double netVolume = grossLiters2;
    double netVolume2;
    double pressure = (Math.round((Math.random() * (230 - 30) + 30) * 100000.00000) / 100000.00000);
    double outage = (Math.round((Math.random() * (115 - 95) + 95) * 10000.0000) / 10000.0000);
    double grossVolume;
    double grossHeel;
    int loadStatus = 2;
    int tLoadStatus = 4;
    double spOutage;

    //initiate the test vect object. 
    TestVector tv = new TestVector();
//    DBUtil db = new DBUtil();
//    TrialConnection tc;
    List<TestVector> listTestVectors = new ArrayList<TestVector>();
    JSONArray listArray = new JSONArray();

    // Run method because I'm using threads.
    //@Override
   // public void run() {

        //while the fill time is not 1hr 
    
    
    public String generateJSON(){
        while (count < fillTime) {

            final SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            f.setTimeZone(TimeZone.getTimeZone("MST"));
            String date = f.format(new Date());
            
            if (count == 0) {

            }
            //Thread sleep is to simulate time passing

//            try {
//                Thread.sleep(1); // throws InterruptedException
//            } catch (InterruptedException e) { // Exception must be caught or else code will not compile
//                Thread.currentThread().interrupt();
//            }
            //putting value into test vector object
            tv = new TestVector(lowTimeStamp, flowRate, range, temp, density, grossLiters2, netVolume2,
                    pressure, outage, grossVolume, grossHeel, loadStatus, tLoadStatus, spOutage, "SAIT000005");

            JSONObject tvList = new JSONObject();

            tvList.put("time", lowTimeStamp);
            tvList.put("flow_rate", flowRate);
            tvList.put("range_value", range);
            tvList.put("temp", temp);
            tvList.put("density", density);
            tvList.put("gross_vol_in", grossLiters2);
            tvList.put("net_volume", netVolume2);
            tvList.put("pressure", pressure);
            tvList.put("outage", outage);
            tvList.put("gross_volume", grossVolume);
            tvList.put("gross_heel", grossHeel);
            tvList.put("load_status", loadStatus);
            tvList.put("t_load_status", tLoadStatus);
            tvList.put("sp_outage", spOutage);
            tvList.put("car_id", "SAIT000005");
            tvList.put("date_time", "" + date);

            listArray.add(tvList);

            //print to console to see monitor print out
            System.out.println(tv.toString());
            lowTimeStamp += 0.5;

            flowRate += random.nextDouble() * (.3 - 0.1) + 0.1;
            flowRate = Math.round(flowRate * 1000.000) / 1000.000;
            range -= random.nextDouble() * (.5 - 0.1) + 0.1;
            range = Math.round(range * 10.0) / 10.0;
            temp += random.nextDouble() * (.001 - .0001) + .0001;
            temp = Math.round(temp * 1000.000) / 1000.000;
            density = (Math.round((Math.random() * (935.00 - 933.00) + 933) * 100.00) / 100.00);
            grossLiters2 = grossLiters2 + grossLiters;
            grossLiters2 = Math.round(grossLiters2 * 1000000.000000) / 1000000.000000;
            if (count > 1) {
                netVolume2 = (grossLiters2 + grossLiters) - 1.7;
                netVolume2 = Math.round(netVolume2 * 1000000.000000) / 1000000.000000;
            }
            pressure = (Math.round((Math.random() * (230 - 30) + 30) * 100000.00000) / 100000.00000);
            outage -= 0.00178;
            outage = Math.round(outage * 10000.0000) / 10000.0000;
            grossVolume = netVolume2 - (Math.random() * (20 - 5) + 5);
            grossVolume = Math.round(grossVolume * 1000.000) / 1000.000;
            if (count == 100) {
                loadStatus = 3;
                grossHeel = Math.round((Math.random() * (30 - 210) - 0) * 1000.000) / 1000.000;
            }
            if (count == 1000) {
                tLoadStatus = 7;
                grossHeel = Math.round((Math.random() * (30 - 210) - 0) * 1000.000) / 1000.000;
            }
            if (count == 2000) {
                loadStatus = 6;
                grossHeel = Math.round((Math.random() * (30 - 210) - 0) * 1000.000) / 1000.000;
                spOutage = 30.26845;
            }
            if (count == 3000) {

                grossHeel = Math.round((Math.random() * (30 - 210) - 0) * 1000.000) / 1000.000;
                spOutage = 0;
            }
            if (count == 4000) {
                loadStatus = 6;
                grossHeel = Math.round((Math.random() * (30 - 210) - 0) * 1000.000) / 1000.000;
                spOutage = 21.46555;
            }

            
            listTestVectors.add(tv);
            
            System.out.println(tv.toString());
            count++;
        }
       
        return listArray.toJSONString(); 
        
    }
    
    public int postRequest(String jsonInputString) {
        
        try{
            URL obj = new URL("http://backendowner-env.eba-mhuzfgmk.us-east-2.elasticbeanstalk.com/plc/list");
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");            
            con.setDoOutput(true);            
            
            OutputStream os = con.getOutputStream();
            byte[] input = jsonInputString.getBytes("utf-8");
            os.write(input, 0, input.length);
           
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            
            return con.getResponseCode();
        } catch (MalformedURLException ex) {
             Logger.getLogger(JsonConnection.class.getName()).log(Level.SEVERE, null, ex);
             return -1;
        } catch (IOException ex) {
            Logger.getLogger(JsonConnection.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }   
    }  
}
