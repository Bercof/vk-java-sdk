// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.GroupActor;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.queries.stories.StoriesBanOwnerQuery;
import com.vk.api.sdk.queries.stories.StoriesDeleteQuery;
import com.vk.api.sdk.queries.stories.StoriesGetBannedQuery;
import com.vk.api.sdk.queries.stories.StoriesGetBannedQueryWithExtended;
import com.vk.api.sdk.queries.stories.StoriesGetByIdQueryWithExtended;
import com.vk.api.sdk.queries.stories.StoriesGetDetailedStatsQueryWithV5200;
import com.vk.api.sdk.queries.stories.StoriesGetPhotoUploadServerQuery;
import com.vk.api.sdk.queries.stories.StoriesGetQueryWithV5113;
import com.vk.api.sdk.queries.stories.StoriesGetRepliesQueryWithV5113;
import com.vk.api.sdk.queries.stories.StoriesGetStatsQuery;
import com.vk.api.sdk.queries.stories.StoriesGetVideoUploadServerQuery;
import com.vk.api.sdk.queries.stories.StoriesGetViewersQueryWithExtendedV5115;
import com.vk.api.sdk.queries.stories.StoriesHideAllRepliesQuery;
import com.vk.api.sdk.queries.stories.StoriesHideReplyQuery;
import com.vk.api.sdk.queries.stories.StoriesSaveQuery;
import com.vk.api.sdk.queries.stories.StoriesSearchQueryWithV5113;
import com.vk.api.sdk.queries.stories.StoriesSendInteractionQuery;
import com.vk.api.sdk.queries.stories.StoriesUnbanOwnerQuery;
import java.util.List;

/**
 * List of Stories methods
 */
