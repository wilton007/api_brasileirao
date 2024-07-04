package com.wilton.brasileirao.enums;

public enum StatusEnum {
    ATIVO(true),
    INATIVO(false)
    ;

    private final boolean status;

    StatusEnum(boolean status)  {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
