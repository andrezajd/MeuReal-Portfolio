package portfolio.samples;

import java.util.List;

/** Exemplo genérico, sem as regras de negócio do produto. */
public final class TransactionSummaryExample {

    public enum Type {
        INCOME,
        EXPENSE
    }

    public static final class Item {
        private final Type type;
        private final double amount;

        public Item(Type type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public Type getType() {
            return type;
        }

        public double getAmount() {
            return amount;
        }
    }

    public static final class Summary {
        private final double income;
        private final double expense;

        public Summary(double income, double expense) {
            this.income = income;
            this.expense = expense;
        }

        public double getIncome() {
            return income;
        }

        public double getExpense() {
            return expense;
        }

        public double getAvailable() {
            return income - expense;
        }
    }

    private TransactionSummaryExample() {
    }

    public static Summary calculate(List<Item> items) {
        double income = 0;
        double expense = 0;

        for (Item item : items) {
            if (item.getType() == Type.INCOME) {
                income += item.getAmount();
            } else {
                expense += item.getAmount();
            }
        }

        return new Summary(income, expense);
    }
}
