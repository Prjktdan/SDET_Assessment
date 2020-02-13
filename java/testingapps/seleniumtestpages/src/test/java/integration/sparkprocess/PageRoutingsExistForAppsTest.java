package integration.sparkprocess;

import integration.sparkprocess.http.BasicHttp;
import integration.sparkprocess.server.SeleniumTestPagesSparkStarter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class PageRoutingsExistForAppsTest {

    private BasicHttp http;

    @BeforeClass
    public static void ensureAppIsRunning(){
        SeleniumTestPagesSparkStarter.get("localhost", "/heartbeat" ).startSparkAppIfNotRunning(4567);
    }

    @Before
    public void setupBasicHttp(){
        http = new BasicHttp("http","localhost", 4567);
    }

    @Test
    public void canAccessAlert(){
        Assert.assertTrue(http.isPageAt("/alert.html"));
    }

    @Test
    public void canAccessAlerts(){
        Assert.assertTrue(http.isPageAt("/alerts.html"));
    }

    @Test
    public void canAccessBasicAjax(){
        Assert.assertTrue(http.isPageAt("/basic_ajax.html"));
    }

    @Test
    public void canAccessBasicHTMLForm(){
        Assert.assertTrue(http.isPageAt("/basic_html_form.html"));
    }

    @Test
    public void canAccessBasicWebPage(){
        Assert.assertTrue(http.isPageAt("/basic_web_page.html"));
    }

    @Test
    public void canAccessBounce(){
        Assert.assertTrue(http.isPageAt("/bounce.html"));
    }

    @Test
    public void canAccessCalculator(){
        Assert.assertTrue(http.isPageAt("/calculate.php"));
    }

    @Test
    public void canAccessFindByPlayground(){
        Assert.assertTrue(http.isPageAt("/alerts.html"));
    }

    @Test
    public void canAccessGuiUserInteractions(){
        Assert.assertTrue(http.isPageAt("/gui_user_interactions.html"));
    }

    @Test
    public void canAccessJavascriptCountdown(){
        Assert.assertTrue(http.isPageAt("/javascript_countdown.html"));
    }

    @Test
    public void canAccessKeyClickDisplay(){
        Assert.assertTrue(http.isPageAt("/key_click_display.html"));
    }

    @Test
    public void canAccessRefresh(){
        Assert.assertTrue(http.isPageAt("/refresh.php"));
    }

    @Test
    public void canAccessSearch(){
        Assert.assertTrue(http.isPageAt("/search.php"));
    }

    @Test
    public void canAccessFrames(){
        Assert.assertTrue(http.isPageAt("/frames/index.html"));
    }

    @Test
    public void canAccessBasicRedirect(){
        Assert.assertTrue(http.isPageAt("/basic_redirect.html"));
    }

    @Test
    public void canAccessBasicCanvasExample(){
        Assert.assertTrue(http.isPageAt("/canvas_basic.html"));
    }

    @Test
    public void canAccessFileUpload(){
        Assert.assertTrue(http.isPageAt("/file_upload_j.html"));
    }

    @Test
    public void canAccessBasicHtml5(){
        Assert.assertTrue(http.isPageAt("/basic_html5_form.html"));
    }

}
