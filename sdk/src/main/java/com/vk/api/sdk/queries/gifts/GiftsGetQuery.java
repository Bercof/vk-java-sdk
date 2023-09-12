// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.gifts;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.gifts.responses.GetResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Gifts.get method
 */
public class GiftsGetQuery extends AbstractQueryBuilder<GiftsGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public GiftsGetQuery(VkApiClient client, UserActor actor) {
        super(client, "gifts.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID.
     *
     * @param value value of "user id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public GiftsGetQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Number of gifts to return.
     *
     * @param value value of "count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("count")
    public GiftsGetQuery count(Integer value) {
        return unsafeParam("count", value);
    }

    /**
     * Offset needed to return a specific subset of results.
     *
     * @param value value of "offset" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("offset")
    public GiftsGetQuery offset(Integer value) {
        return unsafeParam("offset", value);
    }

    @Override
    protected GiftsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
