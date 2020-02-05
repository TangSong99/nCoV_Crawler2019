# 新型肺炎疫情数据Web爬虫+数据持久化+邮件通知
数据源 ：丁香园 https://ncov.dxy.cn/ncovh5/view/pneumonia_peopleapp

项目参考：https://gitee.com/TicsmycL/nCoV_Crawler2019
* 共四部分数据： 实时新闻 + 全局信息（全国 确诊x例 疑似x例 死亡x例 治愈x例）+ 各省份疫情 + 辟谣
* 数据库用MYSQL，建表语句在SQL目录下
* 功能：
  * jsoup获取数据，正则匹配筛选数据
  * 用mybatis+mysql做数据持久化
  * 数据发生变化时，发邮件通知
* 附：本项目仅供学习，持续更新请关注参考项目
