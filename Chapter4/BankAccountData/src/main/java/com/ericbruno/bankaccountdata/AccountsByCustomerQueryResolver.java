package com.ericbruno.bankaccountdata;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2024-07-01T13:10:55-0400"
)
public interface AccountsByCustomerQueryResolver {

    java.util.List<Account> accountsByCustomer(@javax.validation.constraints.NotNull String customerId) throws Exception;

}