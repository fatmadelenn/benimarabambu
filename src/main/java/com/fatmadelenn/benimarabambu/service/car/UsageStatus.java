package com.fatmadelenn.benimarabambu.service.car;

public enum UsageStatus {

    IN_USE("In use"),

    RESERVED("Reserved"),

    NOT_USED("Not used");

    public final String value;

    UsageStatus(String value) {
        this.value = value;
    }

    public static UsageStatus fromString(String text) {
        if (text != null) {
            for (UsageStatus status : UsageStatus.values()) {
                if (text.equalsIgnoreCase(status.value)) {
                    return status;
                }
            }
        }
        return null;
    }
}
