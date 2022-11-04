
package fu.util;

import java.util.Scanner;


public class MathUtility {
    
    // class nay chua cac ham tien ich dung chung cho moi noi
    // do đó nó phải là static
    
    public static final double PI = 3.1415;
    
    // ham tinh n giai thua, n >= 0 && n<=20
    // neu qua 20 tran kieu long
    // 0! = 1; 1! = 1; n! = 1.2.3...n 
    
//    public static long getFactorial(int n){
//       if(n < 0 || n > 20 )
//           throw new IllegalArgumentException("n must be >= 0 and <= 20");
//       // đưa đầu vào cà chớn, mình ko thèm trả về giá trị ám chỉ sai
//       if(n == 0 || n == 1)
//           return 1;
//       long result  =  1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//        
//    } 
    
    
     public static long getFactorial(int n){
       if(n < 0 || n > 20 )
           throw new IllegalArgumentException("n must be >= 0 and <= 20");
       // đưa đầu vào cà chớn, mình ko thèm trả về giá trị ám chỉ sai
       if(n == 0 || n == 1)
           return 1;       
       return  n * getFactorial(n - 1); // gọi lại chính mình với quy mô nhỏ hơn
    } 
    // Math.sqrt , .pow(a,b) a^b , abs() trị tuyệt đối , sin() 
    
    public static void main(String[] args) {
    // 2. test hàm = mắt
        System.out.println("5! : " + MathUtility.getFactorial(5));
        //         expected : 120,    actual:
        // tao hi vọng mày ói về 120 khi tao gọi hàm giai thừa ấy
        // và test bộ data khác , case khác, tình huống khác
        System.out.println("0! : " + MathUtility.getFactorial(0));
        //                 e : 1, a: 1 -> OK
        //e: ném về ngoại lệ IllegalArgumentException nếu giai thừa -5
        System.out.println("0! : " + MathUtility.getFactorial(-5));
        
        System.out.println("CI for today");
        
    }

    // Code viết ra thì Developer phải test trc
        // Có vài hình thức test code khác nhau
        // 1.TDD, test Driven Development
        // Viết dàn khung của hàm getFactorial(int n)
        // sau đó sử dụng hàm test()
        // chạy thử coi xanh đỏ , đỏ nghĩa là lỗi, xanh có nghĩa là ổn
        // cứ liên tục xanh đỏ trong quá trình viết code
        // và sửa code, Người ta gọi là lập trình hướng theo thỏa mãn
        // việc test, TDD
    // 2. sout(hàm kèm data) để coi kết quả ra saoc có đúng như mình kì vọng
       // nó phải trả về như thế này hay ko ==> xem kết quả test = mắt
    // 3. JoptionPane của bên javaDesktop để popup kết quả lên màn hình,
       // vẫn xem = mắt
    // viết một trang web gọi hàm xử lí...., 
    // ta chơi cách 1 và 2
    
}
