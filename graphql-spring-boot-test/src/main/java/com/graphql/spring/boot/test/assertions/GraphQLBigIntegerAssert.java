package com.graphql.spring.boot.test.assertions;

import com.graphql.spring.boot.test.GraphQLResponse;
import org.assertj.core.api.AbstractBigIntegerAssert;

import java.math.BigInteger;

public class GraphQLBigIntegerAssert extends AbstractBigIntegerAssert<GraphQLBigIntegerAssert>
    implements GraphQLResponseAssertion {

    private final GraphQLResponse graphQlResponse;

    public GraphQLBigIntegerAssert(final GraphQLResponse graphQLResponse, final BigInteger actual) {
        super(actual, GraphQLBigIntegerAssert.class);
        this.graphQlResponse = graphQLResponse;
    }

    @Override
    public GraphQLResponse and() {
        return graphQlResponse;
    }
}
