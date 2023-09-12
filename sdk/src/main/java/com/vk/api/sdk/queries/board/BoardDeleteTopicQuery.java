// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.board;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.base.responses.OkResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Board.deleteTopic method
 */
public class BoardDeleteTopicQuery extends AbstractQueryBuilder<BoardDeleteTopicQuery, OkResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param groupId value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @param topicId value of "topic id" parameter. Minimum is 0.
     */
    public BoardDeleteTopicQuery(VkApiClient client, UserActor actor, Long groupId,
            Integer topicId) {
        super(client, "board.deleteTopic", OkResponse.class);
        accessToken(actor.getAccessToken());
        groupId(groupId);
        topicId(topicId);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public BoardDeleteTopicQuery(VkApiClient client, UserActor actor) {
        super(client, "board.deleteTopic", OkResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * ID of the community that owns the discussion board.
     *
     * @param value value of "group id" parameter. Minimum is 1. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public BoardDeleteTopicQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Topic ID.
     *
     * @param value value of "topic id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("topic_id")
    public BoardDeleteTopicQuery topicId(Integer value) {
        return unsafeParam("topic_id", value);
    }

    @Override
    protected BoardDeleteTopicQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("group_id", "topic_id", "access_token");
    }
}
