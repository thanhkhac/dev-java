package main;

public class XuLyChuoi {

    /*
    * String pool là một kĩ thuật trong java được dùng để tối ưu hóa quản lý bộ nhớ cho chuỗi
    * Khi sử dụng toán tử = với dấu ngoặc kép, Java sẽ kiểm tra chuỗi đó đã tồn tại trong String pool hay chưa
    * Nếu có rồi thì nó sẽ trả về địa chỉ, nếu không thì khởi tạo và trả về địa chỉ
    * */



    public static void main(String[] args) {
        String str2 = new String("Hello");
        String str = "Hello";
        String str1 = "Hello";


        System.out.printf("%s == %s == %s \n", str, str1, str == str1);
        System.out.printf("%s equal %s == %s \n", str, str1, str.equals(str1));

        System.out.println("Nếu chuỗi thứ nhất nhỏ hơn chuỗi thứ 2 thì trả về <0, bằng thì 0, hơn thì >0");
        System.out.printf("%s compareTo %s == %s \n", str, str1, str.compareTo(str1));


        System.out.printf("%s == %s == %s \n", str, str2, str == str2);


    }
}
