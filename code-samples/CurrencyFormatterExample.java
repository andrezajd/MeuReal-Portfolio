package portfolio.samples;

import java.text.NumberFormat;
import java.util.Locale;

/** Exemplo isolado de formatação monetária para pt-BR. */
public final class CurrencyFormatterExample {

    private static final Locale PT_BR = new Locale("pt", "BR");

    private CurrencyFormatterExample() {
    }

    public static String format(double value) {
        return NumberFormat.getCurrencyInstance(PT_BR).format(value);
    }
}

