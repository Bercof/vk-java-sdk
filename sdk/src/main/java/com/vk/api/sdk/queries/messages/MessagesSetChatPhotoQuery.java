// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.SetChatPhotoResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.setChatPhoto method
 */
public class MessagesSetChatPhotoQuery extends AbstractQueryBuilder<MessagesSetChatPhotoQuery, SetChatPhotoResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param file value of "file" parameter.
     */
    public MessagesSetChatPhotoQuery(VkApiClient client, GroupActor actor, String file) {
        super(client, "messages.setChatPhoto", SetChatPhotoResponse.class);
        accessToken(actor.getAccessToken());
        file(file);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSetChatPhotoQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.setChatPhoto", SetChatPhotoResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param file value of "file" parameter.
     */
    public MessagesSetChatPhotoQuery(VkApiClient client, UserActor actor, String file) {
        super(client, "messages.setChatPhoto", SetChatPhotoResponse.class);
        accessToken(actor.getAccessToken());
        file(file);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesSetChatPhotoQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.setChatPhoto", SetChatPhotoResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Upload URL from the 'response' field returned by the [vk.com/dev/photos.getChatUploadServer|photos.getChatUploadServer] method upon successfully uploading an image.
     *
     * @param value value of "file" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("file")
    public MessagesSetChatPhotoQuery file(String value) {
        return unsafeParam("file", value);
    }

    @Override
    protected MessagesSetChatPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("file", "access_token");
    }
}
