import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void testDistance() {
        Point testPoint1 = new Point(-2.3, 4.0);
        Point testPoint2 = new Point(8.5, 0.7);

        Assert.assertEquals(testPoint1.distance(testPoint2), 11.292918134831227, 0.02);
    }
}