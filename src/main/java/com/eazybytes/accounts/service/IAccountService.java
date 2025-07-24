package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /*

        @param customerDto -CustomerDto Object
     */

    void createAccount(CustomerDto customerDto);


    /*

    @param mobileNumber - Input mobile Number
    @return Account details based on a given number
     */

    CustomerDto fetchAccount(String mobileNumber);
}
