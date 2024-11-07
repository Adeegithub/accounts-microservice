package com.eazybank.accounts.mapper;

import com.eazybank.accounts.dto.AccountsDto;
import com.eazybank.accounts.entity.Accounts;

/*
Mapper Class is responsible for,
Mapping DTO -> Entity
Mapping Entity -> DTO
 */
public class AccountsMapper {
    public static AccountsDto mapToAccountsDTO(Accounts accounts, AccountsDto accountsDto){
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts){
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
