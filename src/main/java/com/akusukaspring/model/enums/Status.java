package com.akusukaspring.model.enums;

/**
 * Created by Vincentius Dito on 06/06/2017.
 */
public enum Status {
    AKTIF("Aktif"),
    NONAKTIF("Non-Aktif");

    private final String type;

    Status(String type) {
        this.type = type;
    }
}
