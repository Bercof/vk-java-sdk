// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.photos;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Photos.delete method
 */
public class PhotosDeleteQuery extends AbstractQueryBuilder<PhotosDeleteQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public PhotosDeleteQuery(VkApiClient client, UserActor actor) {
        super(client, "photos.delete", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the user or community that owns the photo.
     *
     * @param value value of "owner id" parameter. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("owner_id")
    public PhotosDeleteQuery ownerId(Long value) {
        return unsafeParam("owner_id", value);
    }

    /**
     * Photo ID.
     *
     * @param value value of "photo id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photo_id")
    public PhotosDeleteQuery photoId(Integer value) {
        return unsafeParam("photo_id", value);
    }

    /**
     * photos
     * Set photos
     *
     * @param value value of "photos" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photos")
    public PhotosDeleteQuery photos(String... value) {
        return unsafeParam("photos", value);
    }

    /**
     * Set photos
     *
     * @param value value of "photos" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("photos")
    public PhotosDeleteQuery photos(List<String> value) {
        return unsafeParam("photos", value);
    }

    @Override
    protected PhotosDeleteQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