public class Stories extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Stories(VkApiClient client) {
        super(client);
    }

    /**
     * Allows to hide stories from chosen sources from current user's feed.
     *
     * @param actor vk user actor
     * @param ownersIds List of sources IDs
     * @return query
     */
    @ApiMethod("stories.banOwner")
    public StoriesBanOwnerQuery banOwner(UserActor actor, Long... ownersIds) {
        return new StoriesBanOwnerQuery(getClient(), actor, ownersIds);
    }

    /**
     * Allows to hide stories from chosen sources from current user's feed.
     *
     * @param actor vk user actor
     * @param ownersIds List of sources IDs
     * @return query
     */
    @ApiMethod("stories.banOwner")
    public StoriesBanOwnerQuery banOwner(UserActor actor, List<Long> ownersIds) {
        return new StoriesBanOwnerQuery(getClient(), actor, ownersIds);
    }

    /**
     * Allows to hide stories from chosen sources from current user's feed.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("stories.banOwner")
    public StoriesBanOwnerQuery banOwner(UserActor actor) {
        return new StoriesBanOwnerQuery(getClient(), actor);
    }

    /**
     * Allows to delete story.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.delete")
    public StoriesDeleteQuery delete(UserActor actor) {
        return new StoriesDeleteQuery(getClient(), actor);
    }

    /**
     * Allows to delete story.
     *
     * @param actor vk group actor
     * @return query
     */
    @ApiMethod("stories.delete")
    public StoriesDeleteQuery delete(GroupActor actor) {
        return new StoriesDeleteQuery(getClient(), actor);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.get")
    public StoriesGetQueryWithV5113 getV5113(UserActor actor) {
        return new StoriesGetQueryWithV5113(getClient(), actor);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk group actor
     * @return query
     */
    @ApiMethod("stories.get")
    public StoriesGetQueryWithV5113 getV5113(GroupActor actor) {
        return new StoriesGetQueryWithV5113(getClient(), actor);
    }

    /**
     * Returns list of sources hidden from current user's feed.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.getBanned")
    public StoriesGetBannedQuery getBanned(UserActor actor) {
        return new StoriesGetBannedQuery(getClient(), actor);
    }

    /**
     * Returns list of sources hidden from current user's feed.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.getBanned")
    public StoriesGetBannedQueryWithExtended getBannedExtended(UserActor actor) {
        return new StoriesGetBannedQueryWithExtended(getClient(), actor);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk user actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    @ApiMethod("stories.getById")
    public StoriesGetByIdQueryWithExtended getByIdExtended(UserActor actor, String... stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk user actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    @ApiMethod("stories.getById")
    public StoriesGetByIdQueryWithExtended getByIdExtended(UserActor actor, List<String> stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk group actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    @ApiMethod("stories.getById")
    public StoriesGetByIdQueryWithExtended getByIdExtended(GroupActor actor, String... stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * Returns story by its ID.
     *
     * @param actor vk group actor
     * @param stories Stories IDs separated by commas. Use format {owner_id}+'_'+{story_id}, for example, 12345_54331.
     * @return query
     */
    @ApiMethod("stories.getById")
    public StoriesGetByIdQueryWithExtended getByIdExtended(GroupActor actor, List<String> stories) {
        return new StoriesGetByIdQueryWithExtended(getClient(), actor, stories);
    }

    /**
     * @param actor vk user actor
     * @param ownerId
     * @param storyId
     * @return query
     */
    @ApiMethod("stories.getDetailedStats")
    public StoriesGetDetailedStatsQueryWithV5200 getDetailedStatsV5200(UserActor actor,
            Long ownerId, Integer storyId) {
        return new StoriesGetDetailedStatsQueryWithV5200(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns URL for uploading a story with photo.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.getPhotoUploadServer")
    public StoriesGetPhotoUploadServerQuery getPhotoUploadServer(UserActor actor) {
        return new StoriesGetPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns URL for uploading a story with photo.
     *
     * @param actor vk group actor
     * @return query
     */
    @ApiMethod("stories.getPhotoUploadServer")
    public StoriesGetPhotoUploadServerQuery getPhotoUploadServer(GroupActor actor) {
        return new StoriesGetPhotoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns replies to the story.
     *
     * @param actor vk user actor
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.getReplies")
    public StoriesGetRepliesQueryWithV5113 getRepliesV5113(UserActor actor, Long ownerId,
            Integer storyId) {
        return new StoriesGetRepliesQueryWithV5113(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns replies to the story.
     *
     * @param actor vk group actor
     * @param ownerId Story owner ID.
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.getReplies")
    public StoriesGetRepliesQueryWithV5113 getRepliesV5113(GroupActor actor, Long ownerId,
            Integer storyId) {
        return new StoriesGetRepliesQueryWithV5113(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk user actor
     * @param ownerId Story owner ID. 
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.getStats")
    public StoriesGetStatsQuery getStats(UserActor actor, Long ownerId, Integer storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("stories.getStats")
    public StoriesGetStatsQuery getStats(UserActor actor) {
        return new StoriesGetStatsQuery(getClient(), actor);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk group actor
     * @param ownerId Story owner ID. 
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.getStats")
    public StoriesGetStatsQuery getStats(GroupActor actor, Long ownerId, Integer storyId) {
        return new StoriesGetStatsQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Returns stories available for current user.
     *
     * @param actor vk group actor
     * @return only actor query 
     */
    @ApiMethod("stories.getStats")
    public StoriesGetStatsQuery getStats(GroupActor actor) {
        return new StoriesGetStatsQuery(getClient(), actor);
    }

    /**
     * Allows to receive URL for uploading story with video.
     *
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.getVideoUploadServer")
    public StoriesGetVideoUploadServerQuery getVideoUploadServer(UserActor actor) {
        return new StoriesGetVideoUploadServerQuery(getClient(), actor);
    }

    /**
     * Allows to receive URL for uploading story with video.
     *
     * @param actor vk group actor
     * @return query
     */
    @ApiMethod("stories.getVideoUploadServer")
    public StoriesGetVideoUploadServerQuery getVideoUploadServer(GroupActor actor) {
        return new StoriesGetVideoUploadServerQuery(getClient(), actor);
    }

    /**
     * Returns a list of story viewers.
     *
     * @param actor vk user actor
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.getViewers")
    public StoriesGetViewersQueryWithExtendedV5115 getViewersExtendedV5115(UserActor actor,
            Integer storyId) {
        return new StoriesGetViewersQueryWithExtendedV5115(getClient(), actor, storyId);
    }

    /**
     * Returns a list of story viewers.
     *
     * @param actor vk group actor
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.getViewers")
    public StoriesGetViewersQueryWithExtendedV5115 getViewersExtendedV5115(GroupActor actor,
            Integer storyId) {
        return new StoriesGetViewersQueryWithExtendedV5115(getClient(), actor, storyId);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     *
     * @param actor vk user actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @return query
     */
    @ApiMethod("stories.hideAllReplies")
    public StoriesHideAllRepliesQuery hideAllReplies(UserActor actor, Long ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("stories.hideAllReplies")
    public StoriesHideAllRepliesQuery hideAllReplies(UserActor actor) {
        return new StoriesHideAllRepliesQuery(getClient(), actor);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     *
     * @param actor vk group actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @return query
     */
    @ApiMethod("stories.hideAllReplies")
    public StoriesHideAllRepliesQuery hideAllReplies(GroupActor actor, Long ownerId) {
        return new StoriesHideAllRepliesQuery(getClient(), actor, ownerId);
    }

    /**
     * Hides all replies in the last 24 hours from the user to current user's stories.
     *
     * @param actor vk group actor
     * @return only actor query 
     */
    @ApiMethod("stories.hideAllReplies")
    public StoriesHideAllRepliesQuery hideAllReplies(GroupActor actor) {
        return new StoriesHideAllRepliesQuery(getClient(), actor);
    }

    /**
     * Hides the reply to the current user's story.
     *
     * @param actor vk user actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.hideReply")
    public StoriesHideReplyQuery hideReply(UserActor actor, Long ownerId, Integer storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Hides the reply to the current user's story.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("stories.hideReply")
    public StoriesHideReplyQuery hideReply(UserActor actor) {
        return new StoriesHideReplyQuery(getClient(), actor);
    }

    /**
     * Hides the reply to the current user's story.
     *
     * @param actor vk group actor
     * @param ownerId ID of the user whose replies should be hidden.
     * @param storyId Story ID.
     * @return query
     */
    @ApiMethod("stories.hideReply")
    public StoriesHideReplyQuery hideReply(GroupActor actor, Long ownerId, Integer storyId) {
        return new StoriesHideReplyQuery(getClient(), actor, ownerId, storyId);
    }

    /**
     * Hides the reply to the current user's story.
     *
     * @param actor vk group actor
     * @return only actor query 
     */
    @ApiMethod("stories.hideReply")
    public StoriesHideReplyQuery hideReply(GroupActor actor) {
        return new StoriesHideReplyQuery(getClient(), actor);
    }

    /**
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.save")
    public StoriesSaveQuery save(UserActor actor) {
        return new StoriesSaveQuery(getClient(), actor);
    }

    /**
     * @param actor vk group actor
     * @return query
     */
    @ApiMethod("stories.save")
    public StoriesSaveQuery save(GroupActor actor) {
        return new StoriesSaveQuery(getClient(), actor);
    }

    /**
     * @param actor vk user actor
     * @return query
     */
    @ApiMethod("stories.search")
    public StoriesSearchQueryWithV5113 searchV5113(UserActor actor) {
        return new StoriesSearchQueryWithV5113(getClient(), actor);
    }

    /**
     * @param actor vk service actor
     * @param accessKey
     * @return query
     */
    @ApiMethod("stories.sendInteraction")
    public StoriesSendInteractionQuery sendInteraction(ServiceActor actor, String accessKey) {
        return new StoriesSendInteractionQuery(getClient(), actor, accessKey);
    }

    /**
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("stories.sendInteraction")
    public StoriesSendInteractionQuery sendInteraction(ServiceActor actor) {
        return new StoriesSendInteractionQuery(getClient(), actor);
    }

    /**
     * Allows to show stories from hidden sources in current user's feed.
     *
     * @param actor vk user actor
     * @param ownersIds List of hidden sources to show stories from.
     * @return query
     */
    @ApiMethod("stories.unbanOwner")
    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, Long... ownersIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, ownersIds);
    }

    /**
     * Allows to show stories from hidden sources in current user's feed.
     *
     * @param actor vk user actor
     * @param ownersIds List of hidden sources to show stories from.
     * @return query
     */
    @ApiMethod("stories.unbanOwner")
    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor, List<Long> ownersIds) {
        return new StoriesUnbanOwnerQuery(getClient(), actor, ownersIds);
    }

    /**
     * Allows to show stories from hidden sources in current user's feed.
     *
     * @param actor vk user actor
     * @return only actor query 
     */
    @ApiMethod("stories.unbanOwner")
    public StoriesUnbanOwnerQuery unbanOwner(UserActor actor) {
        return new StoriesUnbanOwnerQuery(getClient(), actor);
    }
}
