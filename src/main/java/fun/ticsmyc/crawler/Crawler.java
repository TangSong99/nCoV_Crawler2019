package fun.ticsmyc.crawler;

/**
 * 数据源URL 和 获取到的JSON数据
 *
 * @author Ticsmyc
 * @package fun.ticsmyc
 * @date 2020-01-25 22:47
 */
public class Crawler {
    //数据源 地址
    public static final String URL ="https://3g.dxy.cn/newh5/view/pneumonia";

    /**
     * 时间线新闻
     */
    public static String timelineServiceInformation;
    public static final String TIME_LINE_REGEX_TEMPLATE = "\\[(.*?)\\]";
    public static final String TIME_LINE_ATTRIBUTE="getTimelineService";
    /**
     * 各省信息
     */
    public static String areaInformation;
    public static final String AREA_INFORMATION_REGEX_TEMPLATE = "\\[(.*)\\]";
    public static final String AREA_INFORMATION_ATTRIBUTE="getAreaStat";
    /**
     * 总数据
     */
    public static String staticInformation;
    public static final String STATIC_INFORMATION_REGEX_TEMPLATE_2="\\{(\"id\".*?)\\}\\]\\}";
    public static final String STATIC_INFORMATION_REGEX_TEMPLATE_1="\\{(\"id\".*?)\\}";
    public static final String STATIC_INFORMATION_ATTRIBUTE="getStatisticsService";

    /*
    * 谣言rymor
    * */
    public static String rymorInformation;
    public static final String RYMOR_INFORMATION_REGEX_TEMPLATE = "\\[(.*?)\\]";
    public static final String RYMOR_INFORMATION_ATTRIBUTE="getIndexRumorList";
}