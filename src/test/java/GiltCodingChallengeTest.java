import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GiltCodingChallengeTest extends TestCase{


    private void test(String file, String output) {

        try () {

        }
        catch() {

        }
        assertEquals();
    }

    @Test
    public void test_A_1_2() {
        test("input-1-2.txt", "No solution exists");
    }

    @Test
    public void test_B_2_2() {
        test("input-2-2.txt", "M M");
    }

    @Test
    public void test_C_2_3() {
        test("input-2-3.txt", "M M");
    }

    @Test
    public void test_D_5_3() {
        test("input-5-3.txt", "G G G G M");
    }

    @Test
    public void test_E_5_14() {
        test("input-5-14.txt", "G M G M G");
    }

    @Test
    public void test_F_9_70() {
        test("input-9-70.txt", "M M M G G M M G G");
    }

    @Test
    public void test_G_18_100() {
        test("input-18-100.txt", "M M G M G G G G M G G G G G G M G M");
    }

    @Test
    public void test_H_22_100() {
        test("input-22-100-a.txt", "M G G G G G G G G G G G G G G G M M G G M G");
    }

    @Test
    public void test_I_22_100() {
        test("input-22-100-b.txt", "No solution exists");
    }

    @Test
    public void test_J_24_40() {
        test("input-24-40.txt",
                "G M M G M M G M M G G M M M G G M M M M G M M G");
    }

    @Test
    public void test_K_24_100() {
        test("input-24-100.txt",
                "G G G G G G G G G G G M G G G G M M G G G G G G");
    }

    @Test
    public void test_L_26_100() {
        test("input-26-100.txt", "No solution exists");
    }

    @Test
    public void test_M_30_100() {
        test("input-30-100-a.txt",
                "G G M G G G G G G G G G G M G G G G G G G G G G M G G G G G");
    }

    @Test
    public void test_N_30_100() {
        test("input-30-100-b.txt", "No solution exists");
    }

    @Test
    public void test_O_40_40() {
        test("input-40-40.txt",
                "G G M G M G M M M G M G M M G G G G M M M M M M M M G G G G M G M G M G M M G G");
    }

    @Test
    public void test_P_50_100() {
        test("input-50-100.txt",
                "M M G G G G G G G G G G G M G G G G G M G G G G G G G G G G G G G G G G G G G G G G G G M G G G G G");
    }

    @Test
    public void test_Q_50_500() {
        test("input-50-500.txt",
                "M G M M G G M M M G G G G M M G G G M M M M M G G G M G G G G G M M M M G M M M M M M M M G G G M M");
    }

    @Test
    public void test_R_500_5000() {
        test("input-500-5000.txt",
                "G G G G M G G M G G G G G G G G G G G G G G G G M G G M G G G G G G G G G G G G G G M G G G G G G G M G G G G G G G G G G G G G G G G G G G G G G G G G M G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G M G G G G G G G G G G G G G G G M G G M G G G M G G G G M G G G G G G G G G G G G G G G G G G G M G G M G G G G G G G G G M G G G G G G G M G G G G G G G G G G G G G G G G G G M G G G G G G G M G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G M G G G G G G G G G G G G G G G G M G G G G G G G G G M G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G M G G G M G G G G G G G G G G G G G G G G G G G G G G G G G G G G M G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G M G G G G G G G M G G G G G G G G M G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G G M G G G G G G G G G G G G G M G G G G G G G G G G M G G G G G G G G G G G");
    }

}
