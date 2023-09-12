// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.asr;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.base.responses.GetUploadServerResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Asr.getUploadUrl method
 */
public class AsrGetUploadUrlQuery extends AbstractQueryBuilder<AsrGetUploadUrlQuery, GetUploadServerResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build service api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public AsrGetUploadUrlQuery(VkApiClient client, ServiceActor actor) {
        super(client, "asr.getUploadUrl", GetUploadServerResponse.class);
        accessToken(actor.getAccessToken());
        clientSecret(actor.getClientSecret());
    }

    @Override
    protected AsrGetUploadUrlQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
