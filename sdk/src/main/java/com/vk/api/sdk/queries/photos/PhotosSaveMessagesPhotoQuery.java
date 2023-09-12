// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.photos.responses.SaveMessagesPhotoResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.saveMessagesPhoto method
 */
public class PhotosSaveMessagesPhotoQuery extends AbstractQueryBuilder<PhotosSaveMessagesPhotoQuery, List<SaveMessagesPhotoResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param photo value of "photo" parameter.
     */
    public PhotosSaveMessagesPhotoQuery(VkApiClient client, GroupActor actor, String photo) {
        super(client, "photos.saveMessagesPhoto", Utils.buildParametrizedType(List.class, SaveMessagesPhotoResponse.class));
        accessToken(actor.getAccessToken());
        photo(photo);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosSaveMessagesPhotoQuery(VkApiClient client, GroupActor actor) {
        super(client, "photos.saveMessagesPhoto", Utils.buildParametrizedType(List.class, SaveMessagesPhotoResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param photo value of "photo" parameter.
     */
    public PhotosSaveMessagesPhotoQuery(VkApiClient client, UserActor actor, String photo) {
        super(client, "photos.saveMessagesPhoto", Utils.buildParametrizedType(List.class, SaveMessagesPhotoResponse.class));
        accessToken(actor.getAccessToken());
        photo(photo);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosSaveMessagesPhotoQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.saveMessagesPhoto", Utils.buildParametrizedType(List.class, SaveMessagesPhotoResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Parameter returned when the photo is [vk.com/dev/upload_files|uploaded to the server].
     *
     * @param value value of "photo" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo")
    public PhotosSaveMessagesPhotoQuery photo(String value) {
        return unsafeParam("photo", value);
    }

    /**
     * Set server
     *
     * @param value value of "server" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("server")
    public PhotosSaveMessagesPhotoQuery server(Integer value) {
        return unsafeParam("server", value);
    }

    /**
     * Set hash
     *
     * @param value value of "hash" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("hash")
    public PhotosSaveMessagesPhotoQuery hash(String value) {
        return unsafeParam("hash", value);
    }

    @Override
    protected PhotosSaveMessagesPhotoQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("photo", "access_token");
    }
}
