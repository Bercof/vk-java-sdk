// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.messages;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.messages.responses.GetReactedPeersResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Messages.getReactedPeers method
 */
public class MessagesGetReactedPeersQuery extends AbstractQueryBuilder<MessagesGetReactedPeersQuery, GetReactedPeersResponse> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     * @param cmid value of "cmid" parameter. Minimum is 0.
     */
    public MessagesGetReactedPeersQuery(VkApiClient client, GroupActor actor, Long peerId,
            Integer cmid) {
        super(client, "messages.getReactedPeers", GetReactedPeersResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        cmid(cmid);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build group api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetReactedPeersQuery(VkApiClient client, GroupActor actor) {
        super(client, "messages.getReactedPeers", GetReactedPeersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     * @param peerId value of "peer id" parameter. Entity - peer
     *
     * @param cmid value of "cmid" parameter. Minimum is 0.
     */
    public MessagesGetReactedPeersQuery(VkApiClient client, UserActor actor, Long peerId,
            Integer cmid) {
        super(client, "messages.getReactedPeers", GetReactedPeersResponse.class);
        accessToken(actor.getAccessToken());
        peerId(peerId);
        cmid(cmid);
    }

    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public MessagesGetReactedPeersQuery(VkApiClient client, UserActor actor) {
        super(client, "messages.getReactedPeers", GetReactedPeersResponse.class);
        accessToken(actor.getAccessToken());
    }

    /**
     * Set peer id
     *
     * @param value value of "peer id" parameter. Entity - peer
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("peer_id")
    public MessagesGetReactedPeersQuery peerId(Long value) {
        return unsafeParam("peer_id", value);
    }

    /**
     * Set cmid
     *
     * @param value value of "cmid" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("cmid")
    public MessagesGetReactedPeersQuery cmid(Integer value) {
        return unsafeParam("cmid", value);
    }

    /**
     * Set reaction id
     *
     * @param value value of "reaction id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("reaction_id")
    public MessagesGetReactedPeersQuery reactionId(Integer value) {
        return unsafeParam("reaction_id", value);
    }

    @Override
    protected MessagesGetReactedPeersQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("peer_id", "cmid", "access_token");
    }
}
