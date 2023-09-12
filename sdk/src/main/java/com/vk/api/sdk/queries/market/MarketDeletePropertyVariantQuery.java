// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.deletePropertyVariant method
 */
public class MarketDeletePropertyVariantQuery extends AbstractQueryBuilder<MarketDeletePropertyVariantQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param variantId value of "variant id" parameter. Minimum is 0.
     */
    public MarketDeletePropertyVariantQuery(VkApiClient client, UserActor actor, Long groupId,
            Integer variantId) {
        super(client, "market.deletePropertyVariant", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        variantId(variantId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketDeletePropertyVariantQuery(VkApiClient client, UserActor actor) {
        super(client, "market.deletePropertyVariant", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Group id.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MarketDeletePropertyVariantQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Variant id.
     *
     * @param value value of "variant id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("variant_id")
    public MarketDeletePropertyVariantQuery variantId(Integer value) {
        return unsafeParam("variant_id", value);
    }

    @Override
    protected MarketDeletePropertyVariantQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "variant_id", "access_token");
    }
}
