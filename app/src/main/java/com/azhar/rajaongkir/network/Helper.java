package com.azhar.rajaongkir.network;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Nur Fauzan Halim on 12-07-2022
 */

public class Helper {
    public static boolean tiki = false;
    public static boolean jne = false;
    public static boolean pos = false;

    public static String formatRupiah(int price) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat format = NumberFormat.getCurrencyInstance(localeID);
        return format.format(price);
    }
}
