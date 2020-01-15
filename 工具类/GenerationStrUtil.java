package util;

import java.util.Random;

public  class GenerationStrUtil {

    public static String getRandomString(int length){
        //1.  定义一个字符串（A-F，0-9）即16个数字字母；
        String str="ABCDEF1234567890";
        //2.  由Random生成随机数
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        //3.  长度为几就循环几次
        for(int i=0; i<length; ++i){
            //从62个的数字或字母中选择
            int number=random.nextInt(16);
            //将产生的数字通过length次承载到sb中
            sb.append(str.charAt(number));
        }
        //将承载的字符转换成字符串
        return sb.toString();
    }
}
