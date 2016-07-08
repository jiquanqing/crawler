package com.qjq.crawler.domain;

/**
 * 
 * Description: TODO 配置
 * 
 * @author qingjiquan@bubugao.com
 * @Date 2016年7月7日 下午4:21:07
 * @version 1.0
 * @since JDK 1.7
 */
public class CrawlerConfig {

    private String baseUrl;     //基础url

    private String crawlerType; //crawler类型 纵向 横向 (需要告诉url起止点)
    
    private Integer extendDeep; //根据baseUrl 扩展深度
    
    private Long startPoint;    
    
    private Long endPoint;
    
    private Integer threadNum;  //启的线程数据
    
    private String mongoCollectionName; //存储的集合名称
    
    private Long sleepMills;    //暂停时间 毫秒
    
    
    
    

}
