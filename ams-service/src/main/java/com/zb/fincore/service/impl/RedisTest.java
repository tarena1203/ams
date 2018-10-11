package com.zb.fincore.service.impl;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;


public class RedisTest {

	public static void main(String[] args) {
		
//		Jedis jedis = new Jedis("127.0.0.1",6379);
		
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(100);
		config.setMaxIdle(10);
		config.setTestOnBorrow(true);
		
		JedisPool pool = new JedisPool(config,"127.0.0.1",6379);
		Jedis jedis = pool.getResource();
		jedis.set("name", "lijun");
		
		System.out.println(jedis.get("name"));
		
		jedis.close();
		pool.close();
		
		
		
	}
}
