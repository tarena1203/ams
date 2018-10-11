package com.zb.fincore;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class CuratorWatcher1 {

	private static final String CONNECT_ADDR = "127.0.0.1:2181";
  
    private static final int SESSION_TIMEOUT = 15000;
 
    public static void main(String[] args) throws Exception {
        RetryPolicy policy = new ExponentialBackoffRetry(1000, 10);
        CuratorFramework curator = CuratorFrameworkFactory.builder().connectString(CONNECT_ADDR)
                .sessionTimeoutMs(SESSION_TIMEOUT).retryPolicy(policy).build();
        curator.start();
        //最后一个参数表示是否进行压缩
        final NodeCache cache = new NodeCache(curator, "/zkConfig/ams_cfg", false);
        cache.start(true);
        //只会监听节点的创建和修改，删除不会监听
        cache.getListenable().addListener(new NodeCacheListener(){

			@Override
			public void nodeChanged() throws Exception {
				 System.out.println("路径：" + cache.getCurrentData().getPath());
		         System.out.println("数据：" + new String(cache.getCurrentData().getData()));
		         System.out.println("状态：" + cache.getCurrentData().getStat());
			}
        	
        });
        
//        cache.getListenable().addListener(() -> {
//            System.out.println("路径：" + cache.getCurrentData().getPath());
//            System.out.println("数据：" + new String(cache.getCurrentData().getData()));
//            System.out.println("状态：" + cache.getCurrentData().getStat());
//        });
 
//        curator.create().forPath("/zkConfig2/ams_cfg", "1234".getBytes());
//        Thread.sleep(3000);
//        curator.setData().forPath("/zkConfig2/ams_cfg", "5678".getBytes());
//        Thread.sleep(3000);
//        curator.delete().forPath("/zkConfig2/ams_cfg");
//        Thread.sleep(5000);
//        curator.close();
        
        System.in.read();
    }


}
