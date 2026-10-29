package dio.budgeting.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest {

    @Test
    void shouldCreateTransactionWithValidData() {
        Transaction transaction = new Transaction(
                "Compra no mercado",
                15000L,
                Category.GROCERIES
        );

        assertEquals("Compra no mercado", transaction.getDescription());
        assertEquals(15000L, transaction.getAmount());
        assertEquals(Category.GROCERIES, transaction.getCategory());
        assertNotNull(transaction.getId());
    }

    @Test
    void shouldRejectBlankDescription() {
        assertThrows(IllegalArgumentException.class, () ->
                new Transaction("   ", 15000L, Category.GROCERIES)
        );
    }

    @Test
    void shouldRejectNullCategory() {
        assertThrows(IllegalArgumentException.class, () ->
                new Transaction("Compra no mercado", 15000L, null)
        );
    }
}
