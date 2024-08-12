package com.ericbruno.bankaccountdata;

@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2024-07-21T20:10:42-0400"
)
public enum AccountType {

    BASIC_CHECKING("BASIC_CHECKING"),
    ADVANCED_CHECKING("ADVANCED_CHECKING"),
    BUSINESS_CHECKING("BUSINESS_CHECKING"),
    SAVINGS("SAVINGS");

    private final String graphqlName;

    private AccountType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
