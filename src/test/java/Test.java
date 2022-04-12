import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @创建人 anan
 * @创建时间 2022/4/9
 * @描述
 */
public class Test {

    @org.junit.Test
    public void test() throws Exception {
        //1.建立连接
        Jedis jedis = new Jedis("localhost", 6379);
        //2.操作
        jedis.set("username", "lisi");

        //3.关闭连接
        jedis.close();
    }

    @org.junit.Test
    public void test2() {
        JedisPool jedisPool = new JedisPool();
        Jedis jedis = jedisPool.getResource();
        jedis.set("username", "wanger");
        //归还到连接池中
        jedis.close();
    }
}
