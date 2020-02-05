package fun.ticsmyc.pojo;

import java.util.Objects;

/**
 * @author CTX
 * @since 2020/2/4 16:56
 */
public class RymorList {
    /*"id":110,
    "title":"新冠病毒可以通过蚊虫叮咬传播？",
    "mainSummary":"丁香医生团队辟谣：目前没有证据",
    "summary":"",
    "body":"在国家卫健委印发的《新型冠状病毒感染的肺炎诊疗方案（试行第四版）》中显示，新型冠状病毒主要通过呼吸道飞沫传播，亦可通过接触传播。并没有提到虫媒传播（蚊虫叮咬传播）。",
    "sourceUrl":"",
    "score":1000,
    "rumorType":0
     */
    private int id;
    private String title;
    private String mainSummary;
    private String summary;
    private String body;
    private String sourceUrl;
    private int score;
    private int rumorType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainSummary() {
        return mainSummary;
    }

    public void setMainSummary(String mainSummary) {
        this.mainSummary = mainSummary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getRumorType() {
        return rumorType;
    }

    public void setRumorType(int rumorType) {
        this.rumorType = rumorType;
    }

    @Override
    public String toString() {
        return "RymorList{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", mainSummary='" + mainSummary + '\'' +
                ", summary='" + summary + '\'' +
                ", body='" + body + '\'' +
                ", sourceUrl='" + sourceUrl + '\'' +
                ", score=" + score +
                ", rumorType=" + rumorType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RymorList)) return false;
        RymorList that = (RymorList) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
