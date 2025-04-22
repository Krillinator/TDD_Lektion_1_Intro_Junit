import com.demo.lektion1.DiscountService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountServiceTest {

    // Discount
    // sum 500 - 10 %
    @Test
    void applyDiscountWhenSumExceeds500WithTenPercent() {

        // Init
        DiscountService discountService = new DiscountService();
        double sum = 500;
        double discount = 10; // Percentage

        discountService.discount = discount;
        discountService.sum = sum;

        System.out.println(discountService.applyDiscount()); // 500

        // applyDiscount()
        assertEquals(450, discountService.applyDiscount());

    }

    @Test
    void doNotApplyDiscountWhenSumIsUnder500() {
        DiscountService discountService = new DiscountService();
        double sum = 499;
        double discount = 0; // ??

        discountService.sum = sum;
        discountService.discount = discount;

        assertEquals(499, discountService.applyDiscount());
    }

}
