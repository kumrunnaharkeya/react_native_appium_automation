package libr_f8;

/**
 * Created by keya on 12/24/17.
 */

public class XpathConstants {
    public static class text_validation{
        public static final String appName="//android.widget.TextView[@index='0' and @text='Facebook Developer Conference']";
        public static final String devConDate="//android.widget.TextView[@index='4'and @text= 'APRIL 18 + 19 / SAN JOSE, CALIFORNIA']";
        public static final String skipButton ="//android.widget.TextView[@index='0'and @text= 'SKIP FOR NOW']";
    }

    public static class Schedule{
        public static final String headerSchedule="//android.widget.TextView[@index='0' and @text='Schedule']";
        public static final String headerSettingButton= "//android.widget.TextView[@index='1']";
    }
}
