package com.ericbruno.bankaccountdata;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2024-07-21T20:10:42-0400"
)
public interface AddCustomerMutationResolver {

    String addCustomer(String lastName, String firstName, String email, String street, String city, States state, String zip, String phone, String ssn) throws Exception;

}
