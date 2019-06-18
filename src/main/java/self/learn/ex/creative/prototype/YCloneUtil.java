package self.learn.ex.creative.prototype;



import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.testng.annotations.Test;
import self.learn.ex.creative.singleton.YMultLinkPool;

import java.io.*;
import java.lang.reflect.ParameterizedType;

/**
 * Created by wyyangyang1 on 2019/6/18.
 */

public class YCloneUtil implements Serializable{
//    public YCloneUtil(){}
//    private static final long serialVersionUID = 1997946132331235076L;

    public static <T extends Serializable> T deepCloneByByteArrayStream(T obj){
        T cloneObj = null;
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            objOut.writeObject(obj);
            objOut.close();

            ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
            ObjectInputStream objIn = new ObjectInputStream(in);
            cloneObj = (T)objIn.readObject();
            objIn.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cloneObj;

    }
    public static <T extends Serializable> T deepCloneByJason(T obj){
        ObjectMapper mapper = new ObjectMapper();
        T result = null;
        try {
            String jason = mapper.writeValueAsString(obj);
            result = (T) mapper.readValue(jason ,obj.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Getter
    @Setter
    @ToString
    class Person implements Serializable {
        public Person(){

        }
        private static final long serialVersionUID = -5644807480459874733L;
        boolean woman;
        String name;
        Address address;
        public Person(String name, boolean woman ,Address address){
            this.woman = woman;
            this.name = name;
            this.address = address;
        }
    }
    @Getter
    @Setter
    @ToString
    class Address implements Serializable{
        private static final long serialVersionUID = 8564220899524774216L;
        String city;
        String detailAddress;
        public Address(String city,String detailAddress){
            this.city = city;
            this.detailAddress = detailAddress;
        }
    }

    @Test
    public void test(){
        Address address = new Address("成都","老会展");
        Person p1 = new Person("yy",false,address);
        Person p2 = YCloneUtil.deepCloneByJason(p1);
        Person p3 = YCloneUtil.deepCloneByByteArrayStream(p1);

        address.setCity("北京");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);



        char[][] a = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        char [][] a1 = YCloneUtil.deepCloneByByteArrayStream(a);
        char [][] a2 = YCloneUtil.deepCloneByJason(a);
        a1[0][2] = 'x';
        System.out.println(a.toString());
        System.out.println(a1.toString());
    }
}
