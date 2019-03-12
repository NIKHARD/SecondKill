package com.bjpowernode.seckill.constants;

/**
 * ClassName:Constants
 * package:com.bjpowernode.seckill.constants
 * Description:
 *
 * @date:2019/1/2 22:11
 * @author: NIK
 */
public class Constants {

    /**
     * redis中的秒杀商品信息key的前缀
     *
     * redis:goods:1
     * redis:goods:2
     * redis:goods:3
     * redis:goods:4
     * redis:goods:5
     * redis:goods:6
     * redis:goods:7
     */
    public static final String REDIS_GOODS = "redis:goods:";

    /**
     * 登录的用户
     */
    public static final String SESSION_USER = "user";

    /**
     * 1
     */
    public static final int ONE = 1;

    /**
     * 0
     */
    public static final int ZERO = 0;

    /**
     * redis:store:1
     * redis:store:2
     *
     *
     *
     */
    public static final String REDIS_STORE = "redis:store:";

    /**
     * redis:buy:1:uid
     * redis:buy:2:uid
     *
     *
     *
     *
     */
    public static final String REDIS_BUY = "redis:buy:";

    /**
     * redis:limit:1
     * redis:limit:2
     *
     *
     *
     *
     */
    public static final String REDIS_LIMIT = "redis:limit:";

    /**
     * 最大限流量
     */
    public static final int MAXLIMIT = 100000;
}
