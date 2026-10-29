package dio.budgeting.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Transaction {
    private TransactionId id;
    private String description;
    private long amount;
    private Category category;

    public Transaction(String description, long amount, Category category) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia.");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero.");
        }

        if (category == null) {
            throw new IllegalArgumentException("A categoria não pode ser nula.");
        }

        this.id = new TransactionId();
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}
