package integration.sparkprocess.server;

import com.seleniumsimplified.MainTestPages;
import com.seleniumsimplified.seleniumtestpages.spark.app.SeleniumTestPagesForSpark;
import uk.co.compendiumdev.sparktesting.SparkStarter;

import java.net.HttpURLConnection;
import java.net.URL;

public class SeleniumTestPagesSparkStarter extends SparkStarter {

    private static SeleniumTestPagesSparkStarter starter;
    private final String host;
    private final String heartBeatPath;

    private SeleniumTestPagesSparkStarter(String host, String heartBeatPath){
        this.host = host;
        this.heartBeatPath = heartBeatPath;


    }

    public static SeleniumTestPagesSparkStarter get(String host, String heartBeatPath){

        if(SeleniumTestPagesSparkStarter.starter==null) {
            SeleniumTestPagesSparkStarter.starter = new SeleniumTestPagesSparkStarter(host, heartBeatPath);
        }
        return SeleniumTestPagesSparkStarter.starter;
    }

    public boolean isRunning(){

        try{
            HttpURLConnection con = (HttpURLConnection)new URL("http",host, sparkport, heartBeatPath).openConnection();
            return con.getResponseCode()==200;
        }catch(Exception e){
            return false;
        }

    }

    @Override
    public void startServer() {
        // I sometimes use the main method
        // it is harder to start and stop reliably
        String[] args = {};
        MainTestPages.main(args);
        //final CompendiumDevAppsForSpark server = CompendiumDevAppsForSpark.runLocally(4567);
    }


}
