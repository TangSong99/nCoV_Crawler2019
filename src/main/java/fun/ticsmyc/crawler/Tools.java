package fun.ticsmyc.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 *
 * @author Ticsmyc
 * @package fun.ticsmyc.crawler
 * @date 2020-01-26 18:03
 */
public class Tools {

    public static Document page;

    /**
     * 正则匹配获取
     * @param regex
     * @param attributeKey
     * @param attributeValue
     * @return
     */

    /*
    public static String timelineServiceInformation;
    public static final String TIME_LINE_REGEX_TEMPLATE = "\\[(.*?)\\]";
    public static final String TIME_LINE_ATTRIBUTE="getTimelineService";
    */
    public static String getInformation(String regex , String attributeKey, String attributeValue){
        String result=null;
        //给表达式创建Pattern对象
        Pattern p = Pattern.compile(regex);
        //寻找属性attributeKey（id）值为attributeValue（getTimelineService）的元素
        Elements timelineService = page.getElementsByAttributeValue(attributeKey,attributeValue);
        //创建Matcher对象  到所有匹配元素的外部html的综合
        Matcher m = p.matcher(timelineService.toString());
        if(m.find()) {  //该方法扫描输入的序列，查找与该模式匹配的一个子序列
            result=m.group();
        }
        return result;
    }

    /**
     * 通过Jsoup获取整个html页面
     * @param url
     * @return
     */
    public static void getPageByJSoup(String url) {
        try {
            page = Jsoup.connect(url).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
