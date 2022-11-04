

package fu.util.test;

import fu.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;


public class MathUtilityTest {
    
    public MathUtilityTest() {
        // mình sẽ test các tình huống xái hàm getFactotial() ở đây
        // tình huống xài hàm, test hàm gọi là TEST CASES
        // thường ta có tình huống thành công và thất bại
        // thành công: đưa vào value hợp lệ 0..20
        // thất bại: đưa vào âm, > 20, bị ăn đòn
        // hàm phải bắt các tình huống này, và giờ ta test thử coi hàm xử lí đúng ko
    }
        @Test // biến hàm này thành public static void main()
        // quy tắc đặt tên hàm cho việc TEST phần mềm : rất nhiều quy tắc
        // nhưng nói chung hàm sẽ bao gồm ngữ nghĩa kết quả trả về, tình trạng test
        // ko giống quy tắc đặt tên hàm khi viết app
        // mình đang viết code để test app
    
    //  mình muốn test hàm trả về ngon nếu đưa tham số ngon    
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        // coi có đúng là 5! trả về 120 hay ko
        // có XANH, ko ĐỎ
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(6, MathUtility.getFactorial(3));
    } // tui muốn thấy xanh ở trên Git, ko xem ở đây
    
    // MẶC ĐỊNH CODE TEST ĐỘC LẬP VỚI CODE CHÍNH
    // ĐỘC LẬP VỚI QUÁ TRÌNH CLEAN&BUILD, TỨC LÀ DÙ CODE BẠN XANH HAY ĐỎ
    // MIỄN LÀ KO BỊ ERROR CÚ PHÁP
    // BẠN LUÔN ĐÓNG GÓI RA ĐƯỢC FILE .JAR .WAR( CHẤP XANH ĐỎ)
    
    // HỢP LOGIC THÌ XANH, TỨC LÀ MÀU XANH LÀ CHUẨN THÌ MỚI RA ĐC .JAR .WAR
    // VẬY TA CẦN CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUILD .JAR .WAR
    // CÁCH KHÁC: NẾU CODE ĐANG MÀU ĐỎ THÌ DISABLE CÁI NÚT BẤM CLEAN&BUILD
}
