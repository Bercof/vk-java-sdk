// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.market;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.market.responses.GetCategoriesNewResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Market.getCategories method
 */
public class MarketGetCategoriesQueryWithNew extends AbstractQueryBuilder<MarketGetCategoriesQueryWithNew, GetCategoriesNewResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MarketGetCategoriesQueryWithNew(VkApiClient client, UserActor actor) {
        super(client, "market.getCategories", GetCategoriesNewResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Group Id.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public MarketGetCategoriesQueryWithNew groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Set album id
     *
     * @param value value of "album id" parameter. Minimum is 1.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("album_id")
    public MarketGetCategoriesQueryWithNew albumId(Integer value) {
        return unsafeParam("album_id", value);
    }

    @Override
    protected MarketGetCategoriesQueryWithNew getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
