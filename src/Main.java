import java.io.FileReader;
import java.util.Scanner;
import java.nio.*;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{1,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] b=new int[20];
        for(int i=0;i<a.length;i++){
            b[a[i]]++;
        }
        int max=b[0];   //定义次数
        int value=0;    //定义最大值
        for(int i=1;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
                value=i;
            }
        }
        System.out.print("出现次数最多的值是:"+value+", 出现了"+max+"次");
    }
}
