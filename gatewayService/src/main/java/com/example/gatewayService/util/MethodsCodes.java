package com.example.gatewayService.util;

import java.util.Arrays;

public enum MethodsCodes {

    GET_ALL_USERS(0, true),
    GET_USER_BY_ID(1, true),
    GET_USER_BY_EMAIL(2, true),
    CREATE_USER(3, false),
    UPDATE_USER(4, false),
    DELETE_USER(5, false),
    GET_ALL_CLIENTS(6, true),
    GET_CLIENT_BY_ID(7, true),
    CREATE_CLIENT(8, false),
    UPDATE_CLIENT(9, false),
    DELETE_CLIENT(10, false);
    private final Integer code;

    private final boolean hasResponse;

    public Integer getCode() {
        return code;
    }

    public boolean isHasResponse() {
        return hasResponse;
    }

    MethodsCodes(Integer code, boolean hasResponse) {
        this.code = code;
        this.hasResponse = hasResponse;
    }

    public static MethodsCodes searchByCode(Integer code) {
        return Arrays.stream(MethodsCodes.values()).filter(a -> a.getCode().equals(code)).findFirst().orElse(null);
    }


//    authenticateUser
//            authorizeUser
//    createOrder
//            updateOrder
//    deleteOrder
//            getOrderById
//    getOrdersByUser
//            getProductById
//    updateProductQuantity
//            getInventory
//    reserveProduct

//    getOrdersByClient
}
