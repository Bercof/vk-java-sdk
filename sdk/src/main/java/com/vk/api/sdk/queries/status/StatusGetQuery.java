// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.status;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.status.responses.GetResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Status.get method
 */
public class StatusGetQuery extends AbstractQueryBuilder<StatusGetQuery, GetResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StatusGetQuery(VkApiClient client, UserActor actor) {
        super(client, "status.get", GetResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * User ID or community ID. Use a negative value to designate a community ID.
     *
     * @param value value of "user id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("user_id")
    public StatusGetQuery userId(Long value) {
        return unsafeParam("user_id", value);
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public StatusGetQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected StatusGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
