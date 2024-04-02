package main;

import java.util.ArrayList;

public class SyntaxAndBitWise {
    /*
     * Ôn lại về đơn vị bộ nhớ
     * Bit(b): biểu diễn dưới dạng 1010101
     * Byte(B): 1 byte = 8 bit
     * Kilobyte(KB): 1KB = 1024 byte (2^10 byte)
     * Megabyte(MB): 1mb = 1024 KB (2^20 byte)
     * Gigabyte(GB): 1GB = 1024 MB (2^30 byte)
     * Terabyte(TB): 1TB = 1024 GB (2^40 byte)
     * Petabyte(PB): 1PB = 1024 TB (2^50 byte)
     * */

//        byte: Kích thước là 1 byte (8 bits), có giá trị từ -128 đến 127.
//        short: Kích thước là 2 byte (16 bits), có giá trị từ -32,768 đến 32,767.
//        int: Kích thước là 4 byte (32 bits), có giá trị từ -2^31 đến (2^31 - 1).
//        long: Kích thước là 8 byte (64 bits), có giá trị từ -2^63 đến (2^63 - 1).
//        float: Kích thước là 4 byte (32 bits), có khoảng 6-7 chữ số thập phân với độ chính xác.
//        double: Kích thước là 8 byte (64 bits), có khoảng 15 chữ số thập phân với độ chính xác.
//        char: Kích thước là 2 byte (16 bits), biểu diễn một ký tự Unicode và có giá trị từ 0 đến 65,535.


    public static void main(String[] args) {
        //Toán tử Main
        System.out.println(7 >> 2);
        //0111
        //Dịch sang phải 2 => 0001
        System.out.println(7 << 2);
        //0111
        //Dịch sang trái 2 => 1100
        ArrayList<String> arr= new ArrayList<>();

        //Toán tử bitwise
        //^ XOR: Trả về đúng khi 2 vế khác nhau
        System.out.println(true ^ true);

        //& AND: Trả về đúng khi 2 vế cùng trả về true
        System.out.println(true & true);

        System.out.println(~1);
    }
}