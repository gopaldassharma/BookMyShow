package com.BookmyShow.BookMyShow.model;

import com.BookmyShow.BookMyShow.enums.PaymentMethodType;
import com.BookmyShow.BookMyShow.enums.PaymentStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel{
    private String reference;
    private double amount;
    private PaymentMethodType providerType;
    private PaymentStatus status;

}
