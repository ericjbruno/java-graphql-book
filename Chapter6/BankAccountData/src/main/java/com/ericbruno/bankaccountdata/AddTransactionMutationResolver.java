package com.ericbruno.bankaccountdata;


@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2024-07-21T20:10:42-0400"
)
public interface AddTransactionMutationResolver {

    Boolean addTransaction(@javax.validation.constraints.NotNull String accountId, Double amount) throws Exception;

}
