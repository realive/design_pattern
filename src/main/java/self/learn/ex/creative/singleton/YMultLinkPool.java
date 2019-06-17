package self.learn.ex.creative.singleton;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wyyangyang1 on 2019/6/17.
 * 首先连接池设计为单例
 * 池子里的连接，设计为有限多例
 * 获取和释放连接可能有多线程安全问题 加synchronize性能会差 后续再优化
 */
public class YMultLinkPool {
    private static YMultLinkPool pool = new YMultLinkPool();
    class YMultLink{
        int number;
        YMultLink(int n){
            this.number = n;
            System.out.println("创建一个链接:"+n);
        }
    }
    private AtomicInteger n = new AtomicInteger(0);
    private int initSize = 10;
    private int maxSize = 100;
    private int step = 5;
    private Vector<YMultLink> usingList ;
    private Vector<YMultLink> unusedList ;

    public static YMultLinkPool getPool(){
        return pool;
    }
    private YMultLinkPool(){
        usingList = new Vector<YMultLink>();
        unusedList = new Vector<YMultLink>();
        for (int i = 0; i < initSize; i++) {
            unusedList.add(new YMultLink(n.getAndIncrement()));
        }
    }
    public YMultLink getLink() throws Exception {
        YMultLink link;
        if(unusedList.size()!=0){

        }else if(usingList.size()>=maxSize){
            throw new Exception("链接池已满，并且所有连接均被占用");
        }else {
            for (int i = 0; i < step; i++) {
                unusedList.add(new YMultLink(n.getAndIncrement()));
            }
        }
        link = unusedList.get(0);
        unusedList.remove(link);
        usingList.add(link);
        return link;
    }
    public void releaseLink(YMultLink link){
        usingList.remove(link);
        if(unusedList.size()<=initSize){
            unusedList.add(link);
        }
    }

}
