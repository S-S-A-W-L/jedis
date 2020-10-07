import com.alibaba.fastjson.JSONObject;
import com.lk.user.User;
import redis.clients.jedis.Jedis;

public class JedisDemo {
    public static void main(String[] args) {
        //生成Jedis对象，负责和Redis实例进行通信
        Jedis jedis = new Jedis("192.168.1.119",6379);
        jedis.auth("123456");
        //jedis执行操作
        jedis.set("hello","world");
        //jedis执行get操作，获取hello的值
        String hello = jedis.get("hello");
        System.out.println(hello);

        //User user = new User();
        //user.setName("唐三");
        //user.setAge(18);

        //String string = JSONObject.toJSONString(user);
        //System.out.println(string);
    }
}
