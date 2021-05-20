package com.fatmadelenn.benimarabambu.service.car;

public enum TireType {

    COMPANY("company"),

    FOR_RENT("for rent"),

    FILO("filo");

    public final String value;

    TireType(String value) {
        this.value = value;
    }

    public static TireType fromString(String text) {
        if (text != null) {
            for (TireType status : TireType.values()) {
                if (text.equalsIgnoreCase(status.value)) {
                    return status;
                }
            }
        }
        return null;
    }
}
