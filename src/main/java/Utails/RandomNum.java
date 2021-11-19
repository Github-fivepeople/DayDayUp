package Utails;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {

        //这里的32是生成32位随机码，根据你的需求，自定义
        String randomSmall = getRandomStringSmall(32);
        String randomBig = getRandomStringBig(32);
        String randomNum = getRandomString(32);
        System.out.println(randomSmall);
        System.out.println(randomBig);
        System.out.println(randomNum);

    }

    //获取一个32随机数（大写字母和数字组成）
    public static String getRandomString(int length){

        //1.定义一个字符串（A-Z，a-z，0-9）即62个数字字母；
        String str="zxcvbnmlkjhgfdsaqwertyuiopQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        //2.由Random生成随机数
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        //3.长度为几就循环几次
        for(int i=0; i<length; ++i){
            //从62个的数字或字母中选择
            int number=random.nextInt(62);
            //将产生的数字通过length次承载到sb中
            sb.append(str.charAt(number));
        }

        //将承载的字符转换成字符串
        return sb.toString();
    }

    //获取一个32随机数（大写字母和数字组成）
    public static String getRandomStringSmall(int length){

        //1.定义一个字符串（a-z，0-9）即36个数字字母；
        String str="zxcvbnmlkjhgfdsaqwertyuiop1234567890";

        //2.由Random生成随机数
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        //3.长度为几就循环几次
        for(int i=0; i<length; ++i){
            //从36个的数字或字母中选择
            int number=random.nextInt(36);
            //将产生的数字通过length次承载到sb中
            sb.append(str.charAt(number));
        }

        //将承载的字符转换成字符串
        return sb.toString();
    }

    //获取一个32随机数（大写字母和数字组成）
    public static String getRandomStringBig(int length){

        //1.定义一个字符串（A-Z，0-9）即36个数字字母；
        String str="QWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        //2.由Random生成随机数
        Random random = new Random();
        StringBuffer sb = new StringBuffer();

        //3.长度为几就循环几次
        for(int i=0; i<length; ++i){
            //从36个的数字或字母中选择
            int number=random.nextInt(36);
            //将产生的数字通过length次承载到sb中
            sb.append(str.charAt(number));
        }

        //将承载的字符转换成字符串
        return sb.toString();
    }
}
