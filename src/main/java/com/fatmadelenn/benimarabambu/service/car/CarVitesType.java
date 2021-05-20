package com.fatmadelenn.benimarabambu.service.car;

public enum CarVitesType {

    MANUAL("Manual"),

    AUTOMATIC("Automatic");

    public final String value;

    CarVitesType(String value) {
        this.value = value;
    }

    public static CarVitesType fromString(String text) {
        if (text != null) {
            for (CarVitesType type : CarVitesType.values()) {
                if (text.equalsIgnoreCase(type.value)) {
                    return type;
                }
            }
        }
        return null;
    }
}
