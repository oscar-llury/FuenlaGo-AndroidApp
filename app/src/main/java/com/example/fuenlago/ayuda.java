package com.example.fuenlago;

public class ayuda {

    private static  boolean showAyuda = true;

    public ayuda() {
        this.showAyuda = true;
    }

    public static boolean isShowAyuda() {
        return showAyuda;
    }

    public static void setShowAyuda(boolean prueba) {
        showAyuda = prueba;
    }
}
