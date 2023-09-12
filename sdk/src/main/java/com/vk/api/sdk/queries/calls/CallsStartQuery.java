// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.calls;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.calls.responses.StartResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Calls.start method
 */
public class CallsStartQuery extends AbstractQueryBuilder<CallsStartQuery, StartResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public CallsStartQuery(VkApiClient client, UserActor actor) {
        super(client, "calls.start", StartResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set group id
     *
     * @param value value of "group id" parameter. By default 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public CallsStartQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    @Override
    protected CallsStartQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
